package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Avion;

@Repository
@Transactional
public class AvionRepoImpl implements IAvionRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarAvion(Avion avion) {
		this.entityManager.persist(avion);
	}

	@Override
	public void actualizarAvion(Avion avion) {
		this.entityManager.merge(avion);
	}

	@Override
	public Avion buscarAvionPorID(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarAvionPorId(Integer id) {
		// TODO Auto-generated method stub

	}

}
