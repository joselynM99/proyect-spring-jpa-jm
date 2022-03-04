package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.HistoricoRetiros;
import ec.edu.uce.repository.jpa.IHistoricoRetirosRepo;

@Service
public class HistoricoRetirosService implements IHistoricoRetirosService {

	@Autowired
	private IHistoricoRetirosRepo historicoRepo;

	@Override
	public void insertar(HistoricoRetiros retiros) {
		this.historicoRepo.insertar(retiros);
	}

	@Override
	public void actualizar(HistoricoRetiros retiros) {
		this.historicoRepo.actualizar(retiros);
	}

	@Override
	public HistoricoRetiros buscarPorID(Integer id) {
		return this.historicoRepo.buscarPorID(id);
	}

	@Override
	public void borrarPorId(Integer id) {
		this.historicoRepo.borrarPorId(id);

	}

}
