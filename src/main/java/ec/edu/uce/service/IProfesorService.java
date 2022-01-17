package ec.edu.uce.service;

import ec.edu.uce.modelo.Profesor;

public interface IProfesorService {
	void insertarProfesorNuevo(Profesor profesor);

	void borrarProfesorPorId(Integer id);

	void actualizarProfesor(Profesor libro);

	Profesor buscarProfesorPorID(Integer id);
}
