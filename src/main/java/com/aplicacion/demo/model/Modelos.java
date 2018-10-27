package com.aplicacion.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Modelos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long modeloid;
    private String nombre;
    private long marca;
    
    public Modelos() {
    	
    }

	public Modelos(int modeloid, String nombre, int marca) {
		this.modeloid = modeloid;
		this.nombre = nombre;
		this.marca = marca;
	}
	
	public long getModeloid() {
		return modeloid;
	}
	public void setModeloid(long modeloid) {
		this.modeloid = modeloid;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getMarca() {
		return marca;
	}
	public void setMarca(long marca) {
		this.marca = marca;
	}
    
    
	
}
