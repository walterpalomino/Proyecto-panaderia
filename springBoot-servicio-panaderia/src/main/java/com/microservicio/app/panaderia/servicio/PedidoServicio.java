package com.microservicio.app.panaderia.servicio;

import java.util.List;

import com.microservicio.app.panaderia.dto.PedidoCrearDto;
import com.microservicio.app.panaderia.dto.PedidoDto;
import com.microservicio.app.panaderia.entity.Pedido;

public interface PedidoServicio {

	public List<PedidoDto> findAll();
	public PedidoDto addPedido(PedidoCrearDto pedidoCrearDto);
	public PedidoDto findById(Long id);
	public PedidoDto updatePedido(long id, PedidoCrearDto pedidoCrearDto);
	public void deletePedido(long id);
	
}
