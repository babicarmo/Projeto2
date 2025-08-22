package com.senac.projeto2.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="premio")
public class Premio {
    @Id
    @GeneratedValue
    @Column(name="premio_id", nullable = false, length = 11)
    private int id;
    @Column(name="premio_descricao", nullable = false, length = 300)
    private String descricao;
    @Column(name="premio_ordem_premiacao", nullable = false, length = 11)
    private String premiacao;
    @Column(name="premio_categoria", nullable = false, length = 11)
    private LocalDate categoria;
    @Column(name="premio_status", nullable = false, length = 11)
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPremiacao() {
        return premiacao;
    }

    public void setPremiacao(String premiacao) {
        this.premiacao = premiacao;
    }

    public LocalDate getCategoria() {
        return categoria;
    }

    public void setCategoria(String Categoria) {
        this.categoria = categoria;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
