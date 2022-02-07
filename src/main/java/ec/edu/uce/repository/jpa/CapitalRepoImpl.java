package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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

}
