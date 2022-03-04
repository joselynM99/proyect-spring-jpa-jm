package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.CuentaHabiente;
import ec.edu.uce.repository.jpa.ICuentaHabienteRepo;

@Service
public class CuentaHabienteService implements ICuentaHabienteService {
	@Autowired
	private ICuentaHabienteRepo cuentaHabienteRepo;

	@Override
	public void insertar(CuentaHabiente cuentaHabiente) {
		this.cuentaHabienteRepo.insertar(cuentaHabiente);

	}

	@Override
	public void actualizar(CuentaHabiente cuentaHabiente) {
		this.cuentaHabienteRepo.actualizar(cuentaHabiente);

	}

	@Override
	public CuentaHabiente buscarPorID(Integer id) {
		return this.cuentaHabienteRepo.buscarPorID(id);
	}

	@Override
	public void borrarPorId(Integer id) {
		this.cuentaHabienteRepo.borrarPorId(id);
	}

	@Override
	public CuentaHabiente buscarPorCedula(String cedula) {

		return this.cuentaHabienteRepo.buscarPorCedula(cedula);
	}

}
