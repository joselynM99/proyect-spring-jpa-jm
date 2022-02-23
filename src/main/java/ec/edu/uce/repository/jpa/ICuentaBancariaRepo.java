package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.CuentaBancaria;

public interface ICuentaBancariaRepo {

	void insertar(CuentaBancaria cuenta);

	CuentaBancaria buscarPorNumero(String numero);

	void actualizar(CuentaBancaria cuenta);

	void actualizar2(CuentaBancaria cuenta);

}
