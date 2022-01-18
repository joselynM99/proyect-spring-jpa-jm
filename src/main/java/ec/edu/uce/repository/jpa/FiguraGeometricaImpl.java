package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarFiguraGeometricaPorId(Integer id) {
		// TODO Auto-generated method stub

	}

}
