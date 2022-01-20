package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
		return this.entityManager.find(Fruta.class, id);
	}

	@Override
	public void borrarFrutaPorId(Integer id) {
		Fruta frutaABorrar = this.buscarFrutaPorID(id);
		this.entityManager.remove(frutaABorrar);
	}

	@Override
	public Fruta buscarFrutaPorColor(String color) {
		// SQL: select * from fruta where color = 'col'

		// JPQL: select fr from Fruta fr where fr.color =:valor

		Query miQuery = this.entityManager.createQuery("select fr from Fruta fr where fr.color =:valor");
		miQuery.setParameter("valor", color);
		Fruta miFruta = (Fruta) miQuery.getSingleResult();
		return miFruta;
	}

}
