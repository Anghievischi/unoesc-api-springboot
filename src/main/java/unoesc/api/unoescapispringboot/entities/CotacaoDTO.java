package unoesc.api.unoescapispringboot.entities;

import java.time.LocalDateTime;

public class CotacaoDTO {
    private Double regularMarketPrice;
    private Double marketCap;
    private Long regularMarketVolume;
    private String currency;
    private LocalDateTime regularMarketTime;

    public Double getRegularMarketPrice() {
        return regularMarketPrice;
    }

    public void setRegularMarketPrice(Double regularMarketPrice) {
        this.regularMarketPrice = regularMarketPrice;
    }

    public Double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(Double marketCap) {
        this.marketCap = marketCap;
    }

    public Long getRegularMarketVolume() {
        return regularMarketVolume;
    }

    public void setRegularMarketVolume(Long regularMarketVolume) {
        this.regularMarketVolume = regularMarketVolume;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public LocalDateTime getRegularMarketTime() {
        return regularMarketTime;
    }

    public void setRegularMarketTime(LocalDateTime regularMarketTime) {
        this.regularMarketTime = regularMarketTime;
    }

  
}