package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarCuenta(Cuenta cuenta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrarCuenta(Integer id) {
		// TODO Auto-generated method stub

	}

}
