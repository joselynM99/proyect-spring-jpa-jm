package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Casa;
import ec.edu.uce.repository.ICasaRepo;

@Service
public class CasaService implements ICasaService {
	
	@Autowired
	private ICasaRepo casaRepo;

	@Override
	public void insertarCasaNueva(Casa casa) {
		this.casaRepo.insertarCasa(casa);
	}

}
