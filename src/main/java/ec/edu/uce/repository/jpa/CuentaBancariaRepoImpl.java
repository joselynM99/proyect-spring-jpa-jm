package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.CuentaBancaria;

@Transactional
@Repository
public class CuentaBancariaRepoImpl implements ICuentaBancariaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(CuentaBancaria cuenta) {
		this.entityManager.persist(cuenta);
	}

	@Override
	public CuentaBancaria buscar(Integer id) {
		return null;
	}

	@Override
	public void actualizar(CuentaBancaria cuenta) {
		this.entityManager.merge(cuenta);
		
	}

}
