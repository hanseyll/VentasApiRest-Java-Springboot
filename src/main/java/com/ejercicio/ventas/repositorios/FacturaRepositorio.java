package com.ejercicio.ventas.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ejercicio.ventas.modelos.Factura;

@Repository
public interface FacturaRepositorio extends JpaRepository<Factura,Long> {

@Query(
	value= "SELECT * FROM factura WHERE factura.id_cliente LIKE %:id%",
	nativeQuery = true
		)
List<Factura> searchNativo(@Param("id") long id);
}
