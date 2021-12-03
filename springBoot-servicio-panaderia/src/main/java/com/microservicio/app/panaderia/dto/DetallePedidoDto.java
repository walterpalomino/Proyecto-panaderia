package com.microservicio.app.panaderia.dto;

import com.microservicio.app.panaderia.entity.DetallePedido;
import com.microservicio.app.panaderia.entity.Pedido;
import com.microservicio.app.panaderia.entity.Producto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
@Builder
public class DetallePedidoDto {

    private Long id;
    private Producto producto;
    private int cantidad;
    private Pedido pedido;
    private double precioUnitario;
    private double subTotal;

    public DetallePedidoDto(DetallePedido detallePedido){

        this.id = detallePedido.getId();
        this.producto = detallePedido.getProducto();
        this.cantidad = detallePedido.getCantidad();
        this.pedido = detallePedido.getPedido();
        this.precioUnitario = detallePedido.getPrecioUnitario();
        this.subTotal = detallePedido.getSubTotal();
    }
}
