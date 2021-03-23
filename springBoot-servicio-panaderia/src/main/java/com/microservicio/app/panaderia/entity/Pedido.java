package com.microservicio.app.panaderia.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "pedidos")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToMany(cascade = CascadeType.REMOVE, mappedBy = "pedido", fetch = FetchType.LAZY)
	@JsonManagedReference
	private List<DetallePedido> detalle;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cliente", nullable = false)
	@JsonBackReference
	private Cliente cliente;

	public Pedido( Cliente cliente) {
				
		this.cliente = cliente;
	}

	public Pedido(Long id, Cliente cliente) {
	
		this.id = id;
		this.cliente = cliente;
	}
	
	
	
	

}
