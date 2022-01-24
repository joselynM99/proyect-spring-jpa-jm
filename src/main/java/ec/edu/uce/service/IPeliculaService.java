package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Pelicula;

public interface IPeliculaService {

	void guardarPelicula(Pelicula pelicula);

	void actualizar(Pelicula pelicula);

	Pelicula buscar(Integer id);

	void borrar(Integer id);

	Pelicula buscarPeliculaPorDirector(String director);

	Pelicula buscarPeliculaPorDirectorTyped(String director);

	Pelicula buscarPeliculaPorDirectorNamed(String director);
}
