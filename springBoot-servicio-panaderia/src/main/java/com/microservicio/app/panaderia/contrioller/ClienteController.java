package com.microservicio.app.panaderia.contrioller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.app.panaderia.entity.Cliente;
import com.microservicio.app.panaderia.entity.Pedido;
import com.microservicio.app.panaderia.servicio.ClienteServicio;

@RestController
public class ClienteController {
	
	@Autowired
	private ClienteServicio servicio;
	
	private static final Log log = LogFactory.getLog(ClienteController.class);
	
	@GetMapping("/listado")	
	public ResponseEntity<List<Cliente>> listadoCliente()
	{
		try {
			
			return ResponseEntity.ok().body(servicio.findAll());
			
		} catch (Exception e) {
			log.error(e);
		}
		
		return null;
	}
	
	@PostMapping("/crearCliente")
	public ResponseEntity<Cliente> addCliente(@RequestBody Cliente c)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body((Cliente)servicio.createCliente(c));
		
	} 

}
