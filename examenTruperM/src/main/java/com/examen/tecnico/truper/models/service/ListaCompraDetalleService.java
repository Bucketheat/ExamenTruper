package com.examen.tecnico.truper.models.service;

import java.util.Optional;

import com.examen.tecnico.truper.models.entity.ListaCompra;
import com.examen.tecnico.truper.models.entity.ListaCompraDetalle;
import com.examen.tecnico.truper.models.entity.Productos;

public interface ListaCompraDetalleService {
	
	
	public Iterable<ListaCompraDetalle> findAll();
	
	public Optional<ListaCompraDetalle> findById(ListaCompra idListaCompra);
	
	
	public ListaCompraDetalle save(ListaCompraDetalle listaCompraDetalle);
	 

}
