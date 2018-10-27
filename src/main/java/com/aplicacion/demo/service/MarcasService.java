package com.aplicacion.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aplicacion.demo.model.Marcas;
import com.aplicacion.demo.repository.MarcasRepository;

@Service
public class MarcasService {

	@Autowired
	private MarcasRepository marcasRepository;
	
	public List<Marcas> getAllMarcas(){
		return marcasRepository.findAll();
	}
	
	public Marcas getMarcasById(long id){
		return marcasRepository.findOne(id);
	}
	
	public Marcas saveMarcas(Marcas marcas){
		return marcasRepository.save(marcas);
	}
	
	public void removeMarcas(Marcas marcas){
		marcasRepository.delete(marcas);
	}
	
}
