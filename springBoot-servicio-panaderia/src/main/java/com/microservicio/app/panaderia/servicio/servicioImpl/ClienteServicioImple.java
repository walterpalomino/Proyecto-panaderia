package com.microservicio.app.panaderia.servicio.servicioImpl;


import java.util.List;

import com.microservicio.app.panaderia.servicio.ClienteServicio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.app.panaderia.entity.Cliente;
import com.microservicio.app.panaderia.repository.ClienteRepository;

@Service
@Slf4j
public class ClienteServicioImple implements ClienteServicio {

	@Autowired
	private ClienteRepository repo;
	
	@Override
	public List<Cliente> findAll() {
		
		List<Cliente> lista= null;
		
		try {
			
			
			 lista = repo.findAll();
			
		} catch (Exception e) {
			log.error(e);
		}
		return lista;
	}

	@Override
	public Object createCliente(Cliente cliente) {
		
		try {
			
			Cliente c = repo.save(cliente);
			
			
		} catch (Exception e) {
			
		}
		return null;
	}

}
