package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.PolizaSeguro;
import ec.edu.uce.repository.jpa.IPolizaSeguroRepo;

@Service
public class PolizaSeguroServiceImpl implements IPolizaSeguroService{

	@Autowired
	private IPolizaSeguroRepo polizaSeguroRepo;
	
	@Override
	public void insertar(PolizaSeguro polizaSeguro) {
		this.polizaSeguroRepo.insertar(polizaSeguro);
	}

	@Override
	public void actualizar(PolizaSeguro polizaSeguro) {
		this.polizaSeguroRepo.actualizar(polizaSeguro);
	}

	@Override
	public PolizaSeguro buscarPorID(Integer id) {
		return this.polizaSeguroRepo.buscarPorID(id);
	}

	@Override
	public void borrarPorId(Integer id) {
		this.polizaSeguroRepo.borrarPorId(id);
	}

}
