package com.microservicio.app.panaderia.contrioller;

import java.util.List;

import com.microservicio.app.panaderia.dto.PedidoCrearDto;
import com.microservicio.app.panaderia.dto.PedidoDto;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.microservicio.app.panaderia.entity.Pedido;
import com.microservicio.app.panaderia.servicio.PedidoServicio;

@RestController
public class PedidoController {

	private static final Log log = LogFactory.getLog(PedidoController.class);

	@Autowired
	private PedidoServicio pedidoServicio;

	@GetMapping("/listadoPedido")
	public ResponseEntity<List<PedidoDto>> listado() {

			return ResponseEntity.ok(pedidoServicio.findAll());
	}
	
	@GetMapping("/buscar/{id}")
	public ResponseEntity<PedidoDto> buscarPedido(@PathVariable Long id) {

			return ResponseEntity.ok(pedidoServicio.findById(id));
	}

	@PostMapping("/guardarPedido")
	public ResponseEntity<PedidoDto> addPedido(@RequestBody PedidoCrearDto pedidoCrearDto) {

			log.info(pedidoCrearDto.toString());
			return ResponseEntity.status(HttpStatus.CREATED).body(pedidoServicio.addPedido(pedidoCrearDto));
	}

	@PutMapping("/actualizar-pedido/{id}")
	public ResponseEntity<PedidoDto> actualizarPedido(@PathVariable long id, @RequestBody PedidoCrearDto pedidoCrearDto){

		return ResponseEntity.status(HttpStatus.CREATED).body(pedidoServicio.updatePedido(id, pedidoCrearDto));
	}



}
