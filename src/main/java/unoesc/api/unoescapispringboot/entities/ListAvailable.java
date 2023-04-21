package unoesc.api.unoescapispringboot.entities;

import java.util.List;

public class ListAvailable {
   private List<AcaoDTO> stocks ;

public List<AcaoDTO> getStocks() {
    return stocks;
}

public void setStocks(List<AcaoDTO> stocks) {
    this.stocks = stocks;
}

    public ListAvailable(List<AcaoDTO> stocks) {
        this.stocks = stocks;
    }

}
