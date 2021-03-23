package com.microservicio.app.panaderia.servicio;


import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.app.panaderia.entity.Cliente;
import com.microservicio.app.panaderia.repository.ClienteRepository;

@Service
public class ClienteServicioImple implements ClienteServicio {

	@Autowired
	private ClienteRepository repo;
	
	private static final Log log= LogFactory.getLog(ClienteServicioImple.class);
	
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
