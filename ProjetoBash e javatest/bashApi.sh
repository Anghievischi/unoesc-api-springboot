#!/bin/bash

# Faz a requisição HTTP para o endpoint /api/available do BRAPI e salva os dados em um arquivo JSON
curl -X GET "https://brapi.dev/api/available" -o available.json

# Obtém a lista de símbolos do arquivo JSON
symbols=$(jq -r '.stocks[]' available.json)

# Loop pelos símbolos
for symbol in $symbols
do
    # Faz a requisição HTTP para o endpoint /api/quote com o símbolo atual e salva os dados em um arquivo JSON
    curl -X GET "https://brapi.dev/api/quote/${symbol}" -o dados.json

    # Converte o arquivo JSON para um formato legível pelo PostgreSQL e remove as chaves que não são necessárias
    acao=$(jq -r --arg sym "$symbol" '[.results[0].symbol, .results[0].shortName] | @csv' dados.json)

    # Cria um arquivo CSV temporário com as informações da ação
    echo "$acao" > "acao_${symbol}.csv"

    # Conecta-se ao banco de dados PostgreSQL e insere os dados na tabela Acao
    PGPASSWORD=123 psql -h localhost -U didi -d projeto-bash -c "\copy acao(simbolo, nome) FROM 'acao_${symbol}.csv' CSV DELIMITER ','"

    # Remove o arquivo CSV temporário da ação
    rm "acao_${symbol}.csv"

    # Seleciona o idacao correspondente ao símbolo atual
    PGPASSWORD=123 psql -t -A -h localhost -U didi -d projeto-bash -c "SELECT idacao FROM acao WHERE simbolo='${symbol}' ORDER BY idacao DESC LIMIT 1;" > "idacao_${symbol}.txt"

    # Obtém o idacao retornado pelo banco de dados
    idacao=$(cat "idacao_${symbol}.txt")

    #Utiliza o comando jq para extrair informações de um arquivo JSON chamado "dados.json" e armazená-las na variável "cotacao".
    cotacao=$(jq -r --arg sym "$symbol" --arg idacao "$idacao" '[.results[0].regularMarketPrice, .results[0].marketCap, .results[0].regularMarketVolume, .results[0].currency, .results[0].regularMarketTime ] | @csv' dados.json)

    # Adiciona o idacao no início da linha
    echo "${idacao},${cotacao}" > "cotacao_${symbol}.csv"

    # Conecta-se ao banco de dados PostgreSQL e insere os dados na tabela Cotacao
    PGPASSWORD=123 psql -h localhost -U didi -d projeto-bash -c "\copy cotacao(idacao, cotacao, valormercado, volumetransacoes, moeda, data) FROM 'cotacao_${symbol}.csv' CSV DELIMITER ','"

    # Remove o arquivo CSV temporário da cotação
    rm "cotacao_${symbol}.csv"

    # Remove o arquivo txt temporário do idacao
    rm "idacao_${symbol}.txt"

done