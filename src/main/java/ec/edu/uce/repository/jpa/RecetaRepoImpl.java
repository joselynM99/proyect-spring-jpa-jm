package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Receta;

@Repository
@Transactional
public class RecetaRepoImpl implements IRecetaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarReceta(Receta receta) {
		this.entityManager.persist(receta);
	}

}
