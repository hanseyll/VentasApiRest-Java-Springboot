package com.ejercicio.ventas.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.ventas.modelos.Producto;
import com.ejercicio.ventas.modelos.Vendedor;
import com.ejercicio.ventas.repositorios.FacturaRepositorio;
import com.ejercicio.ventas.repositorios.VendedorRepositorio;

@Service
public class VendedorServicioImplementacion implements IVendedorServicio {

	@Autowired
	VendedorRepositorio vendedorrepositorio;

	@Override
	public List<Vendedor> obtenerTodo() {
		return vendedorrepositorio.findAll();
		
	}

	@Override
	public Vendedor guardar(Vendedor vendedor) {
		return vendedorrepositorio.save(vendedor);
	}

}
