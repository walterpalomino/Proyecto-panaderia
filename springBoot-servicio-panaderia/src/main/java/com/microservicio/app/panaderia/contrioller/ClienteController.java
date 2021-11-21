package com.microservicio.app.panaderia.contrioller;

import java.util.List;
import com.microservicio.app.panaderia.dto.ClienteCrearDto;
import com.microservicio.app.panaderia.dto.ClienteDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.microservicio.app.panaderia.servicio.ClienteServicio;

@RestController
@RequestMapping("/api")
@Slf4j
public class ClienteController {

    @Autowired
    private ClienteServicio clienteServicio;

    @GetMapping("/listado-cliente")
    public ResponseEntity<List<ClienteDto>> listadoCliente() {

        log.info("Listado de clientes. ");
        clienteServicio.buscarClientes()
                .forEach(cliente -> {log.info(cliente.toString());});

        return ResponseEntity.ok().body(clienteServicio.buscarClientes());
    }

    @PostMapping("/crear-cliente")
    public ResponseEntity<ClienteDto> addCliente(@RequestBody ClienteCrearDto clienteCrearDto) {

        log.info("Se dio de alta cliente : " + clienteCrearDto.toString());
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteServicio.createCliente(clienteCrearDto));

    }

    @PutMapping("7actualizar-cliente")
    public ResponseEntity<ClienteDto> updateCliente(@PathVariable long id, @RequestBody ClienteCrearDto clienteCrearDto){

        return ResponseEntity.status(HttpStatus.CREATED).body(clienteServicio.actualizarCliente(id, clienteCrearDto));
    }

}
