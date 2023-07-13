package com.projeto.timeFutebol.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name = "JOGADOR")
public class Jogador {

    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true)
    private long id;

    @NotBlank(message = "Digite o nome do jogador")
    @Column(name = "NOME")
    private String nome;

    @NotBlank(message = "Defina uma o mais posição do jogador")
    @Column(name = "POSICAO")
    private ArrayList<Enum> posicao;

    @NotBlank(message = "Digite a idade do jogador")
    @Column(name = "IDADE")
    private int idade;

    @Column(name = "CLUBE")
    private Clube clube;

}
