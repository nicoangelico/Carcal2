package com.aplicacion.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aplicacion.demo.model.Marcas;
import com.aplicacion.demo.service.MarcasService;

@RestController
public class MarcasController {
	
	@Autowired
	private MarcasService marcasService;
	
  
    @RequestMapping(value="/marcas", method=RequestMethod.GET)
    @ResponseBody
	public List<Marcas> getAllMarcas(){
		return marcasService.getAllMarcas();
	}
    
    @RequestMapping(value="/marcas/{id}", method=RequestMethod.GET)
    @ResponseBody
	public Marcas getMarca(@PathVariable("id") int id){
		return marcasService.getMarcasById(id);
	}
    
    //revivi!!
}
