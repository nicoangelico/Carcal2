package com.aplicacion.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aplicacion.demo.model.Vehiculos;;

public interface VehiculoRepository extends JpaRepository<Vehiculos, Integer>{

	List<Vehiculos> findByModelo(long modelo);
}
