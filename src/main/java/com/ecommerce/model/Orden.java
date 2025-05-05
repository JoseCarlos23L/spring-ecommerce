package com.ecommerce.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="ordenes")
public class Orden {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String numero;
	private Date fechacreacion;
	private Date fechaRecibida;
	private double Total;
	
	@ManyToOne
	private Usuario usuario;
	
	
	@OneToOne(mappedBy = "orden")
	private DetalleOrden detalle;
	
	

public Orden() {
}

public Orden(Integer id, String numero, Date fechacreacion, Date fechaRecibida, double total) {
	super();
	this.id = id;
	this.numero = numero;
	this.fechacreacion = fechacreacion;
	this.fechaRecibida = fechaRecibida;
	Total = total;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getNumero() {
	return numero;
}

public void setNumero(String numero) {
	this.numero = numero;
}

public Date getFechacreacion() {
	return fechacreacion;
}

public void setFechacreacion(Date fechacreacion) {
	this.fechacreacion = fechacreacion;
}

public Date getFechaRecibida() {
	return fechaRecibida;
}

public void setFechaRecibida(Date fechaRecibida) {
	this.fechaRecibida = fechaRecibida;
}

public double getTotal() {
	return Total;
}

public void setTotal(double total) {
	Total = total;
}


public Usuario getUsuario() {
	return usuario;
}

public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}

public DetalleOrden getDetalle() {
	return detalle;
}

public void setDetalle(DetalleOrden detalle) {
	this.detalle = detalle;
}

@Override
public String toString() {
	return "Orden [id=" + id + ", numero=" + numero + ", fechacreacion=" + fechacreacion + ", fechaRecibida="
			+ fechaRecibida + ", Total=" + Total + "]";
	}
}
