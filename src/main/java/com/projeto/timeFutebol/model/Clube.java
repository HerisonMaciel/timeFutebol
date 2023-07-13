package com.projeto.timeFutebol.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@Entity
public class Clube {

    @Id
    @GeneratedValue
    private long id;
    @NotBlank(message = "Digite o nome do clube")
    private String nome;
    private ArrayList<Jogador> jogadores;

}
