package com.ejercicio.ventas.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.ventas.modelos.Detalle;
import com.ejercicio.ventas.modelos.Factura;
import com.ejercicio.ventas.repositorios.DetalleRepositorio;

@Service
public class DetalleServicioImplementacion implements IDetalleServicio{
	
	@Autowired
	DetalleRepositorio detallerepositorio;

	@Override
	public List<Detalle> obtenerTodo() {
		return detallerepositorio.findAll();
	}

	@Override
	public Detalle guardar(Detalle detalle) {
		return detallerepositorio.save(detalle);
	}

	@Override
	public Detalle obtenerPorId(long id) {
		return detallerepositorio.findById(id).orElse(null);
	}

	@Override
	public void eliminar(long id) {
		detallerepositorio.deleteById(id);
	}

	@Override
	public List<Detalle> search(long id) throws Exception {
		try {
			List<Detalle> detalles = detallerepositorio.searchNativo(id);
			return detalles;
		} catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}
