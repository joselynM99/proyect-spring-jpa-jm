package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Profesor;
import ec.edu.uce.repository.IProfesorRepo;

@Service
public class ProfesorServiceImpl implements IProfesorService {

	@Autowired
	private IProfesorRepo profRepo;

	@Override
	public void insertarProfesorNuevo(Profesor profesor) {
		this.profRepo.insertarProfesor(profesor);
	}

	@Override
	public void borrarProfesorPorId(Integer id) {
		this.profRepo.borrarProfesor(id);		
	}

	@Override
	public void actualizarProfesor(Profesor libro) {
		this.profRepo.actualizarProfesor(libro);		
	}

	@Override
	public Profesor buscarProfesorPorID(Integer id) {
		// TODO Auto-generated method stub
		return this.profRepo.buscarProfesor(id);
	}

}
