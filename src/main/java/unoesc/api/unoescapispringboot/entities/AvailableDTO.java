package unoesc.api.unoescapispringboot.entities;

import java.util.List;

public class AvailableDTO {
    private List<String> stocks;

    public AvailableDTO() {}

    public AvailableDTO(List<String> stocks) {
        this.stocks = stocks;
    }

    public List<String> getStocks() {
        return stocks;
    }

    public void setStocks(List<String> stocks) {
        this.stocks = stocks;
    }
}