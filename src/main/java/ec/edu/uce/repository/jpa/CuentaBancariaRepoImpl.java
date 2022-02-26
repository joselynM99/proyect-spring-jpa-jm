package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.CuentaBancaria;

@Transactional
@Repository
public class CuentaBancariaRepoImpl implements ICuentaBancariaRepo {

	private static final Logger LOG = LoggerFactory.getLogger(CuentaBancariaRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(CuentaBancaria cuenta) {
		this.entityManager.persist(cuenta);
	}

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void actualizar2(CuentaBancaria cuenta) {
		this.entityManager.merge(cuenta);
//		try {
//			throw new ArrayIndexOutOfBoundsException();
//		}catch(ArrayIndexOutOfBoundsException e) {
//			LOG.error("Error");
//		}
}
	
	@Override
	public void actualizar(CuentaBancaria cuenta) {
		this.entityManager.merge(cuenta);
		throw new ArrayIndexOutOfBoundsException();


	}

	@Override
	public CuentaBancaria buscarPorNumero(String numero) {
		TypedQuery<CuentaBancaria> myQuery = this.entityManager
				.createQuery("SELECT c FROM CuentaBancaria c WHERE c.numero =: numero", CuentaBancaria.class);
		myQuery.setParameter("numero", numero);
		return myQuery.getSingleResult();
	}

}
