package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
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

}
