package com.aplicacion.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aplicacion.demo.model.Modelos;
import com.aplicacion.demo.repository.ModelosRepository;

@Service
public class ModelosService {

		@Autowired
		private ModelosRepository modelosRepository;
		
		public List<Modelos> getAllModelos(){
			return modelosRepository.findAll();
		}
		
		public Modelos getModelosById(Integer id){
			return modelosRepository.findOne(id);
		}
		
		public List<Modelos> getModelosByMarcaId(long id){
			return modelosRepository.findByMarca(id);
		}
		
		
}
