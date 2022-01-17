package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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

	@Override
	public Universidad buscarUniversidad(Integer id) {
		Object[] datosBuscar = new Object[] { id };
		return this.jdbcTemplate.queryForObject("select * from universidad where id=?", datosBuscar,
				new BeanPropertyRowMapper<Universidad>(Universidad.class));
	}

	@Override
	public void actualizarUniversidad(Universidad universidad) {
		Object[] datosActualizar = new Object[] { universidad.getId(), universidad.getNombre(), universidad.getPais(),
				universidad.getAniosVida(), universidad.getCiudad(), universidad.getNumCarreras(),
				universidad.getId() };
		this.jdbcTemplate.update(
				"update universidad set id=?, nombre=?, pais=?, anios_vida=?, ciudad=?, num_carreras=? where id=?",
				datosActualizar);
	}

	@Override
	public void borrarUniversidad(Integer id) {
		Object[] datosABorrar = new Object[] { id };
		this.jdbcTemplate.update("delete from universidad where id=?", datosABorrar);
	}

}
