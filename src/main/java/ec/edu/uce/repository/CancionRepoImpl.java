package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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

	@Override
	public Cancion buscarCancion(Integer id) {
		Object[] datosBuscar = new Object[] { id };
		return this.jdbcTemplate.queryForObject("select * from cancion where id=?", datosBuscar,
				new BeanPropertyRowMapper<Cancion>(Cancion.class));
	}

	@Override
	public void actualizarCancion(Cancion cancion) {
		Object[] datosActualizar = new Object[] { cancion.getId(), cancion.getTitulo(), cancion.getCompositor(),
				cancion.getCantante(), cancion.getAlbum(), cancion.getGenero(), cancion.getId() };
		this.jdbcTemplate.update(
				"update cancion set id=?, titulo=?, compositor=?, cantante=?, album=?, genero=? where id=?",
				datosActualizar);
	}

	@Override
	public void borrarCancion(Integer id) {
		Object[] datosABorrar = new Object[] { id };
		this.jdbcTemplate.update("delete from cancion where id=?", datosABorrar);

	}

}
