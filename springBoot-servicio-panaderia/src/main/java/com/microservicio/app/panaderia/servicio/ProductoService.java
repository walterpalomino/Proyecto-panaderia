package com.microservicio.app.panaderia.servicio;

import com.microservicio.app.panaderia.dto.ClienteCrearDto;
import com.microservicio.app.panaderia.dto.ClienteDto;
import com.microservicio.app.panaderia.dto.ProductoCrearDto;
import com.microservicio.app.panaderia.dto.ProductoDto;

import java.util.List;

public interface ProductoService {

    public List<ProductoDto> listaProductos();
    public ProductoDto addProducto(ProductoCrearDto productoCrearDto);
    public ProductoDto buscarProductoId(long id);
    public ProductoDto actualizarProducto(long id, ProductoCrearDto productoCrearDto);
    public void eliminarProducto(long id);
}
