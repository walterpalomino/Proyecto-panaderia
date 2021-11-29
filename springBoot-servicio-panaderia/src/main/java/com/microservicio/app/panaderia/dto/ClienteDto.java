package com.microservicio.app.panaderia.dto;

import com.microservicio.app.panaderia.entity.Cliente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
@Builder
public class ClienteDto {

    private long id;
    private String nombre;

    public ClienteDto(Cliente cliente){
        this.id = cliente.getId();
        this.nombre = cliente.getNombre();
    }
}
