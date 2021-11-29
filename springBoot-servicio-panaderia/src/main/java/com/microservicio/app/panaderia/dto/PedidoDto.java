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
public class PedidoDto {

    private Long id;
    private Cliente cliente;
    private double importeTotal;
    private String fecha;

    public PedidoDto(Pedido pedido){
        this.id = pedido.getId();
        this.cliente = pedido.getCliente();
        this.importeTotal = pedido.getImporteTotal();
        this.fecha = pedido.getFecha();
    }
}
