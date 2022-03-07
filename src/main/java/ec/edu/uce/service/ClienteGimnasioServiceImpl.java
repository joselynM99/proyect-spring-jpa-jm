package ec.edu.uce.service;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.ClienteGimnasio;
import ec.edu.uce.repository.jpa.IClienteGimnasioRepo;

@Service
public class ClienteGimnasioServiceImpl implements IClienteGimnasioService{

	@Autowired
	private IClienteGimnasioRepo clienteRepo;
	
	@Override
	public void insertar(ClienteGimnasio cliente) {
		this.clienteRepo.insertar(cliente);
	}

	@Override
	public void actualizar(ClienteGimnasio cliente) {
		this.clienteRepo.actualizar(cliente);
	}

	@Override
	public ClienteGimnasio buscarPorID(Integer id) {
		return this.clienteRepo.buscarPorID(id);
	}

	@Override
	public void borrarPorId(Integer id) {
		this.clienteRepo.borrarPorId(id);
	}
	
	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public ClienteGimnasio buscarClientePorCedula(String cedula) {
		return this.clienteRepo.buscarClientePorCedula(cedula);
	}

}
