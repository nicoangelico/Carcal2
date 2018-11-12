package com.aplicacion.demo.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aplicacion.demo.model.PrecioCombustible;
import com.aplicacion.demo.service.PrecioCombustibleService;

@RestController
public class CombustibleController {

	@Autowired
	private PrecioCombustibleService precioCombustibleService;
	
	@RequestMapping(value="/precio/", method=RequestMethod.POST)
    @ResponseBody
    public void getPrecio(@PathVariable("longitud") double longitud, @PathVariable("latitud") double latitud, @PathVariable("precio") double precio) {
		java.util.Date fecha = new Date();
		PrecioCombustible pC = new PrecioCombustible();
		pC.setLongitud(longitud);
		pC.setLatitud(latitud);
		pC.setPrecio(precio);
		pC.setFecha(fecha.getDate());
		precioCombustibleService.savePrecio(pC);
	}
	
	
}
