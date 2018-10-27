package com.aplicacion.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Marcas {
	
	@Id
	private long marcaid;
    private String nombre;
	
    public Marcas(int marcaid, String nombre) {
		this.marcaid = marcaid;
		this.nombre = nombre;
	}

	public Marcas() {
		super();
	}

	public long getMarcaid() {
		return marcaid;
	}
	
    public void setMarcaid(long marcaid) {
		this.marcaid = marcaid;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Marcas [marcaid=" + marcaid + ", nombre=" + nombre + "]";
	}
	
    
}
