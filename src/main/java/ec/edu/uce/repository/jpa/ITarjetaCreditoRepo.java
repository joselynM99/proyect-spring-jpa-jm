package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.TarjetaCredito;

public interface ITarjetaCreditoRepo {

	void insertar(TarjetaCredito tarjeta);

	void actualizar(TarjetaCredito tarjeta);

	TarjetaCredito buscarTarjetaPorNumero(String numero);

}
