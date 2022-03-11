package ec.edu.uce.repository.jpa;

import java.util.List;

import ec.edu.uce.modelo.jpa.CuentaHabiente;
import ec.edu.uce.modelo.jpa.CuentaHabienteVIPTO;

public interface ICuentaHabienteRepo {
	void insertar(CuentaHabiente cuentaHabiente);

	void actualizar(CuentaHabiente cuentaHabiente);

	CuentaHabiente buscarPorID(Integer id);

	void borrarPorId(Integer id);
	
	CuentaHabiente buscarPorCedula(String cedula);

	List<CuentaHabienteVIPTO> cuentasHabientes();

}
