package ec.edu.uce.service;

import ec.edu.uce.modelo.Estudiante;

public interface IEstudienteService {
	void insertarEstudianteNuevo(Estudiante estudiante);

	void borrarEstudiantePorId(Integer id);

	void actualizarEstudiante(Estudiante estudiante);

	Estudiante buscarEstudiantePorID(Integer id);
}
