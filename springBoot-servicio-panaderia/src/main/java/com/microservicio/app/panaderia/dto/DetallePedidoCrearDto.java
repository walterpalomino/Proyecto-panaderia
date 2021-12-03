package com.microservicio.app.panaderia.dto;

import com.microservicio.app.panaderia.entity.DetallePedido;
import com.microservicio.app.panaderia.entity.Pedido;
import com.microservicio.app.panaderia.entity.Producto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetallePedidoCrearDto {

    private Long id;
    private Producto producto;
    private int cantidad;
    private Pedido pedido;
    private double precioUnitario;
    private double subTotal;

    public List<DetallePedido> toDetallePedido(List<DetallePedidoCrearDto> detallePedidoCrearDtoList) {

        return detallePedidoCrearDtoList.stream()
                .map(detallePedidoCrearDto ->
                        DetallePedido.builder()
                                .id(detallePedidoCrearDto.getId())
                                .producto(detallePedidoCrearDto.getProducto())
                                .cantidad(detallePedidoCrearDto.getCantidad())
                                .pedido(detallePedidoCrearDto.getPedido())
                                .precioUnitario(detallePedidoCrearDto.getPrecioUnitario())
                                .subTotal(detallePedidoCrearDto.getSubTotal())
                                .build())
                .collect(Collectors.toList());
    }
}
