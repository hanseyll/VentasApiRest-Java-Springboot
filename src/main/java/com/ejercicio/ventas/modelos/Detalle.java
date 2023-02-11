package com.ejercicio.ventas.modelos;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class Detalle implements Serializable {
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long num_detalle;
private Long id_factura;
private Long id_producto;
private int cantidad;
private int precio;

public Detalle(){
	
}

public Long getNum_detalle() {
	return num_detalle;
}

public void setNum_detalle(Long num_detalle) {
	this.num_detalle = num_detalle;
}

public Long getId_factura() {
	return id_factura;
}

public void setId_factura(Long id_factura) {
	this.id_factura = id_factura;
}

public Long getId_producto() {
	return id_producto;
}

public void setId_producto(Long id_producto) {
	this.id_producto = id_producto;
}

public int getCantidad() {
	return cantidad;
}

public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}

public int getPrecio() {
	return precio;
}

public void setPrecio(int precio) {
	this.precio = precio;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}




}
