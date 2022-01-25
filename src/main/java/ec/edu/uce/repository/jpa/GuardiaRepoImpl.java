package ec.edu.uce.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Guardia;

@Repository
@Transactional
public class GuardiaRepoImpl implements IGuardiaRepo {

	private static final Logger LOG = LoggerFactory.getLogger(GuardiaRepoImpl.class);
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarGuardia(Guardia guardia) {
		this.entityManager.persist(guardia);

	}

	@Override
	public void actualizarGuardia(Guardia guardia) {
		this.entityManager.merge(guardia);
	}

	@Override
	public Guardia buscarGuardiaPorID(Integer id) {
		return this.entityManager.find(Guardia.class, id);
	}

	@Override
	public void borrarGuardiaPorId(Integer id) {
		Guardia guardiaABorrar = this.buscarGuardiaPorID(id);
		this.entityManager.remove(guardiaABorrar);

	}

	public Guardia buscarListaGuardiasPorApellido(String apellido) {
		Query miQuery = this.entityManager.createQuery("select g from Guardia g where g.apellido =:valor");
		miQuery.setParameter("valor", apellido);
		List<Guardia> listaGuardias = miQuery.getResultList();

		if (!listaGuardias.isEmpty()) {
			LOG.info("No existe un resultado para: " + apellido);
			return listaGuardias.get(0);
		} else {
			return null;
		}
	}

	@Override
	public Guardia buscarGuardiaPorApellido(String apellido) {
		// SQL: select * from guardia where apellido = 'Martines'

		// JPQL: select g from Guardia g where g.apellido =:valor
		Guardia g = null;
		try {
			Query miQuery = this.entityManager.createQuery("select g from Guardia g where g.apellido =:valor");
			miQuery.setParameter("valor", apellido);
			g = (Guardia) miQuery.getSingleResult();

		} catch (NoResultException e) {
			LOG.error("No existe un resultado para: " + apellido, e);

		}
		return g;

	}

	/**
	 * Metodo igual que el metodo buscarGuardiaPorApellido, pero con TypedQuery
	 */
	@Override
	public Guardia buscarGuardiasPorApellidoType(String apellido) {

		TypedQuery<Guardia> myTypedQuery = (TypedQuery<Guardia>) this.entityManager
				.createQuery("select g from Guardia g where g.apellido =:valor");
		myTypedQuery.setParameter("valor", apellido);
		return myTypedQuery.getSingleResult();
	}

	/**
	 * Metodo igual que buscarGuardiaPorApellido pero con NamedQuery
	 */
	@Override
	public Guardia buscarGuardiasPorApellidoNamed(String apellido) {
		Query miQuery = this.entityManager.createNamedQuery("Guardia.buscarPorApellido");
		miQuery.setParameter("valor", apellido);
		return (Guardia) miQuery.getSingleResult();
	}

	@Override
	public Guardia buscarGuardiasPorApellidoNative(String apellido) {
		Query miQuery = this.entityManager.createNativeQuery("select * from guardia g where g.apellido =:valor",
				Guardia.class);
		miQuery.setParameter("valor", apellido);
		return (Guardia) miQuery.getSingleResult();

	}

}
