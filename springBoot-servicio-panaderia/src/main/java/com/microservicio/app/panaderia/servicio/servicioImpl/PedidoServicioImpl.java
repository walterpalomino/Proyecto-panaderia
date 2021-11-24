package com.microservicio.app.panaderia.servicio.servicioImpl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import com.microservicio.app.panaderia.dto.PedidoDto;
import com.microservicio.app.panaderia.servicio.PedidoServicio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.app.panaderia.entity.Pedido;
import com.microservicio.app.panaderia.repository.PedidoRepository;

@Service
@Slf4j
public class PedidoServicioImpl implements PedidoServicio {

	@Autowired
	PedidoRepository pedidoRepository;

	@Override
	public List<PedidoDto> findAll() {

		return pedidoRepository.findAll()
				.stream()
				.map(pedidoDto -> PedidoDto.builder()
						.id(pedidoDto.getId())
						.cliente(pedidoDto.getCliente())
						.importeTotal(pedidoDto.getImporteTotal())
						.fecha(pedidoDto.getFecha())
						.build())
				.collect(Collectors.toList());
	}

	@Override
	public Pedido addPedido(Pedido p) {

		
		
		try {
			/*
			 * pedidoId.setCliente(p.getCliente()); 
			 * pedidoId.setDetalle(p.getDetalle());
			 */
			  
				/*
				 * p.getDetalle().forEach(d -> pedido.getDetalle().add(new DetallePedido(new
				 * Producto(d.getProducto().getId(), d.getProducto().getNombre()),
				 * d.getCantidad())));
				 */
				 		  
			  
		      Pedido pedidoId = pedidoRepository.save(new Pedido(p.getCliente()));
		       
		 //     p.getDetalle().stream().map(d -> detalleRepo.save(new DetallePedido(d.getProducto(), d.getCantidad(),pedidoId))).collect(Collectors.toList());
		      
		       
		      return pedidoId;
		     
			
		} catch (Exception e) {

			log.error(e.getMessage());
			return null;
		}
		
	}

	@Override
	public Pedido findById(Long id) throws Exception {
		try {		
			Pedido p = pedidoRepository.findById(id).get();
			return p;
		} catch (NoSuchElementException e) {
			log.debug(e.getMessage());
			throw new NoSuchElementException("El usuario no existe " + id);
		}
		
	}

}
