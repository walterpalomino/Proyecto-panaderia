package com.microservicio.app.panaderia.dto;

import com.microservicio.app.panaderia.entity.Producto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor @NoArgsConstructor
@Builder
public class ProductoDto {

    private Long id;
    private String nombre;
    private BigDecimal precio;
    private int stockMinimo;
    private int stockMaximo;
    private int stockActual;

    public ProductoDto(Producto producto){

        this.id = producto.getId();
        this.nombre = producto.getNombre();
        this.precio = producto.getPrecio();
        this.stockMinimo = producto.getStockMinimo();
        this.stockMaximo = producto.getStockMaximo();
        this.stockActual = producto.getStockActual();
    }
}
