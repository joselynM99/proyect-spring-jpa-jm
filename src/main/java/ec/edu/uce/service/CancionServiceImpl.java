package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Cancion;
import ec.edu.uce.repository.ICancionRepo;

@Service
public class CancionServiceImpl implements ICancionService {
	@Autowired
	private ICancionRepo cancionRepo;

	@Override
	public void insertarCancionNueva(Cancion cancion) {
		this.cancionRepo.insertarCancion(cancion);
	}

	@Override
	public void borrarCancionPorId(Integer id) {
		this.cancionRepo.borrarCancion(id);
	}

	@Override
	public void actualizarCancion(Cancion cancion) {
		this.cancionRepo.actualizarCancion(cancion);
	}

	@Override
	public Cancion buscarCancionPorID(Integer id) {
		return this.cancionRepo.buscarCancion(id);
	}

}
