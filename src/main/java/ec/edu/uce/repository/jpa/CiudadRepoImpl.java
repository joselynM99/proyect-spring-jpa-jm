package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Ciudad;

@Repository
@Transactional
public class CiudadRepoImpl implements ICiudadRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarCiudad(Ciudad ciudad) {
		this.entityManager.persist(ciudad);
	}

	@Override
	public void actualizarCiudad(Ciudad ciudad) {
		this.entityManager.merge(ciudad);
	}

	@Override
	public Ciudad buscarCiudadPorID(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarCiudadPorId(Integer id) {
		// TODO Auto-generated method stub

	}

}
