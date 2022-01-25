package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.FiguraGeometrica;

@Repository
@Transactional
public class FiguraGeometricaImpl implements IFiguraGeometricaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarFiguraGeometrica(FiguraGeometrica figura) {
		this.entityManager.persist(figura);
	}

	@Override
	public void actualizarFiguraGeometrica(FiguraGeometrica figura) {
		this.entityManager.merge(figura);
	}

	@Override
	public FiguraGeometrica buscarFiguraGeometricaPorID(Integer id) {
		return this.entityManager.find(FiguraGeometrica.class, id);
	}

	@Override
	public void borrarFiguraGeometricaPorId(Integer id) {
		FiguraGeometrica figuraABorrar = this.buscarFiguraGeometricaPorID(id);
		this.entityManager.remove(figuraABorrar);
	}

	@Override
	public FiguraGeometrica buscarFiguraPorNombre(String nombre) {
		// SQL: select * from figura_geometrica where nombre = 'nom'

		// JPQL: select f from FiguraGeometrica f where f.nombre =:valor

		Query miQuery = this.entityManager.createQuery("select f from FiguraGeometrica f where f.nombre =:valor");
		miQuery.setParameter("valor", nombre);
		FiguraGeometrica miFigura = (FiguraGeometrica) miQuery.getSingleResult();
		return miFigura;
	}

	@Override
	public FiguraGeometrica buscarFiguraPorNombreType(String nombre) {
		TypedQuery<FiguraGeometrica> myTypedQuery = (TypedQuery<FiguraGeometrica>) this.entityManager
				.createQuery("select f from FiguraGeometrica f where f.nombre =:valor");
		myTypedQuery.setParameter("valor", nombre);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public FiguraGeometrica buscarFiguraPorNombreNamed(String nombre) {
		Query miQuery = this.entityManager.createNamedQuery("FiguraGeometrica.buscarPorNombre");
		miQuery.setParameter("valor", nombre);
		return (FiguraGeometrica) miQuery.getSingleResult();
	}

	@Override
	public FiguraGeometrica buscarFiguraPorNombreNative(String nombre) {
		Query miQuery = this.entityManager.createNativeQuery(
				"select * from figura_geometrica fg where fg.nombre =:valor", FiguraGeometrica.class);
		miQuery.setParameter("valor", nombre);
		return (FiguraGeometrica) miQuery.getSingleResult();
	}

}
