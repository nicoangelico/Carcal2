package com.aplicacion.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aplicacion.demo.model.Modelos;

public interface ModelosRepository extends JpaRepository<Modelos, Integer> {
	
	List<Modelos> findByMarca(long marca);
	
}
