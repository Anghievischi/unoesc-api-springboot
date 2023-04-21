package unoesc.api.unoescapispringboot.entities;

import java.time.LocalDateTime;

public class CotacaoDTO {
    private Double cotacao;
    private Double valorMercado;
    private Long volumeTransacoes;
    private String moeda;
    private LocalDateTime data;

    public CotacaoDTO() {
        
    }
     // construtor, getters e setters

    public Double getCotacao() {
        return cotacao;
    }

    public void setCotacao(Double cotacao) {
        this.cotacao = cotacao;
    }

    public Double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(Double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public Long getVolumeTransacoes() {
        return volumeTransacoes;
    }

    public void setVolumeTransacoes(Long volumeTransacoes) {
        this.volumeTransacoes = volumeTransacoes;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

   
}