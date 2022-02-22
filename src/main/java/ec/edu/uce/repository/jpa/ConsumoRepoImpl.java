package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Consumo;

@Transactional
@Repository
public class ConsumoRepoImpl implements IConsumoRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Consumo consumo) {
		this.entityManager.persist(consumo);

	}

	@Override
	public void actualizar(Consumo consumo) {
		this.entityManager.merge(consumo);
	}

}
