package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.TarjetaCredito;
import ec.edu.uce.service.CuentaBancariaServiceImpl;

@Transactional
@Repository
public class TarjetaCreditoRepoImpl implements ITarjetaCreditoRepo {
	private static final Logger LOG = LoggerFactory.getLogger(TarjetaCreditoRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(TarjetaCredito tarjeta) {
		this.entityManager.persist(tarjeta);
	}

	@Override
	public void actualizar(TarjetaCredito tarjeta) {
		this.entityManager.merge(tarjeta);
	}
	
	@Override
	public void actualizar2(TarjetaCredito tarjeta) {
		this.entityManager.merge(tarjeta);
		
		try {
			throw new ArrayIndexOutOfBoundsException();
		}catch(ArrayIndexOutOfBoundsException e) {
			LOG.error("Error");
		}

	}

	@Override
	public TarjetaCredito buscarTarjetaPorNumero(String numero) {
		TypedQuery<TarjetaCredito> myQuery = this.entityManager
				.createQuery("SELECT t FROM TarjetaCredito t WHERE t.numeroTarjeta =: numero", TarjetaCredito.class);
		myQuery.setParameter("numero", numero);
		return myQuery.getSingleResult();
	}

}
