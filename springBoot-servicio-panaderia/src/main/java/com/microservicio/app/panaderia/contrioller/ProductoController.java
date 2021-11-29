package com.microservicio.app.panaderia.contrioller;

import com.microservicio.app.panaderia.dto.ProductoDto;
import com.microservicio.app.panaderia.servicio.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/listado-producto")
    public ResponseEntity<List<ProductoDto>> listaProducto(){

        return ResponseEntity.ok(productoService.listaProductos());
    }

    @GetMapping("buscar-producto/{id}")
    public ResponseEntity<ProductoDto> buscarProductoId(@PathVariable long id){

        return ResponseEntity.ok(productoService.buscarProductoId(id));
    }

}
