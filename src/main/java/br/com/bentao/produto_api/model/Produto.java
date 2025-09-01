package com.bentao.api_produtos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produtos {
    @Id
    @GeneratedValue(strategy = GenerationType.INDENTITY)
    private Long id;
    private String nome;
    private Double preco;

    public Produto() {}

    public Produto(String nome, Double preco) {}

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //Getters e Setters
    public Long getId() { return id; }
    public void setId(Long Id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Double getPreco() { return preco; }
    public void setPreco(Double preco) { this.preco = preco; } 
}