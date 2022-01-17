package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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

	@Override
	public Profesor buscarProfesor(Integer id) {
		Object[] datosBuscar = new Object[] { id };
		return this.jdbcTemplate.queryForObject("select * from profesor where id=?", datosBuscar,
				new BeanPropertyRowMapper<Profesor>(Profesor.class));
	}

	@Override
	public void actualizarProfesor(Profesor profesor) {
		Object[] datosActualizar = new Object[] { profesor.getId(), profesor.getNombre(), profesor.getApellido(),
				profesor.getInstitucion(), profesor.getHorasClase(), profesor.getCedula(), profesor.getId() };
		this.jdbcTemplate.update(
				"update profesor set id=?, nombre=?, apellido=?, institucion=?, horas_clase=?, cedula=? where id=?",
				datosActualizar);

	}

	@Override
	public void borrarProfesor(Integer id) {
		Object[] datosABorrar = new Object[] { id };
		this.jdbcTemplate.update("delete from profesor where id=?", datosABorrar);

	}

}
