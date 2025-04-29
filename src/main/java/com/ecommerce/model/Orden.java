package com.ecommerce.model;

import java.util.Date;

public class Orden {

	private Integer id;
	private String numero;
	private Date fechacreacion;
	private Date fechaRecibida;
	private double Total;

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

@Override
public String toString() {
	return "Orden [id=" + id + ", numero=" + numero + ", fechacreacion=" + fechacreacion + ", fechaRecibida="
			+ fechaRecibida + ", Total=" + Total + "]";
	}
}
