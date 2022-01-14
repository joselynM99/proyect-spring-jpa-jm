package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.repository.IEstudianteRepo;

@Service
public class VehiculoServiceImpl implements IEstudienteService {
	
	@Autowired
	private IEstudianteRepo estudianteRepo;


	@Override
	public void insertarEstudianteNuevo(Estudiante estudiante) {
		this.estudianteRepo.insertarEstudiante(estudiante);
		
	}

}
