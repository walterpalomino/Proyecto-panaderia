package com.microservicio.app.panaderia.servicio;

import java.util.List;

import com.microservicio.app.panaderia.dto.ClienteCrearDto;
import com.microservicio.app.panaderia.dto.ClienteDto;
import com.microservicio.app.panaderia.entity.Cliente;

public interface ClienteServicio {
	
	public List<ClienteDto> buscarClientes();
	public ClienteDto createCliente(ClienteCrearDto clienteCrearDto);
	public ClienteDto buscarClienteId(long id);
	public ClienteDto actualizarCliente(long id, ClienteDto clienteDto);
	public void eliminarCliente();

}
