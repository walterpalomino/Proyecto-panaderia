package com.microservicio.app.panaderia.servicio;

import java.util.List;

import com.microservicio.app.panaderia.entity.Cliente;

public interface ClienteServicio<T> {
	
	public List<T> findAll();
	public T createCliente(Cliente cliente);

}
