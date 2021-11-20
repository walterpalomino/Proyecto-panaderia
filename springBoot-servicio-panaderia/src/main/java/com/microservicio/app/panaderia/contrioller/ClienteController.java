package com.microservicio.app.panaderia.contrioller;

import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.microservicio.app.panaderia.entity.Cliente;
import com.microservicio.app.panaderia.servicio.ClienteServicio;

@RestController
@RequestMapping("/api")
@Slf4j
public class ClienteController {

    @Autowired
    private ClienteServicio clienteServicio;

    @GetMapping("/listado-cliente")
    public ResponseEntity<List<Cliente>> listadoCliente() {

        log.info("Listado de clientes. ");
        clienteServicio.buscarClientes()
                .forEach(cliente -> {log.info(cliente.toString());});

        return ResponseEntity.ok().body(clienteServicio.buscarClientes());
    }

    @PostMapping("/crearCliente")
    public ResponseEntity<Cliente> addCliente(@RequestBody Cliente c) {
        return ResponseEntity.status(HttpStatus.CREATED).body((Cliente) clienteServicio.createCliente(c));

    }

}
