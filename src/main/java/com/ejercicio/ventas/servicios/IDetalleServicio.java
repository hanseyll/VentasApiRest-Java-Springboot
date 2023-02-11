package com.ejercicio.ventas.servicios;

import java.util.List;

import com.ejercicio.ventas.modelos.Detalle;

public interface IDetalleServicio {
	public List<Detalle> obtenerTodo(); 
	public Detalle guardar(Detalle detalle);
	public Detalle obtenerPorId(long id);
	public void eliminar(long id);
}
