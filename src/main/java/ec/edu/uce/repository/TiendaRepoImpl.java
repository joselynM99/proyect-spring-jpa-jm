package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Tienda;

@Repository
public class TiendaRepoImpl implements ITiendaRepo {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarTienda(Tienda tienda) {
		// id, nombre, direccion, tipo, propietario, costo_arriendo
		Object[] datosAInsertar = new Object[] { tienda.getId(), tienda.getNombre(), tienda.getDireccion(),
				tienda.getTipo(), tienda.getPropietario(), tienda.getConstoArriendo() };

		this.jdbcTemplate.update(
				"insert into tienda (id, nombre, direccion, tipo, propietario, costo_arriendo) values(?, ?, ?, ?, ?, ?)",
				datosAInsertar);

	}

	@Override
	public Tienda buscarTienda(Integer id) {
		Object[] datosBuscar = new Object[] { id };
		return this.jdbcTemplate.queryForObject("select * from tienda where id=?", datosBuscar,
				new BeanPropertyRowMapper<Tienda>(Tienda.class));
	}

	@Override
	public void actualizarTienda(Tienda tienda) {
		Object[] datosActualizar = new Object[] { tienda.getId(), tienda.getNombre(), tienda.getDireccion(),
				tienda.getTipo(), tienda.getPropietario(), tienda.getConstoArriendo(), tienda.getId() };
		this.jdbcTemplate.update(
				"update tienda set id=?, nombre=?, direccion=?, tipo=?, propietario=?, costo_arriendo=? where id=?",
				datosActualizar);
	}

	@Override
	public void borrarTienda(Integer id) {
		Object[] datosABorrar = new Object[] { id };
		this.jdbcTemplate.update("delete from tienda where id=?", datosABorrar);
	}

}
