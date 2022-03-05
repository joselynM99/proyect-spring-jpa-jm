package ec.edu.uce.service;

import java.math.BigDecimal;

import ec.edu.uce.modelo.jpa.CuentaBancaria;

public interface ICuentaBancariaService {
	void insertar(CuentaBancaria cuenta);

	CuentaBancaria buscarPorNumero(String numero);

	void actualizar(CuentaBancaria cuenta);
	
	void propagacionMandatory();
	
	void realizarTransferencia(String cuentaOrigen, String cuentaDestino, BigDecimal saldoTransferir);

	void realizarTransferenciaExpress(String cuentaOrigen, String cuentaDestino, BigDecimal saldoTransferir);

	void realizarTransferenciaExpressInicial(String cuentaOrigen, String cuentaDestino, BigDecimal saldoTransferir);

	void realizarTransferenciaExpressInicialNot(String cuentaOrigen, String cuentaDestino, BigDecimal saldoTransferir);

	void enviarEmail();

	void enviarEmailNoT();
}
