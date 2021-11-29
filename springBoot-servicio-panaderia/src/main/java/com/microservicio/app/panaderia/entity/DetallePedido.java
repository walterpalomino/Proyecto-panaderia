package com.microservicio.app.panaderia.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
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
	private Pedido pedido;

	@Column(name = "precio_unitario")
	private double precioUnitario;

	@Column(name = "sub_total")
	private double subTotal;

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