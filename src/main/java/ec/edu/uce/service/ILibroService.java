package ec.edu.uce.service;

import ec.edu.uce.modelo.Libro;

public interface ILibroService {

	void insertarLibroNuevo(Libro libro);

	void borrarLibroPorId(Integer id);

	void actualizarLibro(Libro libro);

	Libro buscarLibroPorID(Integer id);

}
