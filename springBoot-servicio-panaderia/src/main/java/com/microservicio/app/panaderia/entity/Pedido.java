package com.microservicio.app.panaderia.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor @AllArgsConstructor
@Entity
@Builder
@Table(name = "pedidos")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cliente")
	private Cliente cliente;

	@Column(name = "importe_total")
	private double importeTotal;
	private String fecha;

	public Pedido( Cliente cliente) {
				
		this.cliente = cliente;
	}
}
