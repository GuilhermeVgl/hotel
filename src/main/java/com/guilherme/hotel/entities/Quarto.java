package com.guilherme.hotel.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "quarto")
public class Quarto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idquarto")
    private Integer id;
    @Column(name = "nome_quarto")
    private Integer numeroDoQuarto;
    @Column(name = "andar_quarto")
    private Integer andarQuarto;

    @ManyToOne
    @JoinColumn(name = "tipo_quarto")
    private TipoQuarto tipoQuarto;

    @Column(name = "valor_diaria")
    private Double valorDiaria;

    @Column(name = "capacidade_pessoas")
    private Integer capacidadePessoas;

}
