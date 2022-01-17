package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Cuenta;
import ec.edu.uce.repository.ICuentaRepo;

@Service
public class CuentaServiceImpl implements ICuentaService {

	@Autowired
	private ICuentaRepo cuentaRepo;

	@Override
	public void insertarCuentaNueva(Cuenta cuenta) {
		this.cuentaRepo.insertarCuenta(cuenta);
	}

	@Override
	public void borrarCuentaPorId(Integer id) {
		this.cuentaRepo.borrarCuenta(id);
	}

	@Override
	public void actualizarCuenta(Cuenta cuenta) {
		this.cuentaRepo.actualizarCuenta(cuenta);
	}

	@Override
	public Cuenta buscarCuentaPorID(Integer id) {
		// TODO Auto-generated method stub
		return this.cuentaRepo.buscarCuenta(id);
	}

}
