package com.microservicio.app.panaderia.servicio.servicioImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import com.microservicio.app.panaderia.servicio.PedidoServicio;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.app.panaderia.entity.Pedido;
import com.microservicio.app.panaderia.repository.DetallePedidoRepository;
import com.microservicio.app.panaderia.repository.PedidoRepository;

@Service
public class PedidoServicioImpl implements PedidoServicio {

	private final static Log log = LogFactory.getLog(PedidoServicioImpl.class);

	@Autowired
	PedidoRepository repo;
	
	@Autowired
	private DetallePedidoRepository detalleRepo;

	@Override
	public List<Pedido> findAll() {

		List<Pedido> listadoP = new ArrayList<>();

		try {

			listadoP = repo.findAll();

		} catch (Exception e) { 
			log.error(e);
		}
		return listadoP;
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
				 		  
			  
		      Pedido pedidoId = repo.save(new Pedido(p.getCliente()));
		       
		 //     p.getDetalle().stream().map(d -> detalleRepo.save(new DetallePedido(d.getProducto(), d.getCantidad(),pedidoId))).collect(Collectors.toList());
		      
		       
		      return pedidoId;
		     
			
		} catch (Exception e) {

			log.error(e);
			return null;
		}
		
	}

	@Override
	public Pedido findById(Long id) throws Exception {
		try {		
			Pedido p = repo.findById(id).get();
			return p;
		} catch (NoSuchElementException e) {
			log.debug(e.getMessage());
			throw new NoSuchElementException("El usuario no existe " + id);
		}
		
	}

}
