package ec.edu.uce.service;

import ec.edu.uce.modelo.Cuenta;

public interface ICuentaService {
	
	void insertarCuentaNueva(Cuenta cuenta);
	
	void borrarCuentaPorId(Integer id);

	void actualizarCuenta(Cuenta cuenta);

	Cuenta buscarCuentaPorID(Integer id);

}
