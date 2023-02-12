package com.ejercicio.ventas.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.ventas.modelos.Producto;
import com.ejercicio.ventas.repositorios.ProductoRepositorio;

@Service
public class ProductoServicioImplementacion implements IProductoServicio {

	@Autowired
	ProductoRepositorio productorepositorio;

	@Override
	public List<Producto> obtenerTodo() throws Exception {
		try {
			return productorepositorio.findAll();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public Producto guardar(Producto producto) throws Exception {
		try {
			return productorepositorio.save(producto);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public Producto obtenerPorId(long id) throws Exception {
		try {
			return productorepositorio.findById(id).orElse(null);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public void eliminar(long id) throws Exception {
		try {
			productorepositorio.deleteById(id);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

}
