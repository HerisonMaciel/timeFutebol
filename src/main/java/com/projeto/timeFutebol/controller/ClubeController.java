package com.projeto.timeFutebol.controller;

import com.projeto.timeFutebol.model.Jogador;
import com.projeto.timeFutebol.service.JogadorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clube")
public class ClubeController {

    @Autowired
    private JogadorService jogadorService;

    @PostMapping
    public ResponseEntity<?> save(@Valid @RequestBody Jogador jogador){
        return new ResponseEntity<>(jogadorService.save(jogador), HttpStatus.OK);
    }

}
