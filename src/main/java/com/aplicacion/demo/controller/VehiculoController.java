package com.aplicacion.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aplicacion.demo.model.Vehiculos;
import com.aplicacion.demo.service.VehiculosService;

@RestController
public class VehiculoController {
	
	@Autowired
	private VehiculosService vehiculosServices;
	
	@RequestMapping("/vehiculos")
	@ResponseBody
	public List<Vehiculos> getAllVehiculos(){
		return vehiculosServices.getAllVehiculos();
	}
	
	@RequestMapping("/vehiculo/{id}")
	@ResponseBody
	public Vehiculos getVehiculos(@PathVariable("id") int id){
		return vehiculosServices.getVehiculosById(id);
	}
	
	@RequestMapping("/vehiculosmodelo/{id}")
	@ResponseBody
	public List<Vehiculos> getVehiculosModelo(@PathVariable("id") int id){
		return vehiculosServices.getVehiculosByModeloId(id);
	}
}
