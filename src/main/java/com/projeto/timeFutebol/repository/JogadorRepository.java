package com.projeto.timeFutebol.repository;

import com.projeto.timeFutebol.model.Jogador;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JogadorRepository extends CrudRepository<Jogador, long> {

    List<Jogador> findByName(String nome);

}
