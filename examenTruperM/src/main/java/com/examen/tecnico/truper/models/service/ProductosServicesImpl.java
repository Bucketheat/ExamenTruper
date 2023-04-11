package com.examen.tecnico.truper.models.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examen.tecnico.truper.models.entity.Productos;
import com.examen.tecnico.truper.models.repository.ProductosRepository;


@Service
public class ProductosServicesImpl  implements ProductosService{
	
	
	@Autowired
	private ProductosRepository repository;

	@Override
	@Transactional
	public Productos save(Productos productos) {
		// TODO Auto-generated method stub
		return repository.save(productos);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Productos> findById(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

}
