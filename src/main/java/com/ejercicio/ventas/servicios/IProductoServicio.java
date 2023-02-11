package com.ejercicio.ventas.servicios;

import java.util.List;

import com.ejercicio.ventas.modelos.Producto;

public interface IProductoServicio {
	public List<Producto> obtenerTodo();
	public Producto guardar(Producto producto);
	public Producto obtenerPorId(long id);
	public void eliminar(long id);
}
