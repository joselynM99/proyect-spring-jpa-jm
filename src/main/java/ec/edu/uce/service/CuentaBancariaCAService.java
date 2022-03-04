package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.CuentaBancariaCA;
import ec.edu.uce.repository.jpa.ICuentaBancariaCARepo;

@Service
public class CuentaBancariaCAService implements ICuentaBancariaCAService {

	@Autowired
	private ICuentaBancariaCARepo cuentaBancariaRepo;

	@Override
	public void insertar(CuentaBancariaCA cuentaBancaria) {
		this.cuentaBancariaRepo.insertar(cuentaBancaria);

	}

	@Override
	public void actualizar(CuentaBancariaCA cuentaBancaria) {
		this.cuentaBancariaRepo.actualizar(cuentaBancaria);

	}

	@Override
	public CuentaBancariaCA buscarPorID(Integer id) {
		return this.cuentaBancariaRepo.buscarPorID(id);
	}

	@Override
	public void borrarPorId(Integer id) {
		this.cuentaBancariaRepo.borrarPorId(id);

	}

	@Override
	public CuentaBancariaCA buscarPorNumero(String numero) {
		return this.cuentaBancariaRepo.buscarPorNumero(numero);
	}

}
