package com.microservicio.app.panaderia.dto;

import com.microservicio.app.panaderia.entity.Cliente;
import com.microservicio.app.panaderia.entity.Pedido;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PedidoCrearDto {

    private Long id;
    private Cliente cliente;
    private double importeTotal;
    private String fecha;

    public Pedido toPedido(PedidoCrearDto pedidoCrearDto){

        return Pedido.builder()
                .id(pedidoCrearDto.getId())
                .cliente(pedidoCrearDto.getCliente())
                .importeTotal(pedidoCrearDto.getImporteTotal())
                .fecha(pedidoCrearDto.getFecha())
                .build();
    }
}
