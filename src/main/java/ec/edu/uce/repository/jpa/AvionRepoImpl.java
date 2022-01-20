package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
		return this.entityManager.find(Avion.class, id);
	}

	@Override
	public void borrarAvionPorId(Integer id) {
		Avion avionABorrar = this.buscarAvionPorID(id);
		this.entityManager.remove(avionABorrar);
	}

	@Override
	public Avion buscarPorModelo(String modelo) {

		// SQL: select * from avion where modelo = 'mod'

		// JPQL: select a from Avion a where a.modelo =:valor 
		
		Query miQuery = this.entityManager.createQuery("select a from Avion a where a.modelo =:valor");
		miQuery.setParameter("valor", modelo);
		Avion miAvion = (Avion) miQuery.getSingleResult();
		return miAvion;
		
	}

}
