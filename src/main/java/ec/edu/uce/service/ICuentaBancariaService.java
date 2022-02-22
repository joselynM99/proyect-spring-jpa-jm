package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.CuentaBancaria;

public interface ICuentaBancariaService {
	void insertar(CuentaBancaria cuenta);

	CuentaBancaria buscar(Integer id);

	void actualizar(CuentaBancaria cuenta);
}
