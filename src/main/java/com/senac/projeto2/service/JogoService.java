package com.senac.projeto2.service;

import com.senac.projeto2.entity.Jogo;
import com.senac.projeto2.repository.JogoRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class JogoService {

    private final JogoRepository jogoRepository;

    public JogoService(JogoRepository jogoRepository) {
        this.jogoRepository = jogoRepository;
    }

    public List<Jogo> listarJogo(){
        return this.jogoRepository.findAll();
    }

    public Jogo listarJogoPorId(int idCategoria){
        return this.jogoRepository.findById(idCategoria).orElse(null);
    }



}
