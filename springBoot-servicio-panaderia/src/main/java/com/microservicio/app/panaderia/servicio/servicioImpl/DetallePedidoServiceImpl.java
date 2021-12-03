package com.microservicio.app.panaderia.servicio.servicioImpl;

import com.microservicio.app.panaderia.dto.DetallePedidoCrearDto;
import com.microservicio.app.panaderia.dto.DetallePedidoDto;
import com.microservicio.app.panaderia.dto.ProductoDto;
import com.microservicio.app.panaderia.entity.DetallePedido;
import com.microservicio.app.panaderia.repository.DetallePedidoRepository;
import com.microservicio.app.panaderia.servicio.DetallePedidoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@Slf4j
public class DetallePedidoServiceImpl implements DetallePedidoService {

    @Autowired
    private DetallePedidoRepository detallePedidoRepository;

    @Autowired
    private ProductoServiceImpl productoService;

    @Override
    public List<DetallePedidoDto> listadoDetallePedido() {
        return null;
    }

    @Override
    public DetallePedidoDto buscarDetallePedido(long id) {
        return detallePedidoRepository.findById(id)
                .map(detallePedido -> DetallePedidoDto.builder()
                        .id(detallePedido.getId())
                        .pedido(detallePedido.getPedido())
                        .cantidad(detallePedido.getCantidad())
                        .producto(detallePedido.getProducto())
                        .precioUnitario(detallePedido.getPrecioUnitario())
                        .subTotal(detallePedido.getSubTotal())
                        .build())
                .orElseThrow(()-> new NoSuchElementException("El id " + id + " del detalle pedido no existe"));
    }

    @Override
    public DetallePedidoDto actualizarDetallePedido(long id, DetallePedidoCrearDto detallePedidoCrearDto) {
        return null;
    }

    @Override
    public void nuevoDetallePedido(List<DetallePedidoCrearDto> detallePedidoCrearDto) {

        for (DetallePedidoCrearDto detalle: detallePedidoCrearDto) {

           ProductoDto productoDto = productoService.buscarProductoId(detalle.getProducto().getId());

           if(!productoService.validarStockProducto(detalle.getCantidad(), productoDto.getStockActual())){

               throw new NoSuchElementException("No hay stock suficiente para el producto " + productoDto.getNombre());
           }
        }
        DetallePedidoCrearDto detallePedidoCrearDto1 = new DetallePedidoCrearDto();
        detallePedidoRepository.saveAll(detallePedidoCrearDto1.toDetallePedido(detallePedidoCrearDto));

    }

    @Override
    public void eliminarDetallePedido(long id) {

    }
}
