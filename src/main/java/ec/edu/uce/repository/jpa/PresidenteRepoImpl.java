package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Presidente;

@Repository
@Transactional
public class PresidenteRepoImpl implements IPresidenteRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarPresidente(Presidente presidente) {
		this.entityManager.persist(presidente);
	}

}
