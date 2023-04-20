package unoesc.api.unoescapispringboot.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cotacao")
public class CotacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal cotacao;

    private BigDecimal valormercado;

    private BigDecimal volumetransacoes;

    private String moeda;

    private LocalDateTime date;

    public CotacaoEntity() {}

    public CotacaoEntity(BigDecimal cotacao, BigDecimal valormercado, BigDecimal volumetransacoes, String moeda, LocalDateTime date) {
        this.cotacao = cotacao;
        this.valormercado = valormercado;
        this.volumetransacoes = volumetransacoes;
        this.moeda = moeda;
        this.date = date;
    }

    // getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getCotacao() {
        return cotacao;
    }

    public void setCotacao(BigDecimal cotacao) {
        this.cotacao = cotacao;
    }

    public BigDecimal getValormercado() {
        return valormercado;
    }

    public void setValormercado(BigDecimal valormercado) {
        this.valormercado = valormercado;
    }

    public BigDecimal getVolumetransacoes() {
        return volumetransacoes;
    }

    public void setVolumetransacoes(BigDecimal volumetransacoes) {
        this.volumetransacoes = volumetransacoes;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setSymbol(Object symbol) {
    }

    public void setShortName(Object shortName) {
    }

    public void setRegularMarketPrice(Object regularMarketPrice) {
    }

    public void setMarketCap(Object marketCap) {
    }

    public void setCurrency(Object currency) {
    }
}
