package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.CuentaBancariaCA;

public interface ICuentaBancariaCARepo {
	
	void insertar(CuentaBancariaCA cuentaBancaria);

	void actualizar(CuentaBancariaCA cuentaBancaria);

	CuentaBancariaCA buscarPorID(Integer id);

	void borrarPorId(Integer id);
	
	CuentaBancariaCA buscarPorNumero(String numero);

}
