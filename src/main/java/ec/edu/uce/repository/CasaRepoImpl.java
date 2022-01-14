package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Casa;

@Repository
public class CasaRepoImpl implements ICasaRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarCasa(Casa casa) {
		// arreglo de datos a insertar
		// id, material, num_casa, propietario, calle_principal, num_pisos

		Object[] datosAInsertar = new Object[] { casa.getId(), casa.getMaterial(), casa.getNumCasa(),
				casa.getPropietario(), casa.getCallePrincipal(), casa.getNumPisos() };

		this.jdbcTemplate.update(
				"insert into casa (id, material, num_casa, propietario, calle_principal, num_pisos) values(?, ?, ?, ?, ?, ?)",
				datosAInsertar);
	}

	@Override
	public Casa buscarCasa(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarCasa(Casa casa) {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrarCasa(Integer id) {
		// TODO Auto-generated method stub

	}

}
