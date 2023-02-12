package com.ejercicio.ventas.servicios;

import java.util.List;

import com.ejercicio.ventas.modelos.Producto;

public interface IProductoServicio {
	public List<Producto> obtenerTodo() throws Exception;
	public Producto guardar(Producto producto) throws Exception;
	public Producto obtenerPorId(long id) throws Exception;
	public void eliminar(long id) throws Exception;
}
