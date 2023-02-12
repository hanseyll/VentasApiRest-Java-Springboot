package com.ejercicio.ventas.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.ventas.modelos.Detalle;
import com.ejercicio.ventas.modelos.Factura;
import com.ejercicio.ventas.repositorios.DetalleRepositorio;

@Service
public class DetalleServicioImplementacion implements IDetalleServicio {

	@Autowired
	DetalleRepositorio detallerepositorio;

	@Override
	public List<Detalle> obtenerTodo() throws Exception {
		try {
			return detallerepositorio.findAll();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

	@Override
	public Detalle guardar(Detalle detalle) throws Exception {
		try {
			return detallerepositorio.save(detalle);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public Detalle obtenerPorId(long id) throws Exception {
		try {
			return detallerepositorio.findById(id).orElse(null);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public void eliminar(long id) throws Exception {

		try {
			detallerepositorio.deleteById(id);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public List<Detalle> search(long id) throws Exception {
		try {
			List<Detalle> detalles = detallerepositorio.searchNativo(id);
			return detalles;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}
