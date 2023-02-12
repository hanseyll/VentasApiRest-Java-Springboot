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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.ventas.modelos.Detalle;
import com.ejercicio.ventas.modelos.Factura;
import com.ejercicio.ventas.servicios.DetalleServicioImplementacion;

@RestController
@RequestMapping("/api/v1")
public class DetalleControlador {
	
	@Autowired
	DetalleServicioImplementacion detalleservicio;
	
	@GetMapping("/detalles")
	public List<Detalle> obtenerDetalles() throws Exception{
		return detalleservicio.obtenerTodo();
	}
	
	@PostMapping("/guardarDetalle")
	public ResponseEntity<Detalle> guardarDetalle(@RequestBody Detalle detalle) throws Exception{
		Detalle nuevo_detalle = detalleservicio.guardar(detalle);
		return new ResponseEntity<>(nuevo_detalle,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/detalle/{id}")
	public ResponseEntity<Detalle> obtenerPorId(@PathVariable long id) throws Exception{
		Detalle detallePorId = detalleservicio.obtenerPorId(id);
		return ResponseEntity.ok(detallePorId);
	}
	
	@GetMapping("/detalleFacturaPorNumFactura")
	public ResponseEntity<?> search(@RequestParam long id) throws Exception{
		      List <Detalle> detallePorClienteId= detalleservicio.search(id);
			return new ResponseEntity<>(detallePorClienteId,HttpStatus.FOUND);
	}
	
	
	@PutMapping("/detalle/{id}")
	public ResponseEntity<Detalle> actualizarPorId(@PathVariable long id, @RequestBody Detalle detalle) throws Exception{
		Detalle detallePorId = detalleservicio.obtenerPorId(id);
		detallePorId.setCantidad(detalle.getCantidad());
		detallePorId.setPrecio(detalle.getPrecio());
		
		Detalle nuevo_detalle = detalleservicio.guardar(detallePorId);
		return new ResponseEntity<>(nuevo_detalle,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/detalle/{id}")
	public ResponseEntity<HashMap<String,Boolean>> eliminarDetalle(@PathVariable long id) throws Exception{
		this.detalleservicio.eliminar(id);
		
		HashMap<String,Boolean> estadoDetalleEliminado = new HashMap<>();
		estadoDetalleEliminado.put("eliminado", true);
		return ResponseEntity.ok(estadoDetalleEliminado);
	}

}
