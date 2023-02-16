package com.ejercicio.ventas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejercicio.ventas.modelos.Producto;
import com.ejercicio.ventas.modelos.Vendedor;

@Repository
public interface VendedorRepositorio extends JpaRepository<Vendedor,Long>{

}
