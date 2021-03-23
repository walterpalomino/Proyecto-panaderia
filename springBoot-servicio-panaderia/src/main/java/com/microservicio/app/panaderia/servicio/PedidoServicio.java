package com.microservicio.app.panaderia.servicio;

import java.util.List;

import com.microservicio.app.panaderia.entity.Pedido;

public interface PedidoServicio {

	public List<Pedido> findAll();
	public Pedido addPedido(Pedido p);
	public Pedido findById(Long id) throws Exception;
	
}
