package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Consumo;
import ec.edu.uce.modelo.jpa.TarjetaCredito;
import ec.edu.uce.repository.jpa.IConsumoRepo;
import ec.edu.uce.repository.jpa.ITarjetaCreditoRepo;

@Service
public class TarjetaCreditoServiceImpl implements ITarjetaCreditoService {

	@Autowired
	private ITarjetaCreditoRepo tarjetaRepo;
	@Autowired
	private IConsumoRepo consumoRepo;

	@Override
	public void insertar(TarjetaCredito tarjeta) {
		this.tarjetaRepo.insertar(tarjeta);

	}

	@Override
	public void actualizar(TarjetaCredito tarjeta) {
		this.tarjetaRepo.actualizar(tarjeta);
	}

	@Override
	@Transactional
	public void compra(String numero, BigDecimal valorCompra, LocalDateTime fecha) {

		TarjetaCredito t = this.tarjetaRepo.buscarTarjetaPorNumero(numero);
		List<Consumo> lista = new ArrayList<>();
		Consumo consumo = new Consumo();
		consumo.setFecha(fecha);
		consumo.setValor(valorCompra);
		consumo.setTarjetaCredito(t);
		this.consumoRepo.insertar(consumo);
		lista.add(consumo);

		t.setCedulaPropietario(null);
		t.setConsumos(lista);
		t.setCupo(t.getCupo().subtract(valorCompra));
		this.actualizar(t);

	}

}
