package com.microservicio.app.panaderia.dto;

import com.microservicio.app.panaderia.entity.Producto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductoCrearDto {

    private Long id;
    private String nombre;
    private BigDecimal precio;
    private int stockMinimo;
    private int stockMaximo;
    private int stockActual;

    public Producto toProducto(){

        return Producto.builder()
                .id(getId())
                .nombre(getNombre())
                .precio(getPrecio())
                .stockMinimo(getStockMinimo())
                .stockMaximo(getStockMaximo())
                .stockActual(getStockActual())
                .build();
    }
}
