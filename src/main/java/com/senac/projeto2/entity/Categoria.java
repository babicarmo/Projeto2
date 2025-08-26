package com.senac.projeto2.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="categoria")
public class Categoria {
    @Id
    @GeneratedValue
    @Column(name="categoria_id", nullable = false, length = 11)
    private int id;
    @Column(name="categoria_nome", nullable = false, length = 30)
    private String nome;

    @Column(name="categoria_status", nullable = false, length = 11)
    private int status;
    @OneToMany(mappedBy = "jogo")
    private Set<Jogo> jogos;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
