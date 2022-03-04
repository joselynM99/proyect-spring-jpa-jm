package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.CuentaBancariaCA;

public interface ICuentaBancariaCAService {
	void insertar(CuentaBancariaCA cuentaBancaria);

	void actualizar(CuentaBancariaCA cuentaBancaria);

	CuentaBancariaCA buscarPorID(Integer id);

	void borrarPorId(Integer id);
	
	CuentaBancariaCA buscarPorNumero(String numero);

}
