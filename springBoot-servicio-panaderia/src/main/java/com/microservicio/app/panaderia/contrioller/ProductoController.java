package com.microservicio.app.panaderia.contrioller;

import com.microservicio.app.panaderia.dto.ProductoDto;
import com.microservicio.app.panaderia.servicio.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    public ResponseEntity<List<ProductoDto>> listaProducto(){

        return ResponseEntity.ok(productoService.listaProductos());
    }

}
