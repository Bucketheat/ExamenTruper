package com.examen.tecnico.truper.models.service;

import java.util.Optional;

import com.examen.tecnico.truper.models.entity.Productos;

public interface ProductosService {
	
	
	
	public Productos save(Productos productos);
	
	public Optional<Productos> findById(Integer id);

}
