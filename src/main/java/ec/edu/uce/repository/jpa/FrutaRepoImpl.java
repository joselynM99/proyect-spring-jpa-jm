package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Fruta;

@Repository
@Transactional
public class FrutaRepoImpl implements IFrutaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarFruta(Fruta guardia) {
		this.entityManager.persist(guardia);
	}

	@Override
	public void actualizarFruta(Fruta guardia) {
		this.entityManager.merge(guardia);
	}

	@Override
	public Fruta buscarFrutaPorID(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarFrutaPorId(Integer id) {
		// TODO Auto-generated method stub

	}

}
