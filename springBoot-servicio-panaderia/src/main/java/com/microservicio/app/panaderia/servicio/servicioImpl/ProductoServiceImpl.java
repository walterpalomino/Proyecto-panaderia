package com.microservicio.app.panaderia.servicio.servicioImpl;

import com.microservicio.app.panaderia.dto.ProductoCrearDto;
import com.microservicio.app.panaderia.dto.ProductoDto;
import com.microservicio.app.panaderia.repository.ProductoRepository;
import com.microservicio.app.panaderia.servicio.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<ProductoDto> listaProductos() {

        return productoRepository.findAll()
                .stream()
                .map(productoDto -> ProductoDto.builder()
                        .id(productoDto.getId())
                        .nombre(productoDto.getNombre())
                        .precio(productoDto.getPrecio())
                        .stockMinimo(productoDto.getStockMinimo())
                        .stockMaximo(productoDto.getStockMaximo())
                        .stockActual(productoDto.getStockActual())
                        .build())
                .collect(Collectors.toList());
    }

    @Override
    public ProductoDto addProducto(ProductoCrearDto productoCrearDto) {

        return new ProductoDto(productoRepository.save(productoCrearDto.toProducto()));
    }

    @Override
    public ProductoDto buscarProductoId(long id) {

        return productoRepository.findById(id)
                .map(producto -> ProductoDto.builder()
                        .id(producto.getId())
                        .nombre(producto.getNombre())
                        .precio(producto.getPrecio())
                        .stockMinimo(producto.getStockMinimo())
                        .stockMaximo(producto.getStockMaximo())
                        .stockActual(producto.getStockActual())
                        .build())
                .orElseThrow(()-> new NoSuchElementException("No existe el id " + id + " para algun producto"));
    }

    @Override
    public ProductoDto actualizarProducto(long id, ProductoCrearDto productoCrearDto) {

        this.buscarProductoId(id);
        productoCrearDto.setId(id);

        return new ProductoDto(productoRepository.save(productoCrearDto.toProducto()));
    }

    @Override
    public void eliminarProducto(long id) {

    }
}
