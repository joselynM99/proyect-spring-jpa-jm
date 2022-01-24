package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Pelicula;

public interface IPeliculaRepo {

	void insertarPelicula(Pelicula pelicula);

	void actualizarPelicula(Pelicula pelicula);

	Pelicula buscarPeliculaPorID(Integer id);

	void borrarPeliculaPorId(Integer id);
	
	Pelicula buscarPeliculaPorDirector(String director);
	
	Pelicula buscarPeliculaPorDirectorTyped(String director);
	
	Pelicula buscarPeliculaPorDirectorNamed(String director);
}
