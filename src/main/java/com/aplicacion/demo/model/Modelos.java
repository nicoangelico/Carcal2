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
    private double consumoRuta;
    private double consumoCiudad;
    private int combustible;   		//1. nafta, 2 diesel, 3 hibirdo
    
    public Modelos() {
    	
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

	public int getCombustible() {
		return combustible;
	}

	public void setCombustible(int combustible) {
		this.combustible = combustible;
	}

	public double getConsumoRuta() {
		return consumoRuta;
	}

	public void setConsumoRuta(double consumoRuta) {
		this.consumoRuta = consumoRuta;
	}

	public double getConsumoCiudad() {
		return consumoCiudad;
	}

	public void setConsumoCiudad(double consumoCiudad) {
		this.consumoCiudad = consumoCiudad;
	}
       
	
}
