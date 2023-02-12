package com.ejercicio.ventas.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.ventas.modelos.Factura;
import com.ejercicio.ventas.repositorios.ClienteRepositorio;
import com.ejercicio.ventas.repositorios.FacturaRepositorio;

@Service
public class FacturaServicioImplementacion implements IFacturaServicio {

	@Autowired
	FacturaRepositorio facturarepositorio;

	@Override
	public List<Factura> obtenerTodo() throws Exception {
		try {
			return facturarepositorio.findAll();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public Factura guardar(Factura factura) throws Exception {
		try {
			return facturarepositorio.save(factura);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public Factura obtenerPorId(long id) throws Exception {
		try {
			return facturarepositorio.findById(id).orElse(null);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public void eliminar(long id) throws Exception {
		try {
			facturarepositorio.deleteById(id);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

	@Override
	public List<Factura> search(long id) throws Exception {
		try {
			List<Factura> facturas = facturarepositorio.searchNativo(id);
			return facturas;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}
