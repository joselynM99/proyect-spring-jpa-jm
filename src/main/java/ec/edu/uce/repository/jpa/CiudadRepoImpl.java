package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Ciudad;

@Repository
@Transactional
public class CiudadRepoImpl implements ICiudadRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarCiudad(Ciudad ciudad) {
		this.entityManager.persist(ciudad);
	}

	@Override
	public void actualizarCiudad(Ciudad ciudad) {
		this.entityManager.merge(ciudad);
	}

	@Override
	public Ciudad buscarCiudadPorID(Integer id) {
		return this.entityManager.find(Ciudad.class, id);
	}

	@Override
	public void borrarCiudadPorId(Integer id) {
		Ciudad ciudadABorrar = this.buscarCiudadPorID(id);
		this.entityManager.remove(ciudadABorrar);
	}

	@Override
	public Ciudad buscarCiudadPorNombre(String nombre) {
		// SQL: select * from ciudad where nombre = 'nom'

		// JPQL: select c from Ciudad c where c.nombre =:valor

		Query miQuery = this.entityManager.createQuery("select c from Ciudad c where c.nombre =:valor");
		miQuery.setParameter("valor", nombre);
		Ciudad miCiudad = (Ciudad) miQuery.getSingleResult();
		return miCiudad;
	}

	@Override
	public Ciudad buscarCiudadPorNombreType(String nombre) {
		TypedQuery<Ciudad> myTypedQuery = (TypedQuery<Ciudad>) this.entityManager
				.createQuery("select c from Ciudad c where c.nombre =:valor");
		myTypedQuery.setParameter("valor", nombre);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Ciudad buscarCiudadPorNombreNemed(String nombre) {
		Query miQuery = this.entityManager.createNamedQuery("Ciudad.buscarPorNombre");
		miQuery.setParameter("valor", nombre);
		return (Ciudad) miQuery.getSingleResult();
	}

	@Override
	public Ciudad buscarCiudadPorNombreNativ(String nombre) {
		Query miQuery = this.entityManager.createNativeQuery("select * from ciudad c where c.nombre =:valor",
				Ciudad.class);
		miQuery.setParameter("valor", nombre);
		return (Ciudad) miQuery.getSingleResult();
	}

}
