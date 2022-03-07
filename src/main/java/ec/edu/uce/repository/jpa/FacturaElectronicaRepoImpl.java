package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.FacturaElectronica;

@Repository
@Transactional
public class FacturaElectronicaRepoImpl implements IFacturaElectronicaRepo {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(FacturaElectronica factura) {
		this.entityManager.persist(factura);
	}

	@Override
	public void actualizar(FacturaElectronica factura) {
		this.entityManager.merge(factura);
	}

	@Override
	public FacturaElectronica buscarPorID(Integer id) {
		return this.entityManager.find(FacturaElectronica.class, id);
	}

	@Override
	public void borrarPorId(Integer id) {
		FacturaElectronica facturaABorrar = this.buscarPorID(id);
		this.entityManager.remove(facturaABorrar);
	}

}
