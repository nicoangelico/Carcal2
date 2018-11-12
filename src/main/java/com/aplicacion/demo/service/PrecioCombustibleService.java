package com.aplicacion.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aplicacion.demo.model.PrecioCombustible;
import com.aplicacion.demo.repository.PrecioCombustibleRepository;

@Service
public class PrecioCombustibleService {
	
	@Autowired
	private PrecioCombustibleRepository precioCombustibleRepository;
	
	public void savePrecio(PrecioCombustible precio) {
		precioCombustibleRepository.save(precio);
	}

}
