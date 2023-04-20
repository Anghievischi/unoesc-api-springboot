package unoesc.api.unoescapispringboot.service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.eclipse.jetty.http.HttpMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import unoesc.api.unoescapispringboot.entities.AcaoDTO;
import unoesc.api.unoescapispringboot.entities.CotacaoDTO;

@Service
public class AcaoCotacaoService {

    @Autowired
    private RestTemplate restTemplate;

    public List<AcaoDTO> getAcoes() {
        String url = "https://brapi.dev/api/available";
        ResponseEntity<Map<String, Object>> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<Map<String, Object>>() {});
        Map<String, Object> responseMap = responseEntity.getBody();

        List<AcaoDTO> acoes = new ArrayList<>();
        List<String> simbolos = (List<String>) responseMap.get("stocks");
        for (String simbolo : simbolos) {
            AcaoDTO acao = new AcaoDTO();
            acao.setSimbolo(simbolo);
            acoes.add(acao);
        }
        return acoes;
    }

    public CotacaoDTO getCotacao(String simbolo) {
        String url = "https://brapi.dev/api/quote/{simbolo}";
        Map<String, String> params = new HashMap<>();
        params.put("simbolo", simbolo);
        ResponseEntity<Map<String, Object>> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<Map<String, Object>>() {}, params);
        Map<String, Object> responseMap = responseEntity.getBody();

        CotacaoDTO cotacao = new CotacaoDTO();
        cotacao.setCotacao(Double.parseDouble(responseMap.get("regularMarketPrice").toString()));
        cotacao.setValorMercado(Double.parseDouble(responseMap.get("marketCap").toString()));
        cotacao.setVolumeTransacoes(Long.parseLong(responseMap.get("regularMarketVolume").toString()));
        cotacao.setMoeda(responseMap.get("currency").toString());

        String dateStr = responseMap.get("regularMarketTime").toString();
        LocalDateTime data = LocalDateTime.ofInstant(Instant.ofEpochMilli(Long.parseLong(dateStr)), ZoneId.systemDefault());
        cotacao.setData(data);

        return cotacao;
    }
}