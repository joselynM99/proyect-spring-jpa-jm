package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.CuentaBancaria;

public interface ICuentaBancariaRepo {
	
	void insertar(CuentaBancaria cuenta);

	CuentaBancaria buscar(Integer id);

	void actualizar(CuentaBancaria cuenta);

}
