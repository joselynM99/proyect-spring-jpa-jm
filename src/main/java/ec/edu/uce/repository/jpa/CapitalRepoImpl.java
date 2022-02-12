package ec.edu.uce.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Capital;

@Repository
@Transactional
public class CapitalRepoImpl implements ICapitalRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarCapital(Capital capital) {
		this.entityManager.persist(capital);
	}

	@Override
	public List<Capital> buscarCapitalPorPoblacionJOIN(Integer poblacion) {
		TypedQuery<Capital> myQuery = this.entityManager.createQuery(
				"SELECT c FROM Capital c JOIN c.provincia p WHERE c.poblacion <=: poblacion", Capital.class);
		myQuery.setParameter("poblacion", poblacion);
		return myQuery.getResultList();
	}

	@Override
	public List<Capital> buscarCapitalPorPoblacionLEFTJOIN(Integer poblacion) {
		TypedQuery<Capital> myQuery = this.entityManager.createQuery(
				"SELECT c FROM Capital c LEFT JOIN c.provincia p WHERE c.poblacion <=: poblacion", Capital.class);
		myQuery.setParameter("poblacion", poblacion);
		return myQuery.getResultList();
	}

	@Override
	public List<Capital> buscarCapitalPorPoblacionRIGHTJOIN(Integer poblacion) {
		TypedQuery<Capital> myQuery = this.entityManager.createQuery(
				"SELECT c FROM Capital c RIGHT JOIN c.provincia p WHERE c.poblacion <=: poblacion", Capital.class);
		myQuery.setParameter("poblacion", poblacion);
		return myQuery.getResultList();
	}

	@Override
	public List<Capital> buscarCapitalPorPoblacionWHERE(Integer poblacion) {
		TypedQuery<Capital> myQuery = this.entityManager.createQuery(
				"SELECT c FROM Capital c, Provincia p WHERE c = p.capital AND c.poblacion <=: poblacion",
				Capital.class);
		myQuery.setParameter("poblacion", poblacion);

		return myQuery.getResultList();
	}

}
