package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.modelo.jpa.CuentaHabiente;
import ec.edu.uce.modelo.jpa.CuentaHabienteVIPTO;

public interface ICuentaHabienteService {
	void insertar(CuentaHabiente cuentaHabiente);

	void actualizar(CuentaHabiente cuentaHabiente);

	CuentaHabiente buscarPorID(Integer id);

	void borrarPorId(Integer id);
	
	CuentaHabiente buscarPorCedula(String cedula);

	List<CuentaHabienteVIPTO> cuentasHabientes();
}
