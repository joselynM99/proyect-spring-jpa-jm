package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
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

	@Override
	public Fruta buscarFrutaPorColorTyped(String color) {
		TypedQuery<Fruta> myTypedQuery = (TypedQuery<Fruta>) this.entityManager
				.createQuery("select fr from Fruta fr where fr.color =:valor");
		myTypedQuery.setParameter("valor", color);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Fruta buscarFrutaPorColorNamed(String color) {
		Query miQuery = this.entityManager.createNamedQuery("Fruta.buscarPorColor");
		miQuery.setParameter("valor", color);
		return (Fruta) miQuery.getSingleResult();
	}

	@Override
	public Fruta buscarFrutaPorColorNative(String color) {
		Query miQuery = this.entityManager.createNativeQuery("select * from fruta fr where fr.color =:valor",
				Fruta.class);
		miQuery.setParameter("valor", color);
		return (Fruta) miQuery.getSingleResult();
	}

	@Override
	public Fruta buscarFrutaPorColorNamedNative(String color) {
		Query miQuery = this.entityManager.createNamedQuery("Fruta.buscarPorColorNative", Fruta.class);
		miQuery.setParameter("valor", color);
		return (Fruta) miQuery.getSingleResult();
	}

	@Override
	public Fruta buscarFrutaPorColorCriteriaAPI(String color) {
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();

		CriteriaQuery<Fruta> myQuery = myCriteria.createQuery(Fruta.class);
		
		Root<Fruta> myTable = myQuery.from(Fruta.class);
		
		Predicate p1 = myCriteria.equal(myTable.get("color"), color);
		
		myQuery.select(myTable).where(p1);
		
		TypedQuery<Fruta> typedQuery = this.entityManager.createQuery(myQuery);
		
		return typedQuery.getSingleResult();
	}

}
