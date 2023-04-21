package unoesc.api.unoescapispringboot.entities;


public class AcaoDTO {
    private String simbolo;
    private String nome;

    public AcaoDTO(){

    }

    // construtor, getters e setters
  

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

