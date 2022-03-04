package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.CuentaHabiente;

@Repository
@Transactional
public class CuentaHabienteRepo implements ICuentaHabienteRepo {

	private static final Logger LOG = LoggerFactory.getLogger(CuentaHabienteRepo.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(CuentaHabiente cuentaHabiente) {
		this.entityManager.persist(cuentaHabiente);

	}

	@Override
	public void actualizar(CuentaHabiente cuentaHabiente) {
		this.entityManager.merge(cuentaHabiente);
	}

	@Override
	public CuentaHabiente buscarPorID(Integer id) {
		return this.entityManager.find(CuentaHabiente.class, id);
	}

	@Override
	public void borrarPorId(Integer id) {
		CuentaHabiente cuentaHabienteABorrar = this.buscarPorID(id);
		this.entityManager.remove(cuentaHabienteABorrar);
	}

	@Override
	public CuentaHabiente buscarPorCedula(String cedula) {
		TypedQuery<CuentaHabiente> myQuery = this.entityManager
				.createQuery("SELECT c FROM CuentaHabiente c JOIN FETCH c.cuentasBancarias b WHERE c.cedula =: cedula", CuentaHabiente.class);
		myQuery.setParameter("cedula", cedula);

		return myQuery.getSingleResult();
	}

}
