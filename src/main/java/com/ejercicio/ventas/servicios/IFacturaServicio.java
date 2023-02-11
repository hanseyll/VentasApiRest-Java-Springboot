package com.ejercicio.ventas.servicios;

import java.util.List;

import com.ejercicio.ventas.modelos.Factura;

public interface IFacturaServicio {
	public List<Factura> obtenerTodo();
	public Factura guardar(Factura factura);
	public Factura obtenerPorId(long id);
	public void eliminar(long id);
}
