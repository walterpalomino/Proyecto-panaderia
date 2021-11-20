package com.microservicio.app.panaderia.dto;

import com.microservicio.app.panaderia.entity.Cliente;
import lombok.Data;

@Data
public class ClienteCrearDto {

    private long id;
    private String nombre;

    public Cliente toCliente(){

        return Cliente.builder()
                .nombre(this.getNombre())
                .build();
    }

}
