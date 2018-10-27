package com.aplicacion.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehiculos {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private long vehiculoid;
    private long modelo;
    private String nombre;
    private String imagen;
    private double consumociudad;
    private double consumoruta;
    private int ltstanque;
    private String fichaTecnica;
	
    public long getVehiculoid() {
		return vehiculoid;
	}
	public void setVehiculoid(long vehiculoid) {
		this.vehiculoid = vehiculoid;
	}
	public long getModelo() {
		return modelo;
	}
	public void setModelo(long modelo) {
		this.modelo = modelo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public double getConsumociudad() {
		return consumociudad;
	}
	public void setConsumociudad(double consumociudad) {
		this.consumociudad = consumociudad;
	}
	public double getConsumoruta() {
		return consumoruta;
	}
	public void setConsumoruta(double consumoruta) {
		this.consumoruta = consumoruta;
	}
	public int getLtstanque() {
		return ltstanque;
	}
	public void setLtstanque(int ltstanque) {
		this.ltstanque = ltstanque;
	}
	public String getFichaTecnica() {
		return fichaTecnica;
	}
	public void setFichaTecnica(String fichaTecnica) {
		this.fichaTecnica = fichaTecnica;
	}
	
    
}
