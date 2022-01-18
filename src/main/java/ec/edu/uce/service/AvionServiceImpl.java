package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Avion;
import ec.edu.uce.repository.jpa.IAvionRepo;

@Service
public class AvionServiceImpl implements IAvionService {

	@Autowired
	private IAvionRepo avionRepo;

	@Override
	public void guardarAvion(Avion avion) {
		this.avionRepo.insertarAvion(avion);
	}

	@Override
	public void actualizar(Avion avion) {
		this.avionRepo.actualizarAvion(avion);
	}

}
