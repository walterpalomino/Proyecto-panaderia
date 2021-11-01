package com.microservicio.app.panaderia.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data @NoArgsConstructor 
@Entity
@Table(name="clientes")
public class Cliente  {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	private Long id;
	private String nombre;

	private List<Pedido> pedido;


	public Cliente(String nombre) {

		this.nombre = nombre;
	}


	public Cliente(Long id, String nombre) {
	
		this.id = id;
		this.nombre = nombre;
	}   
	
	
	
	
	
	
	 
}
