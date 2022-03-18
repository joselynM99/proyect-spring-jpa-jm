package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.PolizaSeguro;

@Repository
@Transactional
public class PolizaSeguroRepoImpl implements IPolizaSeguroRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(PolizaSeguro polizaSeguro) {
		this.entityManager.persist(polizaSeguro);

	}

	@Override
	public void actualizar(PolizaSeguro polizaSeguro) {
		this.entityManager.merge(polizaSeguro);
	}

	@Override
	public PolizaSeguro buscarPorID(Integer id) {
		return this.entityManager.find(PolizaSeguro.class, id);
	}

	@Override
	public void borrarPorId(Integer id) {
		PolizaSeguro polizaABorrar = this.buscarPorID(id);
		this.entityManager.remove(polizaABorrar);
	}

}
