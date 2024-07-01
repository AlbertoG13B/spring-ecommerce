package com.alberto.ecommerce.models;

import java.io.Serializable;
import java.util.Date;

public class Orden implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String numero;
	private Date fechaCreacion;
	private Date fechaRecepcion;
	private double total;

	public Orden() {
		super();
	}

	public Orden(Integer id, String numero, Date fechaCreacion, Date fechaRecepcion, double total) {
		super();
		this.id = id;
		this.numero = numero;
		this.fechaCreacion = fechaCreacion;
		this.fechaRecepcion = fechaRecepcion;
		this.total = total;
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

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaRecepcion() {
		return fechaRecepcion;
	}

	public void setFechaRecepcion(Date fechaRecepcion) {
		this.fechaRecepcion = fechaRecepcion;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
