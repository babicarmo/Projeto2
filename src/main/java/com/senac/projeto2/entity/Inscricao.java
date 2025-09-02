package com.senac.projeto2.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="inscricao")
public class Inscricao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="inscricao_id")
    private int id;
    @Column(name="inscricao_data")
    private LocalDateTime data;
    @Column(name="inscricao_status")
    private int status;

    @Transient
    @JsonProperty("idPartipante")
    public int getIdParcipante(){
        return participante !=null ? participante.getId() : null;
    };

    @Transient
    @JsonProperty("getNomeParcitipante")
    public String getNomeParticipante(){
        return participante !=null ? participante.getNome() : null;
    }

    @Transient
    @JsonProperty("idJogo")
    public int getId_jogo(){

        return jogo !=null ? jogo.getId() : null;
    }

    private int id_jogo;

    @ManyToOne
    @JoinColumn(name = "jogo_id", nullable = false)
    @JsonIgnore
    private Jogo jogo;

    @ManyToOne
    @JoinColumn(name = "participante_id", nullable = false)
    @JsonIgnore
    private Participante participante;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }
}