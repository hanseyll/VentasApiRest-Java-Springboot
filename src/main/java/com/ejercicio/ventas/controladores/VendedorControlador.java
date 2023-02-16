package com.ejercicio.ventas.controladores;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.ventas.modelos.Producto;
import com.ejercicio.ventas.modelos.Vendedor;
import com.ejercicio.ventas.servicios.ProductoServicioImplementacion;
import com.ejercicio.ventas.servicios.VendedorServicioImplementacion;

@RestController
@RequestMapping("/api/v1")
public class VendedorControlador {
	@Autowired
	VendedorServicioImplementacion vendedorservicio;
	
	@GetMapping("/vendedor")
	public List<Vendedor> obtenerFacturas() {
		return vendedorservicio.obtenerTodo();
	}
	
	@PostMapping("/guardarVendedor")
	public ResponseEntity<Vendedor> guardarProducto(@RequestBody Vendedor vendedor){
		Vendedor nuevoVendedor = vendedorservicio.guardar(vendedor);
		return new ResponseEntity<>(nuevoVendedor,HttpStatus.CREATED);
	}
}
