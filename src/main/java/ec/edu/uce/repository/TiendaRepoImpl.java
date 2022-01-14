package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
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
		Object[] datosAInsertar = new Object[] { tienda.getId(), tienda.getNombre(), tienda.getDireccion(), tienda.getTipo(),
				tienda.getPropietario(), tienda.getConstoArriendo() };

		this.jdbcTemplate.update(
				"insert into tienda (id, nombre, direccion, tipo, propietario, costo_arriendo) values(?, ?, ?, ?, ?, ?)",
				datosAInsertar);

	}

}
