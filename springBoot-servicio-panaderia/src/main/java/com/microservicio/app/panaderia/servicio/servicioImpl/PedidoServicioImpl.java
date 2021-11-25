package com.microservicio.app.panaderia.servicio.servicioImpl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import com.microservicio.app.panaderia.dto.PedidoCrearDto;
import com.microservicio.app.panaderia.dto.PedidoDto;
import com.microservicio.app.panaderia.servicio.PedidoServicio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public PedidoDto addPedido(PedidoCrearDto pedidoCrearDto) {

		return new PedidoDto(pedidoRepository.save(pedidoCrearDto.toPedido()));
	}

	@Override
	public PedidoDto findById(Long id){

		return	pedidoRepository.findById(id)
					.map(pedidoDto -> PedidoDto.builder()
							.id(pedidoDto.getId())
							.cliente(pedidoDto.getCliente())
							.importeTotal(pedidoDto.getImporteTotal())
							.fecha(pedidoDto.getFecha())
							.build())
					.orElseThrow(() -> new NoSuchElementException("El pedido con id " + id + " no existe"));

	}

	@Override
	public PedidoDto updatePedido(long id, PedidoCrearDto pedidoCrearDto) {
		return null;
	}

	@Override
	public void deletePedido(long id) {

	}

}
