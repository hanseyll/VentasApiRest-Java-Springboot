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

import com.ejercicio.ventas.modelos.Factura;
import com.ejercicio.ventas.servicios.ClienteServicioImplementacion;
import com.ejercicio.ventas.servicios.FacturaServicioImplementacion;

@RestController
@RequestMapping("/api/v1")
public class FacturaControlador {
	@Autowired
	FacturaServicioImplementacion facturaservicio;
	
	@GetMapping("/facturas")
	public List<Factura> obtenerFacturas(){
		return facturaservicio.obtenerTodo();
	}
	@PostMapping("/guardarFactura")
	public ResponseEntity<Factura> guardarFactura(@RequestBody Factura factura){
		Factura nueva_factura = facturaservicio.guardar(factura);
		return new ResponseEntity<>(nueva_factura,HttpStatus.CREATED);
	}
	@GetMapping("/factura/{id}")
	public ResponseEntity<Factura> obtenerFacturaId(@PathVariable long id){
		Factura facturaPorId= facturaservicio.obtenerPorId(id);
		return ResponseEntity.ok(facturaPorId);
	}
	@PutMapping("/factura/{id}")
	public ResponseEntity<Factura> actualizar(@PathVariable long id, @RequestBody Factura factura){
		Factura facturaPorId = facturaservicio.obtenerPorId(id);
		facturaPorId.setFecha(factura.getFecha());
		
		Factura factura_actualizada = facturaservicio.guardar(facturaPorId);
		return new ResponseEntity<>(factura_actualizada, HttpStatus.CREATED);
	}
	@DeleteMapping("/factura/{id}")
	public ResponseEntity <HashMap<String, Boolean>>eliminarFactura(@PathVariable long id){
	this.facturaservicio.eliminar(id);
	
	HashMap<String,Boolean> estadoFacturaEliminada = new HashMap<>();
	estadoFacturaEliminada.put("eliminado", true);
	return ResponseEntity.ok(estadoFacturaEliminada);
	}

}
