package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import ec.edu.uce.modelo.jpa.TarjetaCredito;

public interface ITarjetaCreditoService {

	void insertar(TarjetaCredito tarjeta);

	void actualizar(TarjetaCredito tarjeta);

	void compra(String numero, BigDecimal valorCompra, LocalDateTime fecha);
}
