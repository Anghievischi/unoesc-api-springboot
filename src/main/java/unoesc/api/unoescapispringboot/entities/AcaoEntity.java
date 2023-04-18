package unoesc.api.unoescapispringboot.entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.google.common.collect.Tables;

@EntityScan
Tables(name = "acao")
public class AcaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String simbolo;

    private String nome;

    public AcaoEntity() {}

    public AcaoEntity(String simbolo, String nome) {
        this.simbolo = simbolo;
        this.nome = nome;
    }

    // getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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