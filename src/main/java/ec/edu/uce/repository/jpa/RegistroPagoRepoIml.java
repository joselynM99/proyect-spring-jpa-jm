package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.RegistroPagoMembresia;

@Transactional
@Repository
public class RegistroPagoRepoIml implements IRegistroPagoRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(RegistroPagoMembresia registro) {
		this.entityManager.persist(registro);
	}

	@Override
	public void actualizar(RegistroPagoMembresia registro) {
		this.entityManager.merge(registro);
	}

	@Override
	public RegistroPagoMembresia buscarPorID(Integer id) {
		return this.entityManager.find(RegistroPagoMembresia.class, id);
	}

	@Override
	public void borrarPorId(Integer id) {
		RegistroPagoMembresia registroABorrar = this.buscarPorID(id);
		this.entityManager.remove(registroABorrar);
	}

}
