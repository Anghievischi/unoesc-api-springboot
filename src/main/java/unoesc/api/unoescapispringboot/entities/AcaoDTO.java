package unoesc.api.unoescapispringboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "acao")
public class AcaoDTO {
    private String simbolo;
    private String nome;

    // construtor, getters e setters
}