package ec.edu.uce.repository;

import ec.edu.uce.modelo.Profesor;

public interface IProfesorRepo {

	void insertarProfesor(Profesor profesor);

	Profesor buscarProfesor(Integer id);

	void actualizarProfesor(Profesor profesor);

	void borrarProfesor(Integer id);

}
