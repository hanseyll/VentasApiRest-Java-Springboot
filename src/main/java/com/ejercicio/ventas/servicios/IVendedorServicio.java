package com.ejercicio.ventas.servicios;

import java.util.List;

import com.ejercicio.ventas.modelos.Producto;
import com.ejercicio.ventas.modelos.Vendedor;

public interface IVendedorServicio {
	public List<Vendedor> obtenerTodo();
	public Vendedor guardar(Vendedor vendedor);
}
