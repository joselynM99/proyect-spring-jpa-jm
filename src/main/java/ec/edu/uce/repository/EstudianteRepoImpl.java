package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Estudiante;

@Repository
public class EstudianteRepoImpl implements IEstudianteRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarEstudiante(Estudiante estudiante) {
		// arreglo de datos a insertar
		Object[] datosAInsertar = new Object[] { estudiante.getId(), estudiante.getNombre(), estudiante.getApellido(),
				estudiante.getEdad(), estudiante.getFacultad(), estudiante.getSemestre() };

		// insert into paciente (id, nombre, apellido, edad, facultad, semestre)
		this.jdbcTemplate.update(
				"insert into estudiante (id, nombre, apellido, edad, facultad, semestre) values(?, ?, ?, ?, ?, ?)",
				datosAInsertar);
	}

	@Override
	public Estudiante buscarEstudiante(Integer id) {
		Object[] datosBuscar = new Object[] { id };
		return this.jdbcTemplate.queryForObject("select * from estudiante where id=?", datosBuscar,
				new BeanPropertyRowMapper<Estudiante>(Estudiante.class));
	}

	@Override
	public void actualizarEstudiante(Estudiante estudiante) {
		Object[] datosActualizar = new Object[] { estudiante.getId(), estudiante.getNombre(), estudiante.getApellido(),
				estudiante.getEdad(), estudiante.getFacultad(), estudiante.getSemestre(), estudiante.getId() };
		this.jdbcTemplate.update(
				"update estudiante set id=?, nombre=?, apellido=?, edad=?, facultad=?, semestre=? where id=?",
				datosActualizar);

	}

	@Override
	public void borrarEstudiante(Integer id) {
		Object[] datosABorrar = new Object[] { id };
		this.jdbcTemplate.update("delete from estudiante where id=?", datosABorrar);


	}

}
