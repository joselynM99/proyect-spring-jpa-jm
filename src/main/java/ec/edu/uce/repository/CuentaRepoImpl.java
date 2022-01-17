package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Cuenta;

@Repository
public class CuentaRepoImpl implements ICuentaRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarCuenta(Cuenta cuenta) {
		// id, propietario, saldo, tipo, interes, num_cuenta
		Object[] datosAInsertar = new Object[] { cuenta.getId(), cuenta.getPropietario(), cuenta.getSaldo(),
				cuenta.getTipo(), cuenta.getInteres(), cuenta.getNumCuenta() };

		this.jdbcTemplate.update(
				"insert into cuenta (id, propietario, saldo, tipo, interes, num_cuenta) values(?, ?, ?, ?, ?, ?)",
				datosAInsertar);

	}

	@Override
	public Cuenta buscarCuenta(Integer id) {
		Object[] datosBuscar = new Object[] { id };
		return this.jdbcTemplate.queryForObject("select * from cuenta where id=?", datosBuscar,
				new BeanPropertyRowMapper<Cuenta>(Cuenta.class));
	}

	@Override
	public void actualizarCuenta(Cuenta cuenta) {
		Object[] datosActualizar = new Object[] { cuenta.getId(), cuenta.getPropietario(), cuenta.getSaldo(),
				cuenta.getTipo(), cuenta.getInteres(), cuenta.getNumCuenta(), cuenta.getId() };
		this.jdbcTemplate.update(
				"update cuenta set id=?, propietario=?, saldo=?, tipo=?, interes=?, num_cuenta=? where id=?",
				datosActualizar);

	}

	@Override
	public void borrarCuenta(Integer id) {
		Object[] datosABorrar = new Object[] { id };
		this.jdbcTemplate.update("delete from cuenta where id=?", datosABorrar);

	}

}
