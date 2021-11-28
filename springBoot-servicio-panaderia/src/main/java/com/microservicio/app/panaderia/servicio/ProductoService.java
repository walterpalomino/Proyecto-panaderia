package com.microservicio.app.panaderia.servicio;

import com.microservicio.app.panaderia.dto.ClienteCrearDto;
import com.microservicio.app.panaderia.dto.ClienteDto;
import com.microservicio.app.panaderia.dto.ProductoCrearDto;
import com.microservicio.app.panaderia.dto.ProductoDto;

import java.util.List;

public interface ProductoService {

    public List<ProductoDto> buscarClientes();
    public ProductoDto createCliente(ProductoCrearDto productoCrearDto);
    public ProductoDto buscarClienteId(long id);
    public ProductoDto actualizarCliente(long id, ProductoCrearDto productoCrearDto);
    public void eliminarCliente(long id);
}
