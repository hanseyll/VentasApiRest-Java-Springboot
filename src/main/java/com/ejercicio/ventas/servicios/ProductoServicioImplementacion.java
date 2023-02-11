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
	public List<Producto> obtenerTodo() {
		return productorepositorio.findAll();
	}

	@Override
	public Producto guardar(Producto producto) {
		return productorepositorio.save(producto);
	}

	@Override
	public Producto obtenerPorId(long id) {
	return productorepositorio.findById(id).orElse(null);
	}

	@Override
	public void eliminar(long id) {
		productorepositorio.deleteById(id);
		
	}

}
