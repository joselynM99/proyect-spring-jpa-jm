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

	@Override
	public Avion buscarPorModeloType(String modelo) {
		TypedQuery<Avion> myTypedQuery = (TypedQuery<Avion>) this.entityManager
				.createQuery("select a from Avion a where a.modelo =:valor");
		myTypedQuery.setParameter("valor", modelo);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Avion buscarPorModeloNamed(String modelo) {
		Query miQuery = this.entityManager.createNamedQuery("Avion.buscarPorModelo");
		miQuery.setParameter("valor", modelo);
		return (Avion) miQuery.getSingleResult();

	}

	@Override
	public Avion buscarPorModeloNative(String modelo) {
		Query miQuery = this.entityManager.createNativeQuery("select * from avion a where a.modelo =:valor",
				Avion.class);
		miQuery.setParameter("valor", modelo);
		return (Avion) miQuery.getSingleResult();
	}

	@Override
	public Avion buscarPorModeloNamedNative(String modelo) {
		Query miQuery = this.entityManager.createNamedQuery("Avion.buscarPorModeloNative", Avion.class);
		miQuery.setParameter("valor", modelo);
		return (Avion) miQuery.getSingleResult();
	}

	@Override
	public Avion buscarPorModeloCriterialAPI(String modelo) {
		// Se le dice a entityMAnager cómo trabajar, con qué tipo
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();

		// Creando un Query que retorna un guardia, especificar el tipo de retorno
		CriteriaQuery<Avion> myQuery = myCriteria.createQuery(Avion.class);

		// Se empieza a construir el SQL
		Root<Avion> myTable = myQuery.from(Avion.class);

		// Crear los where, que en criteria API se los conoce como Predicados
		Predicate p1 = myCriteria.equal(myTable.get("modelo"), modelo);
		// Predicate p2= myCriteria.equal(myTable.get("apellido"), apellido);

		// Empezamos a conformar el select
		myQuery.select(myTable).where(p1);// por defecto usa AND

		TypedQuery<Avion> typedQuery = this.entityManager.createQuery(myQuery);

		return typedQuery.getSingleResult();
	}

}
