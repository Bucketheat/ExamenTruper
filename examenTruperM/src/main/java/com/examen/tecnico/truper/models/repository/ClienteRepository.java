package com.examen.tecnico.truper.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.examen.tecnico.truper.models.entity.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
