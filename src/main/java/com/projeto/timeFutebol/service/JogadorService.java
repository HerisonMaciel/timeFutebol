package com.projeto.timeFutebol.service;

import com.projeto.timeFutebol.model.Jogador;
import com.projeto.timeFutebol.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JogadorService {

    @Autowired
    private JogadorRepository jogadorRepository;

    public Jogador save(Jogador jogador){
        return jogadorRepository.save(jogador);
    }

}
