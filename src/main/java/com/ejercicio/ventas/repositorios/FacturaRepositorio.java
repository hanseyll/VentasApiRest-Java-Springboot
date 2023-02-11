package com.ejercicio.ventas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejercicio.ventas.modelos.Factura;

@Repository
public interface FacturaRepositorio extends JpaRepository<Factura,Long> {

}
