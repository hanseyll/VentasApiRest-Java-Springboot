package com.ejercicio.ventas.servicios;

import java.util.List;

import com.ejercicio.ventas.modelos.Factura;

public interface IFacturaServicio {
	public List<Factura> obtenerTodo() throws Exception;
	public Factura guardar(Factura factura) throws Exception;
	public Factura obtenerPorId(long id) throws Exception;
	public void eliminar(long id) throws Exception;
	public List<Factura> search(long id) throws Exception;
}
