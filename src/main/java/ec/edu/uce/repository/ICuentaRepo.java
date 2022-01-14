package ec.edu.uce.repository;

import ec.edu.uce.modelo.Cuenta;

public interface ICuentaRepo {

	void insertarCuenta(Cuenta cuenta);

	Cuenta buscarCuenta(Integer id);

	void actualizarCuenta(Cuenta cuenta);

	void borrarCuenta(Integer id);

}
