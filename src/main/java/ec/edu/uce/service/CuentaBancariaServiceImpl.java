package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.CuentaBancaria;
import ec.edu.uce.repository.jpa.ICuentaBancariaRepo;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService{

	@Autowired
	private ICuentaBancariaRepo cuentaRepo;
	@Override
	public void insertar(CuentaBancaria cuenta) {
		this.cuentaRepo.insertar(cuenta);
	}

	@Override
	public CuentaBancaria buscar(Integer id) {
		return this.cuentaRepo.buscar(id);
	}

	@Override
	public void actualizar(CuentaBancaria cuenta) {
		this.cuentaRepo.actualizar(cuenta);
	}

}
