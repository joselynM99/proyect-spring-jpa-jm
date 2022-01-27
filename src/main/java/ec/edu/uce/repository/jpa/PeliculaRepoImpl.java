package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
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
		return this.entityManager.find(Pelicula.class, id);
	}

	@Override
	public void borrarPeliculaPorId(Integer id) {
		Pelicula peliculaABorrar = this.buscarPeliculaPorID(id);
		this.entityManager.remove(peliculaABorrar);
	}

	@Override
	public Pelicula buscarPeliculaPorDirector(String director) {
		// SQL: select * from pelicula where director = 'dir'

		// JPQL: select p from Pelicula p where p.director =:valor

		Query miQuery = this.entityManager.createQuery("select p from Pelicula p where p.director =:valor");
		miQuery.setParameter("valor", director);
		Pelicula miPelicula = (Pelicula) miQuery.getSingleResult();
		return miPelicula;
	}

	@Override
	public Pelicula buscarPeliculaPorDirectorTyped(String director) {
		TypedQuery<Pelicula> myTypedQuery = (TypedQuery<Pelicula>) this.entityManager
				.createQuery("select p from Pelicula p where p.director =:valor");
		myTypedQuery.setParameter("valor", director);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Pelicula buscarPeliculaPorDirectorNamed(String director) {
		Query miQuery = this.entityManager.createNamedQuery("Pelicula.buscarPorDirector");
		miQuery.setParameter("valor", director);
		return (Pelicula) miQuery.getSingleResult();
	}

	@Override
	public Pelicula buscarPeliculaPorDirectorNative(String director) {
		Query miQuery = this.entityManager.createNativeQuery("select * from pelicula p where p.director =:valor",
				Pelicula.class);
		miQuery.setParameter("valor", director);
		return (Pelicula) miQuery.getSingleResult();
	}

	@Override
	public Pelicula buscarPeliculaPorDirectorNamedNative(String director) {
		Query miQuery = this.entityManager.createNamedQuery("Pelicula.buscarPorDirectorNative", Pelicula.class);
		miQuery.setParameter("valor", director);
		return (Pelicula) miQuery.getSingleResult();

	}

	@Override
	public Pelicula buscarPeliculaPorDirectorCriteriaAPI(String director) {
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();

		CriteriaQuery<Pelicula> myQuery = myCriteria.createQuery(Pelicula.class);
		
		Root<Pelicula> myTable = myQuery.from(Pelicula.class);
		
		Predicate p1 = myCriteria.equal(myTable.get("director"), director);
		
		myQuery.select(myTable).where(p1);
		
		TypedQuery<Pelicula> typedQuery = this.entityManager.createQuery(myQuery);
		
		return typedQuery.getSingleResult();
	}

}
