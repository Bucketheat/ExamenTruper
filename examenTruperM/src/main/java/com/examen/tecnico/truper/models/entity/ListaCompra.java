package com.examen.tecnico.truper.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

 


@Entity
@Table(name="lista_compra")
public class ListaCompra {
	
	
	@Id
	@Column(nullable = false)
	private Integer idLista;
	
	@ManyToOne
	@JoinColumn(name = "idCliente")
	private Cliente customerId;
	
	
	
	private Date fechaRegistro;
	
	private Date fechaUltimaActualizacion;
	
	private int activo;
	
	@PrePersist
	public void prePersit() {
		this.fechaRegistro = new Date();
	}
	

	public int getIdLista() {
		return idLista;
	}

	public void setIdLista(int idLista) {
		this.idLista = idLista;
	}

	public Cliente getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Cliente customerId) {
		this.customerId = customerId;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getFechaUltimaActualizacion() {
		return fechaUltimaActualizacion;
	}

	public void setFechaUltimaActualizacion(Date fechaUltimaActualizacion) {
		this.fechaUltimaActualizacion = fechaUltimaActualizacion;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}
	
	
	

}
