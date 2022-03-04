package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.CuentaHabiente;

public interface ICuentaHabienteService {
	void insertar(CuentaHabiente cuentaHabiente);

	void actualizar(CuentaHabiente cuentaHabiente);

	CuentaHabiente buscarPorID(Integer id);

	void borrarPorId(Integer id);
	
	CuentaHabiente buscarPorCedula(String cedula);
}
