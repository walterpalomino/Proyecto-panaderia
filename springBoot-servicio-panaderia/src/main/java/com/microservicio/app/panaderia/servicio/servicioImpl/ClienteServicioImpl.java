package com.microservicio.app.panaderia.servicio.servicioImpl;


import java.util.List;
import java.util.stream.Collectors;

import com.microservicio.app.panaderia.dto.ClienteCrearDto;
import com.microservicio.app.panaderia.dto.ClienteDto;
import com.microservicio.app.panaderia.servicio.ClienteServicio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.app.panaderia.entity.Cliente;
import com.microservicio.app.panaderia.repository.ClienteRepository;

@Service
@Slf4j
public class ClienteServicioImpl implements ClienteServicio {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<ClienteDto> buscarClientes() {

        return clienteRepository.findAll()
                .stream()
                .map(cliente -> ClienteDto.builder()
                        .id(cliente.getId())
                        .nombre(cliente.getNombre())
                        .build())
                .collect(Collectors.toList());
    }

    @Override
    public Object createCliente(ClienteCrearDto clienteCrearDto) {

            return clienteRepository.save(clienteCrearDto.toCliente());

    }

}
