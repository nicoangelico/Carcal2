package com.aplicacion.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PrecioCombustible {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idPrecio;
	private double longitud;
	private double latitud;
	private int fecha;
	private double precio;
	public int getIdPrecio() {
		return idPrecio;
	}
	public void setIdPrecio(int idPrecio) {
		this.idPrecio = idPrecio;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public int getFecha() {
		return fecha;
	}
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
