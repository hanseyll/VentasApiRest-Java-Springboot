package com.ejercicio.ventas.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.ventas.modelos.Cliente;
import com.ejercicio.ventas.modelos.Factura;
import com.ejercicio.ventas.repositorios.ClienteRepositorio;
import com.ejercicio.ventas.repositorios.FacturaRepositorio;

@Service
public class ClienteServicioImplementacion implements IClienteServicio {

	@Autowired
	ClienteRepositorio clienterepositorio;

	@Override
	public List<Cliente> obtenerTodo() throws Exception {
		try {
			return clienterepositorio.findAll();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public Cliente guardar(Cliente cliente) throws Exception {
		try {
			return clienterepositorio.save(cliente);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public Cliente obtenerPorId(long id) throws Exception {
		try {
			return clienterepositorio.findById(id).orElse(null);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public void eliminar(long id) throws Exception {
		try {
			clienterepositorio.deleteById(id);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

}
