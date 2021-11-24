package com.microservicio.app.panaderia.dto;

import com.microservicio.app.panaderia.entity.Cliente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PedidoDto {

    private Long id;
    private Cliente cliente;
    private double importeTotal;
    private String fecha;
}
