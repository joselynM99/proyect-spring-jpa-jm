package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Pais;

@Repository
@Transactional
public class PaisRepoImpl implements IPaisRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertarPais(Pais pais) {
		this.entityManager.persist(pais);
	}

}
