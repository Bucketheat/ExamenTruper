package com.examen.tecnico.truper.models.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examen.tecnico.truper.models.entity.Cliente;
import com.examen.tecnico.truper.models.repository.ClienteRepository;


@Service
public class ClienteServiceImp implements ClienteService {
	
	@Autowired
	private ClienteRepository repository;

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return repository.save(cliente);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Cliente> findById(Integer id) {

		return repository.findById(id);
	}

}
