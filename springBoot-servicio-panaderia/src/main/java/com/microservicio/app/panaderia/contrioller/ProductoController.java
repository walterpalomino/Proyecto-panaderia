package com.microservicio.app.panaderia.contrioller;

import com.microservicio.app.panaderia.dto.ProductoCrearDto;
import com.microservicio.app.panaderia.dto.ProductoDto;
import com.microservicio.app.panaderia.servicio.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/buscar-producto/{id}")
    public ResponseEntity<ProductoDto> buscarProductoId(@PathVariable long id){

        return ResponseEntity.ok(productoService.buscarProductoId(id));
    }

    @PutMapping("/actualizar-producto/{id}")
    public ResponseEntity<ProductoDto> actualizarProducto(@PathVariable long id, @RequestBody ProductoCrearDto productoCrearDto){

        return ResponseEntity.status(HttpStatus.CREATED).body(productoService.actualizarProducto(id, productoCrearDto));

    }

    @DeleteMapping("/eliminar-producto/{id}")
    public ResponseEntity eliminarProducto(@PathVariable long id){

        productoService.eliminarProducto(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/nuevo-producto")
    public ResponseEntity<ProductoDto> nuevoProducto(@RequestBody ProductoCrearDto productoCrearDto){

        return ResponseEntity.status(HttpStatus.CREATED).body(productoService.addProducto(productoCrearDto));
    }



}
