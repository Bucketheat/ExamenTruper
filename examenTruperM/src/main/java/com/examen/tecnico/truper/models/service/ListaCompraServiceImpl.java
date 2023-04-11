package com.examen.tecnico.truper.models.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examen.tecnico.truper.models.entity.ListaCompra;
import com.examen.tecnico.truper.models.repository.ListaCompraRepository;


@Service
public class ListaCompraServiceImpl implements ListaCompraService {
	
	
	@Autowired
	private ListaCompraRepository repository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<ListaCompra> findAll() { 
		return repository.findAll();
	}

	@Override
	@Transactional
	public ListaCompra save(ListaCompra listaCompra) { 
		return repository.save(listaCompra);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<ListaCompra> findById(Integer id) { 
		return repository.findById(id);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) { 
		repository.deleteById(id);
	}

}
