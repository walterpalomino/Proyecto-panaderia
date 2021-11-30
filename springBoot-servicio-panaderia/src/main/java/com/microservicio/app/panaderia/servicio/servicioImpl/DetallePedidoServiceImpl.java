package com.microservicio.app.panaderia.servicio.servicioImpl;

import com.microservicio.app.panaderia.dto.DetallePedidoCrearDto;
import com.microservicio.app.panaderia.dto.DetallePedidoDto;
import com.microservicio.app.panaderia.servicio.DetallePedidoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DetallePedidoServiceImpl implements DetallePedidoService {
    @Override
    public List<DetallePedidoDto> listadoDetallePedido() {
        return null;
    }

    @Override
    public DetallePedidoDto buscarDetallePedido(long id) {
        return null;
    }

    @Override
    public DetallePedidoDto actualizarDetallePedido(long id, DetallePedidoCrearDto detallePedidoCrearDto) {
        return null;
    }

    @Override
    public void nuevoDetallePedido(List<DetallePedidoCrearDto> detallePedidoCrearDto) {

    }

    @Override
    public void eliminarDetallePedido(long id) {

    }
}
