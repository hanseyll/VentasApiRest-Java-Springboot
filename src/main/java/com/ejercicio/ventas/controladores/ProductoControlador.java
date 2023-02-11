package com.ejercicio.ventas.controladores;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.ventas.modelos.Producto;
import com.ejercicio.ventas.servicios.ProductoServicioImplementacion;

@RestController
@RequestMapping("/api/v1")
public class ProductoControlador {

	@Autowired
	ProductoServicioImplementacion productoservicio;
	
	@GetMapping("/productos")
	public List<Producto> obtenerFacturas(){
		return productoservicio.obtenerTodo();
	}
	
	@PostMapping("/guardarProducto")
	public ResponseEntity<Producto> guardarProducto(@RequestBody Producto producto){
		Producto nuevo_producto = productoservicio.guardar(producto);
		return new ResponseEntity<>(nuevo_producto,HttpStatus.CREATED);
	}
	
	@GetMapping("/producto/{id}")
	public ResponseEntity<Producto> obtenerProductoId(@PathVariable long id){
		Producto clientePorId = productoservicio.obtenerPorId(id);
		return ResponseEntity.ok(clientePorId);
		
	}
	
	@PutMapping("/producto/{id}")
	public ResponseEntity<Producto> actualizar(@PathVariable long id,@RequestBody Producto producto){
		Producto productoPorId = productoservicio.obtenerPorId(id);
		productoPorId.setNombre(producto.getNombre());
		productoPorId.setPrecio(producto.getPrecio());
		productoPorId.setStock(producto.getStock());
		
		Producto producto_actualizado = productoservicio.guardar(productoPorId);
		return new ResponseEntity<>(producto_actualizado,HttpStatus.CREATED);
		}
	
	@DeleteMapping("/producto/{id}")
	public ResponseEntity<HashMap<String,Boolean>> eliminarProducto(@PathVariable long id){
		this.productoservicio.eliminar(id);
		
		HashMap<String,Boolean> estadoProductoEliminado = new HashMap<>();
		estadoProductoEliminado.put("Eliminado", true);
		return ResponseEntity.ok(estadoProductoEliminado);
		
		
	}
	
	
	

}
