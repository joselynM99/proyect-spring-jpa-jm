package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.ClienteGimnasio;

@Transactional
@Repository
public class ClienteGimnasioRepoImpl implements IClienteGimnasioRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(ClienteGimnasio cliente) {
		this.entityManager.persist(cliente);
	}

	@Override
	public void actualizar(ClienteGimnasio cliente) {
		this.entityManager.merge(cliente);
	}

	@Override
	public ClienteGimnasio buscarPorID(Integer id) {
		return this.entityManager.find(ClienteGimnasio.class, id);
	}

	@Override
	public void borrarPorId(Integer id) {
		ClienteGimnasio clienteABorrar = this.buscarPorID(id);
		this.entityManager.remove(clienteABorrar);
		
	}
	
	@Override
	public ClienteGimnasio buscarClientePorCedula(String cedula) {
		
		TypedQuery<ClienteGimnasio> myQuery = this.entityManager
				.createQuery("SELECT c FROM ClienteGimnasio c WHERE c.cedula =: cedula", ClienteGimnasio.class);
		myQuery.setParameter("cedula", cedula);

		return myQuery.getSingleResult();
	}

}
