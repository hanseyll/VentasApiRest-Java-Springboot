package com.ejercicio.ventas.servicios;

import java.util.List;

import com.ejercicio.ventas.modelos.Cliente;
import com.ejercicio.ventas.modelos.Factura;

public interface IClienteServicio {
	
	public List<Cliente> obtenerTodo() throws Exception;
	public Cliente guardar(Cliente cliente) throws Exception;
	public Cliente obtenerPorId(long id) throws Exception;
	public void eliminar(long id) throws Exception;

}
