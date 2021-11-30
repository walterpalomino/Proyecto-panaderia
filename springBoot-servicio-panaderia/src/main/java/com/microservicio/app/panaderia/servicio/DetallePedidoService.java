package com.microservicio.app.panaderia.servicio;

import com.microservicio.app.panaderia.dto.DetallePedidoCrearDto;
import com.microservicio.app.panaderia.dto.DetallePedidoDto;

import java.util.List;

public interface DetallePedidoService {

    public List<DetallePedidoDto> listadoDetallePedido();
    public DetallePedidoDto buscarDetallePedido(long id);
    public DetallePedidoDto actualizarDetallePedido(long id, DetallePedidoCrearDto detallePedidoCrearDto);
    public void nuevoDetallePedido(List<DetallePedidoCrearDto> detallePedidoCrearDto);
    public void eliminarDetallePedido(long id);
}
