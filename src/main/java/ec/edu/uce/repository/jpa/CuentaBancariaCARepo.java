package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.CuentaBancariaCA;
import ec.edu.uce.modelo.jpa.Factura;

@Transactional
@Repository
public class CuentaBancariaCARepo implements ICuentaBancariaCARepo {
	private static final Logger LOG = LoggerFactory.getLogger(CuentaBancariaCARepo.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(CuentaBancariaCA cuentaBancaria) {
		this.entityManager.persist(cuentaBancaria);
	}

	@Override
	public void actualizar(CuentaBancariaCA cuentaBancaria) {
		this.entityManager.merge(cuentaBancaria);
	}

	@Override
	public CuentaBancariaCA buscarPorID(Integer id) {
		return this.entityManager.find(CuentaBancariaCA.class, id);
	}

	@Override
	public void borrarPorId(Integer id) {
		CuentaBancariaCA cuentaABorrar = this.buscarPorID(id);
		this.entityManager.remove(cuentaABorrar);
	}

	@Override
	public CuentaBancariaCA buscarPorNumero(String numero) {
		TypedQuery<CuentaBancariaCA> myQuery = this.entityManager
				.createQuery("SELECT b FROM CuentaBancariaCA b WHERE b.numero =: numero", CuentaBancariaCA.class);
		myQuery.setParameter("numero", numero);
		return myQuery.getSingleResult();
	}

}
