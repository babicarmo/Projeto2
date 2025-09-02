package com.senac.projeto2.service;

import com.senac.projeto2.entity.Premio;
import com.senac.projeto2.repository.PremioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PremioService {

    private final PremioRepository premioRepository;

    public PremioService(PremioRepository premioRepository) {
        this.premioRepository = premioRepository;
    }

    public Premio listarPremioPorId(Integer idPremio) {
        return this.premioRepository.findById(idPremio).orElse(null);
    }

    public List<Premio> listarPremio() {
        return this.premioRepository.findAll();
    }
}
