package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Vehiculo;

@Repository
public class VehiculoRepoImpl implements IVehiculoRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarVehiculo(Vehiculo vehiculo) {
		// arreglo de datos a insertar
		Object[] datosAInsertar = new Object[] { vehiculo.getId(), vehiculo.getMarca(), vehiculo.getPaisOrigen(),
				vehiculo.getPlaca(), vehiculo.getPrecio(), vehiculo.getValorMatricula() };

		this.jdbcTemplate.update(
				"insert into vehiculo (id, marca, pais_origen, placa, precio, valor_matricula) values(?, ?, ?, ?, ?, ?)",
				datosAInsertar);
	}

	@Override
	public Vehiculo buscarVehiculo(Integer id) {
		Object[] datosBuscar = new Object[] { id };
		return this.jdbcTemplate.queryForObject("select * from vehiculo where id=?", datosBuscar,
				new BeanPropertyRowMapper<Vehiculo>(Vehiculo.class));
	}

	@Override
	public void actualizarVehiculo(Vehiculo vehiculo) {
		Object[] datosActualizar = new Object[] { vehiculo.getId(), vehiculo.getMarca(), vehiculo.getPaisOrigen(),
				vehiculo.getPlaca(), vehiculo.getPrecio(), vehiculo.getValorMatricula(), vehiculo.getId() };
		this.jdbcTemplate.update(
				"update vehiculo set id=?, marca=?, pais_origen=?, placa=?, precio=?, valor_matricula=? where id=?",
				datosActualizar);
	}

	@Override
	public void borrarVehiculo(Integer id) {
		Object[] datosABorrar = new Object[] { id };
		this.jdbcTemplate.update("delete from vehiculo where id=?", datosABorrar);

	}

}
