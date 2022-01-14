package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Cancion;
import ec.edu.uce.repository.ICancionRepo;

@Service
public class CancionServiceImpl implements ICancionService{
	@Autowired
	private ICancionRepo cancionRepo;

	@Override
	public void insertarCancionNueva(Cancion cancion) {
		this.cancionRepo.insertarCancion(cancion);		
	}

}
