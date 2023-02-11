package com.ejercicio.ventas.servicios;

 import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.ventas.modelos.Cliente;
import com.ejercicio.ventas.repositorios.ClienteRepositorio;

@Service
public class ClienteServicioImplementacion implements IClienteServicio{

	@Autowired
	ClienteRepositorio clienterepositorio;
	
	@Override
	public List<Cliente> obtenerTodo() {
		return clienterepositorio.findAll();
	}

	@Override
	public Cliente guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienterepositorio.save(cliente);
	}

	@Override
	public Cliente obtenerPorId(long id) {
		// TODO Auto-generated method stub
		return clienterepositorio.findById(id).orElse(null);
	}

	@Override
	public void eliminar(long id) {
		// TODO Auto-generated method stub
		clienterepositorio.deleteById(id);
		
	}

}
