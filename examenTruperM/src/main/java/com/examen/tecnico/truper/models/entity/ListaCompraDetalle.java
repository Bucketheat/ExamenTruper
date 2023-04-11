package com.examen.tecnico.truper.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "lista_compra_detalle")
public class ListaCompraDetalle   {
	
	 
		@Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	    @SequenceGenerator(name = "lista_compra_detalle_seq")
	    private Long id;
	 
	@Id
	@ManyToOne(targetEntity = Productos.class)
	@JoinColumn(name = "idProducto")
	private Productos idCodigoProducto;
	
	@Id
	@ManyToOne(targetEntity = ListaCompra.class)
	@JoinColumn(name = "idLista")
	private ListaCompra idListaCompra;
	
	private int cantidad;

	public Productos getIdCodigoProducto() {
		return idCodigoProducto;
	}

	public void setIdCodigoProducto(Productos idCodigoProducto) {
		this.idCodigoProducto = idCodigoProducto;
	}

	public ListaCompra getIdListaCompra() {
		return idListaCompra;
	}

	public void setIdListaCompra(ListaCompra idListaCompra) {
		this.idListaCompra = idListaCompra;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	

}
