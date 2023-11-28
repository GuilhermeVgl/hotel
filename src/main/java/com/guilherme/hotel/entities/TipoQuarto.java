package com.guilherme.hotel.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_quarto")
public class TipoQuarto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipo_quarto")
    private Integer id;

    private String descricao;

    public TipoQuarto() {}

    public TipoQuarto(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
