package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Cancion;

@Repository
public class CancionRepoImpl implements ICancionRepo {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarCancion(Cancion cancion) {
		// id, titulo, compositor, cantante, album, genero

		Object[] datosAInsertar = new Object[] { cancion.getId(), cancion.getTitulo(), cancion.getCompositor(),
				cancion.getCantante(), cancion.getAlbum(), cancion.getGenero() };

		this.jdbcTemplate.update(
				"insert into cancion (id, titulo, compositor, cantante, album, genero) values(?, ?, ?, ?, ?, ?)",
				datosAInsertar);

	}

}
