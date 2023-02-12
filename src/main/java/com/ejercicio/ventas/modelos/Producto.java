package com.ejercicio.ventas.modelos;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class Producto implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_producto;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "precio")
	private int precio;
	@Column(name = "stock")
	private int stock;

	public Producto() {
	}

	public Long getId_producto() {
		return id_producto;
	}

	public void setId_producto(Long id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
