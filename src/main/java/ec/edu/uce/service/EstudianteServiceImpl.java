package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.repository.IEstudianteRepo;

@Service
public class EstudianteServiceImpl implements IEstudienteService {

	@Autowired
	private IEstudianteRepo estuRepo;

	@Override
	public void insertarEstudianteNuevo(Estudiante estudiante) {
		this.estuRepo.insertarEstudiante(estudiante);
	}

	@Override
	public void borrarEstudiantePorId(Integer id) {
		this.estuRepo.borrarEstudiante(id);
	}

	@Override
	public void actualizarEstudiante(Estudiante estudiante) {
		this.estuRepo.actualizarEstudiante(estudiante);
	}

	@Override
	public Estudiante buscarEstudiantePorID(Integer id) {
		// TODO Auto-generated method stub
		return this.estuRepo.buscarEstudiante(id);
	}

}
