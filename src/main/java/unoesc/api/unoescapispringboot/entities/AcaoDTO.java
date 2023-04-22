package unoesc.api.unoescapispringboot.entities;


public class AcaoDTO {
    private String symbol;
    private String shortName;

    public AcaoDTO(){

    }

    // construtor, getters e setters
  

    public String getSimbolo() {
        return symbol;
    }

    public void setSimbolo(String symbol) {
        this.symbol = symbol;
    }

    public String getNome() {
        return shortName;
    }

    public void setNome(String shortName) {
        this.shortName = shortName;
    }
}

