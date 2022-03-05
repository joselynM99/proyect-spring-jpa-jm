package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.HistoricoRetiros;

@Repository
@Transactional
public class HistoricoRetirosRepo implements IHistoricoRetirosRepo{
	
	private static final Logger LOG = LoggerFactory.getLogger(CuentaBancariaCARepo.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(HistoricoRetiros retiros) {
		this.entityManager.persist(retiros);
		//throw new ArrayIndexOutOfBoundsException();
	}

	@Override
	public void actualizar(HistoricoRetiros retiros) {
		this.entityManager.merge(retiros);
		
	}

	@Override
	public HistoricoRetiros buscarPorID(Integer id) {
		return this.entityManager.find(HistoricoRetiros.class, id);
	}

	@Override
	public void borrarPorId(Integer id) {
		HistoricoRetiros historicoABorrar = this.buscarPorID(id);
		this.entityManager.remove(historicoABorrar);
		
	}

}