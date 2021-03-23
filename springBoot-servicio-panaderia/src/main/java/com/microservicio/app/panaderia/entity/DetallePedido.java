package com.microservicio.app.panaderia.entity;



import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor @Setter @Getter @AllArgsConstructor
@Entity 
@Table(name="detalle_pedido")
public class DetallePedido  {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
		
	@OneToOne
	@JoinColumn(name = "producto")
	private Producto producto;
	
	private String cantidad;	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pedido")
	@JsonBackReference
	private Pedido pedido;

	public DetallePedido(Producto producto, String cantidad) {
		
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public DetallePedido(Producto producto, String cantidad, Pedido pedido) {
		
		this.producto = producto;
		this.cantidad = cantidad;
		this.pedido = pedido;
	}
	
	

	
	
	
	
	
	
	
	
	

}