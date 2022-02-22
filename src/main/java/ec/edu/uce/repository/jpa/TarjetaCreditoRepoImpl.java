package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.TarjetaCredito;

@Transactional
@Repository
public class TarjetaCreditoRepoImpl implements ITarjetaCreditoRepo {

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
	public TarjetaCredito buscarTarjetaPorNumero(String numero) {
		TypedQuery<TarjetaCredito> myQuery = this.entityManager
				.createQuery("SELECT t FROM TarjetaCredito t WHERE t.numeroTarjeta =: numero", TarjetaCredito.class);
		myQuery.setParameter("numero", numero);
		return myQuery.getSingleResult();
	}

}
