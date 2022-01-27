package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Pelicula;
import ec.edu.uce.repository.jpa.IPeliculaRepo;

@Service
public class PeliculaServiceImpl implements IPeliculaService {

	@Autowired
	private IPeliculaRepo peliculaRepo;

	@Override
	public void guardarPelicula(Pelicula pelicula) {
		this.peliculaRepo.insertarPelicula(pelicula);
	}

	@Override
	public void actualizar(Pelicula pelicula) {
		this.peliculaRepo.actualizarPelicula(pelicula);
	}

	@Override
	public Pelicula buscar(Integer id) {
		return this.peliculaRepo.buscarPeliculaPorID(id);
	}

	@Override
	public void borrar(Integer id) {
		this.peliculaRepo.borrarPeliculaPorId(id);
	}

	@Override
	public Pelicula buscarPeliculaPorDirector(String director) {
		return this.peliculaRepo.buscarPeliculaPorDirector(director);
	}

	@Override
	public Pelicula buscarPeliculaPorDirectorTyped(String director) {
		return this.peliculaRepo.buscarPeliculaPorDirectorTyped(director);
	}

	@Override
	public Pelicula buscarPeliculaPorDirectorNamed(String director) {
		return this.peliculaRepo.buscarPeliculaPorDirectorNamed(director);
	}

	@Override
	public Pelicula buscarPeliculaPorDirectorNative(String director) {
		return this.peliculaRepo.buscarPeliculaPorDirectorNative(director);
	}

	@Override
	public Pelicula buscarPeliculaPorDirectorNamedNative(String director) {
		return this.peliculaRepo.buscarPeliculaPorDirectorNamedNative(director);
	}

	@Override
	public Pelicula buscarPeliculaPorDirectorCriteriaAPI(String director) {
		return this.peliculaRepo.buscarPeliculaPorDirectorCriteriaAPI(director);
	}

}
