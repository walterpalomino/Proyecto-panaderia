package com.microservicio.app.panaderia.contrioller;

import java.util.List;

import com.microservicio.app.panaderia.dto.PedidoCrearDto;
import com.microservicio.app.panaderia.dto.PedidoDto;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.app.panaderia.entity.Pedido;
import com.microservicio.app.panaderia.servicio.PedidoServicio;

@RestController
public class PedidoController {

	private static final Log log = LogFactory.getLog(PedidoController.class);

	@Autowired
	private PedidoServicio servicio;

	@GetMapping("/listadoPedido")
	public ResponseEntity<List<PedidoDto>> listado() {
	//	try {

			return ResponseEntity.ok(servicio.findAll());

//		} catch (Exception e) {
		//	log.error(e);
			//return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	//	}

	}
	
	@GetMapping("/buscar/{id}")
	public ResponseEntity<PedidoDto> buscarPedido(@PathVariable Long id) {

			return ResponseEntity.ok(servicio.findById(id));
	}
/*
	@PostMapping("/guardarPedido")
	public ResponseEntity<Pedido> addPedido(@RequestBody PedidoCrearDto p) {
		try {
			
			log.error(p.getCliente().getId());
			return ResponseEntity.status(HttpStatus.CREATED).body(servicio.addPedido(p));
		} catch (Exception e) {

			log.error(e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}


 */
}
