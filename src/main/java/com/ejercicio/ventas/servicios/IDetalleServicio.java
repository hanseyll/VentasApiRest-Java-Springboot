package com.ejercicio.ventas.servicios;

import java.util.List;

import com.ejercicio.ventas.modelos.Detalle;
import com.ejercicio.ventas.modelos.Factura;

public interface IDetalleServicio {
	public List<Detalle> obtenerTodo() throws Exception; 
	public Detalle guardar(Detalle detalle)throws Exception;
	public Detalle obtenerPorId(long id)throws Exception;
	public void eliminar(long id)throws Exception;
	public List<Detalle> search(long id) throws Exception;
}
