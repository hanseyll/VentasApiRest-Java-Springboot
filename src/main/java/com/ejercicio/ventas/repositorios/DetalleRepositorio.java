package com.ejercicio.ventas.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ejercicio.ventas.modelos.Detalle;

@Repository
public interface DetalleRepositorio extends JpaRepository<Detalle, Long> {
	@Query(value = "SELECT * FROM detalle WHERE detalle.num_factura LIKE %:id%", nativeQuery = true)
	List<Detalle> searchNativo(@Param("id") long id);
}
