package com.microservicio.app.panaderia.servicio;

import java.util.List;

import com.microservicio.app.panaderia.dto.ClienteCrearDto;
import com.microservicio.app.panaderia.dto.ClienteDto;
import com.microservicio.app.panaderia.entity.Cliente;

public interface ClienteServicio<T> {
	
	public List<ClienteDto> buscarClientes();
	public T createCliente(ClienteCrearDto clienteCrearDto);

}
