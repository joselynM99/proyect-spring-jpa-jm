package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Pelicula;

@Repository
@Transactional
public class PeliculaRepoImpl implements IPeliculaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarPelicula(Pelicula pelicula) {
		this.entityManager.persist(pelicula);
	}

	@Override
	public void actualizarPelicula(Pelicula pelicula) {
		this.entityManager.merge(pelicula);
	}

	@Override
	public Pelicula buscarPeliculaPorID(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarPeliculaPorId(Integer id) {
		// TODO Auto-generated method stub

	}

}
