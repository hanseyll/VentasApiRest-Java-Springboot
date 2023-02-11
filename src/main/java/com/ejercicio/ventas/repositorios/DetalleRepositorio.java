package com.ejercicio.ventas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejercicio.ventas.modelos.Detalle;

@Repository
public interface DetalleRepositorio extends JpaRepository<Detalle,Long> {

}
