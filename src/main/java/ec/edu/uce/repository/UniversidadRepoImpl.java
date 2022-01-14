package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Universidad;

@Repository
public class UniversidadRepoImpl implements IUniversidadRepo {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarUniversidad(Universidad universidad) {
		// id, nombre, pais, anios_vida, ciudad, num_carreras

		Object[] datosAInsertar = new Object[] { universidad.getId(), universidad.getNombre(), universidad.getPais(),
				universidad.getAniosVida(), universidad.getCiudad(), universidad.getNumCarreras() };

		this.jdbcTemplate.update(
				"insert into universidad (id, nombre, pais, anios_vida, ciudad, num_carreras) values(?, ?, ?, ?, ?, ?)",
				datosAInsertar);

	}

}
