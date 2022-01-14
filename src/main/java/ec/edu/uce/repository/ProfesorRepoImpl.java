package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Profesor;

@Repository
public class ProfesorRepoImpl implements IProfesorRepo {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarProfesor(Profesor profesor) {
		// id, nombre, apellido, institucion, horas_clase, cedula

		Object[] datosAInsertar = new Object[] { profesor.getId(), profesor.getNombre(), profesor.getApellido(),
				profesor.getInstitucion(), profesor.getHorasClase(), profesor.getCedula() };

		this.jdbcTemplate.update(
				"insert into profesor (id, nombre, apellido, institucion, horas_clase, cedula) values(?, ?, ?, ?, ?, ?)",
				datosAInsertar);

	}

}
