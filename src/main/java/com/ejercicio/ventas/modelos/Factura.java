package com.ejercicio.ventas.modelos;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class Factura {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long num_factura;
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente id_cliente;
	@Column(name = "fecha")
	private String fecha;

	public Factura() {

	}

	public Long getNum_factura() {
		return num_factura;
	}

	public void setNum_factura(Long num_factura) {
		this.num_factura = num_factura;
	}

	public Cliente getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Cliente id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
