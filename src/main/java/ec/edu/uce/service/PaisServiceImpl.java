package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Pais;
import ec.edu.uce.repository.jpa.IPaisRepo;

@Service
public class PaisServiceImpl implements IPaisService {

	@Autowired
	private IPaisRepo paisRepo;

	@Override
	public void guardarPais(Pais pais) {
		this.paisRepo.insertarPais(pais);
	}

}
