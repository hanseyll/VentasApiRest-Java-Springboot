package com.ejercicio.ventas.modelos;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class Detalle implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long num_detalle;
	@ManyToOne
	@JoinColumn(name = "num_factura")
	private Factura num_factura;
	@ManyToOne
	@JoinColumn(name = "id_producto")
	private Producto id_producto;
	@Column(name = "cantidad")
	private int cantidad;
	@Column(name = "precio")
	private int precio;

	public Detalle() {

	}

	public Long getNum_detalle() {
		return num_detalle;
	}

	public void setNum_detalle(Long num_detalle) {
		this.num_detalle = num_detalle;
	}

	public Factura getNum_factura() {
		return num_factura;
	}

	public void setNum_factura(Factura num_factura) {
		this.num_factura = num_factura;
	}

	public Producto getId_producto() {
		return id_producto;
	}

	public void setId_producto(Producto id_producto) {
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

}
