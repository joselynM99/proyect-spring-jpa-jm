package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrarVehiculo(Integer id) {
		// TODO Auto-generated method stub

	}

}
