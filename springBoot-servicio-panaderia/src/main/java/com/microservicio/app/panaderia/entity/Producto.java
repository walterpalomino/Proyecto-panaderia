package com.microservicio.app.panaderia.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name="producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private BigDecimal precio;
	@Column(name = "stock_minimo")
	private int stockMinimo;
	@Column(name = "stock_maximo")
	private int stockMaximo;
	@Column(name = "stock_actual")
	private int stockActual;
	}
