package com.ejercicio.ventas.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejercicio.ventas.modelos.Cliente;
@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente,Long> {
}
