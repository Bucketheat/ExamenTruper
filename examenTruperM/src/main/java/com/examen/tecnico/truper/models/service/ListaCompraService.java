package com.examen.tecnico.truper.models.service;

import java.util.Optional;
 
import com.examen.tecnico.truper.models.entity.ListaCompra;

public interface ListaCompraService {
	
	public Iterable<ListaCompra> findAll();
	
	public ListaCompra save(ListaCompra listaCompra);
	
	public Optional<ListaCompra> findById(Integer id);
	
	public void deleteById(Integer id);
	
	

}
