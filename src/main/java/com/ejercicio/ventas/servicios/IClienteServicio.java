package com.ejercicio.ventas.servicios;

import java.util.List;

import com.ejercicio.ventas.modelos.Cliente;

public interface IClienteServicio {
	
	public List<Cliente> obtenerTodo();
	public Cliente guardar(Cliente cliente);
	public Cliente obtenerPorId(long id);
	public void eliminar(long id);

}
