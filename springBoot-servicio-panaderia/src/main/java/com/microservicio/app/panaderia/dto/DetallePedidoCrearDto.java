package com.microservicio.app.panaderia.dto;

import com.microservicio.app.panaderia.entity.DetallePedido;
import com.microservicio.app.panaderia.entity.Pedido;
import com.microservicio.app.panaderia.entity.Producto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetallePedidoCrearDto {

    private Long id;
    private Producto producto;
    private String cantidad;
    private Pedido pedido;
    private double precioUnitario;
    private double subTotal;

    public DetallePedido toDetallePedido(){

        return DetallePedido.builder()
                .id(getId())
                .producto(getProducto())
                .cantidad(getCantidad())
                .pedido(getPedido())
                .precioUnitario(getPrecioUnitario())
                .subTotal(getSubTotal())
                .build();
    }
}
