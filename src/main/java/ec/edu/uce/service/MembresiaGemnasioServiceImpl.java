package ec.edu.uce.service;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.MembresiaGimnasio;
import ec.edu.uce.repository.jpa.IMembresiaGimnasioRepo;

@Service
public class MembresiaGemnasioServiceImpl implements IMembresiaGimnasioService{
	
	@Autowired
	private IMembresiaGimnasioRepo membresiaRepo;

	@Override
	public void insertar(MembresiaGimnasio membresia) {
		this.membresiaRepo.insertar(membresia);
	}

	@Override
	public void actualizar(MembresiaGimnasio membresia) {
		this.membresiaRepo.actualizar(membresia);
	}

	@Override
	public MembresiaGimnasio buscarPorID(Integer id) {
		return this.membresiaRepo.buscarPorID(id);
	}

	@Override
	public void borrarPorId(Integer id) {
		this.membresiaRepo.borrarPorId(id);
	}
	
	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public MembresiaGimnasio buscarMembresiaPorCodigo(String codigo) {
		return this.membresiaRepo.buscarMembresiaPorCodigo(codigo);
	}

}
