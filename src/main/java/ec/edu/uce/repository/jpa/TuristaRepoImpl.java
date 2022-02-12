package ec.edu.uce.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Turista;

@Repository
@Transactional
public class TuristaRepoImpl implements ITuristaRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarTurista(Turista turista) {
		this.entityManager.persist(turista);
		
	}

	@Override
	public List<Turista> buscarTodosTuristas() {
		Query miQuery = this.entityManager.createQuery("select t from Turista t");
		return  miQuery.getResultList();
	}

}
