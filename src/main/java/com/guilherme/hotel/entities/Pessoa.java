package com.guilherme.hotel.entities;


import jakarta.persistence.*;

import java.util.Date;
@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 100)
    private String nome;
    @Column(length = 70)
    private String endereco;
    @Column(length = 9)
    private String cep;
    @Column(length = 70)
    private String bairro;
    @Column(length = 70)
    private String cidade;
    @Column(length = 2)
    private String UF;
    @Column(length = 50)
    private String email;
    @Column(length = 15)
    private String telefone;

    @Column(name = "data_nascimento")
    private Date dataNascimento;
    @Column(length = 9)
    private String rg;
    @Column(length = 14)
    private String cpf;

    public Pessoa() { }

    public Pessoa(
            String nome,
            String endereco,
            String cep,
            String bairro,
            String cidade,
            String UF,
            String email,
            String telefone,
            Date dataNascimento,
            String rg,
            String cpf)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.UF = UF;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
