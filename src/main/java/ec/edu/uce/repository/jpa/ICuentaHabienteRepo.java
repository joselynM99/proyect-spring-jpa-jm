package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.CuentaHabiente;

public interface ICuentaHabienteRepo {
	void insertar(CuentaHabiente cuentaHabiente);

	void actualizar(CuentaHabiente cuentaHabiente);

	CuentaHabiente buscarPorID(Integer id);

	void borrarPorId(Integer id);
	
	CuentaHabiente buscarPorCedula(String cedula);


}
