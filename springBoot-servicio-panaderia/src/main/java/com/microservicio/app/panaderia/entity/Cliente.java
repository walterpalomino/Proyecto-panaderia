package com.microservicio.app.panaderia.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Builder
@Table(name="clientes")
public class Cliente  {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	private Long id;
	private String nombre;

	public Cliente(String nombre) {

		this.nombre = nombre;
	}
	
	
	
	
	
	
	 
}
