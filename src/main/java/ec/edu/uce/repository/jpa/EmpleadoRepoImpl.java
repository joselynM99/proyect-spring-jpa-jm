package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Empleado;

@Repository
@Transactional
public class EmpleadoRepoImpl implements IEmpleadoRepo {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarEmpleado(Empleado empleado) {
		this.entityManager.persist(empleado);
	}

}
