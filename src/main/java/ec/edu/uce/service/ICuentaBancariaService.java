package ec.edu.uce.service;

import java.math.BigDecimal;

import ec.edu.uce.modelo.jpa.CuentaBancaria;

public interface ICuentaBancariaService {
	void insertar(CuentaBancaria cuenta);

	CuentaBancaria buscarPorNumero(String numero);

	void actualizar(CuentaBancaria cuenta);
	
	void realizarTransferencia(String cuentaOrigen, String cuentaDestino, BigDecimal saldoTransferir);
}
