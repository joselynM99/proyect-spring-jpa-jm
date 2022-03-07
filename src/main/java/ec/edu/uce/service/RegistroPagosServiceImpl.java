package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.RegistroPagoMembresia;
import ec.edu.uce.repository.jpa.IRegistroPagoRepo;

@Service
public class RegistroPagosServiceImpl implements IRegistroPagoService {

	@Autowired
	private IRegistroPagoRepo registroPagoRepo;

	@Override
	public void insertar(RegistroPagoMembresia registro) {
		this.registroPagoRepo.insertar(registro);
	}

	@Override
	public void actualizar(RegistroPagoMembresia registro) {
		this.registroPagoRepo.actualizar(registro);
	}

	@Override
	public RegistroPagoMembresia buscarPorID(Integer id) {
		return this.registroPagoRepo.buscarPorID(id);
	}

	@Override
	public void borrarPorId(Integer id) {
		this.registroPagoRepo.borrarPorId(id);
	}

}
