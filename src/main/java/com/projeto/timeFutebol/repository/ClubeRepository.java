package com.projeto.timeFutebol.repository;

import com.projeto.timeFutebol.model.Clube;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClubeRepository extends CrudRepository<Clube, long> {

    List<Clube> findByName(String nome);

}
