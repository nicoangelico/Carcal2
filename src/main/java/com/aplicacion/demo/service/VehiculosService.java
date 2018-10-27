package com.aplicacion.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aplicacion.demo.model.Vehiculos;
import com.aplicacion.demo.repository.VehiculoRepository;;

@Service
public class VehiculosService {
	
	@Autowired
	private VehiculoRepository vehiculoRepository;
	
	public List<Vehiculos> getAllVehiculos(){
		return vehiculoRepository.findAll();
	}
	
	public Vehiculos getVehiculosById(int id){
		return vehiculoRepository.findOne(id);
	}
	
	public List<Vehiculos> getVehiculosByModeloId(long id){
		return vehiculoRepository.findByModelo(id);
	}
}
