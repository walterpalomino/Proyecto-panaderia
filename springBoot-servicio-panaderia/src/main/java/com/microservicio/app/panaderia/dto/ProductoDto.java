package com.microservicio.app.panaderia.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor @NoArgsConstructor
public class Producto {

    private Long id;
    private String nombre;
    private BigDecimal precio;
    private int stockMinimo;
    private int stockMaximo;
    private int stockActual;
}
