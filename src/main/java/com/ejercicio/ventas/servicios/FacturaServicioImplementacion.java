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
	public List<Factura> obtenerTodo() {
		return facturarepositorio.findAll();
	}

	@Override
	public Factura guardar(Factura factura) {
		return facturarepositorio.save(factura);
	}

	@Override
	public Factura obtenerPorId(long id) {
		return facturarepositorio.findById(id).orElse(null);
	}

	@Override
	public void eliminar(long id) {
		facturarepositorio.deleteById(id);
		
	}

	@Override
	public List<Factura> search(long id) throws Exception {
		try {
			List<Factura> facturas = facturarepositorio.searchNativo(id);
			return facturas;
		} catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}
