package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.MembresiaGimnasio;

@Repository
@Transactional
public class MembresiaGimnasioRepoImpl implements IMembresiaGimnasioRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(MembresiaGimnasio membresia) {
		this.entityManager.persist(membresia);
	}

	@Override
	public void actualizar(MembresiaGimnasio membresia) {
		this.entityManager.merge(membresia);
	}

	@Override
	public MembresiaGimnasio buscarPorID(Integer id) {
		return this.entityManager.find(MembresiaGimnasio.class, id);
	}

	@Override
	public void borrarPorId(Integer id) {
		MembresiaGimnasio membresiaABorrar = this.buscarPorID(id);
		this.entityManager.remove(membresiaABorrar);
	}

	@Override
	public MembresiaGimnasio buscarMembresiaPorCodigo(String codigo) {
		TypedQuery<MembresiaGimnasio> myQuery = this.entityManager
				.createQuery("SELECT m FROM MembresiaGimnasio m WHERE m.codigo =: codigo", MembresiaGimnasio.class);
		myQuery.setParameter("codigo", codigo);

		return myQuery.getSingleResult();
	}

}
