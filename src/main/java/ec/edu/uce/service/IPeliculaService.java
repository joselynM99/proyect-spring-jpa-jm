package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Pelicula;

public interface IPeliculaService {
	void guardarPelicula(Pelicula pelicula);
	void actualizar(Pelicula pelicula);
}
