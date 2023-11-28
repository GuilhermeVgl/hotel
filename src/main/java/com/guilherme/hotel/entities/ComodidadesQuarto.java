package com.guilherme.hotel.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "quarto_comodidades")
public class ComodidadesQuarto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idquarto_comodidades")
    private Integer id;

    private String descricao;

    public ComodidadesQuarto() { }

    public ComodidadesQuarto(Integer id, String descricao) {
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
