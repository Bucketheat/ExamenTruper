package com.examen.tecnico.truper.models.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.tecnico.truper.models.entity.ListaCompra;
import com.examen.tecnico.truper.models.entity.ListaCompraDetalle; 
import com.examen.tecnico.truper.models.repository.ListaCompraDetalleRepository;



@Service
public class ListaCompraDetalleImpl implements ListaCompraDetalleService {
	
	
	@Autowired
	private ListaCompraDetalleRepository repository;

	@Override
	public Iterable<ListaCompraDetalle> findAll() {
		 
		return repository.findAll();
	}

	@Override
	public Optional<ListaCompraDetalle> findById( ListaCompra idListaCompra) {
		// TODO Auto-generated method stub
		return repository.findById(idListaCompra.getIdLista());
	}

	@Override
	public ListaCompraDetalle save(ListaCompraDetalle listaCompraDetalle) {
		// TODO Auto-generated method stub
		return repository.save(listaCompraDetalle);
	}

}
