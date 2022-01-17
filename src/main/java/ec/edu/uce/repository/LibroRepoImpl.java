package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Libro;

@Repository
public class LibroRepoImpl implements ILibroRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarLibro(Libro libro) {
		// id, titulo, autor, editorial, edicion, anio
		Object[] datosAInsertar = new Object[] { libro.getId(), libro.getTitulo(), libro.getAutor(),
				libro.getEditorial(), libro.getEdicion(), libro.getAnio() };

		this.jdbcTemplate.update(
				"insert into libro (id, titulo, autor, editorial, edicion, anio) values(?, ?, ?, ?, ?, ?)",
				datosAInsertar);

	}

	@Override
	public Libro buscarLibro(Integer id) {
		Object[] datosBuscar = new Object[] { id };
		return this.jdbcTemplate.queryForObject("select * from libro where id=?", datosBuscar,
				new BeanPropertyRowMapper<Libro>(Libro.class));
	}

	@Override
	public void actualizarLibro(Libro libro) {
		Object[] datosActualizar = new Object[] { libro.getId(), libro.getTitulo(), libro.getAutor(),
				libro.getEditorial(), libro.getEdicion(), libro.getAnio(), libro.getId() };
		this.jdbcTemplate.update("update libro set id=?, titulo=?, autor=?, editorial=?, edicion=?, anio=? where id=?",
				datosActualizar);

	}

	@Override
	public void borrarLibro(Integer id) {
		Object[] datosABorrar = new Object[] { id };
		this.jdbcTemplate.update("delete from libro where id=?", datosABorrar);

	}

}
