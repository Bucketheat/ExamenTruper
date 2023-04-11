package com.examen.tecnico.truper.models.service;

import java.util.Optional;

import com.examen.tecnico.truper.models.entity.Cliente;

public interface ClienteService {

	public Cliente save(Cliente cliente);
	
	public Optional<Cliente> findById(Integer id);
	
	
}
