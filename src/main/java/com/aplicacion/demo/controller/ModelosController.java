package com.aplicacion.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aplicacion.demo.model.Modelos;
import com.aplicacion.demo.service.ModelosService;

@RestController
public class ModelosController {

	@Autowired
	private ModelosService modelosService;
	
	@RequestMapping("/modelos")
	@ResponseBody
	public Map<String, List<Modelos>> getAllModelos(){
		Map<String, List<Modelos>> response = new HashMap<String, List<Modelos>>();
    	response.put("modelos", modelosService.getAllModelos());
    	return response;
	}
	
	@RequestMapping("/modelo/{id}")
	@ResponseBody
	public Modelos getModelo(@PathVariable("id") int id){
		return modelosService.getModelosById(id);
	}
	
	@RequestMapping("/modelosmarca/{id}")
	@ResponseBody
	public Map<String, List<Modelos>> getModelosMarca(@PathVariable("id") int id){
		Map<String, List<Modelos>> response = new HashMap<String, List<Modelos>>();
		response.put("modelos", modelosService.getModelosByMarcaId(id));
		return response;
	}
	
}
