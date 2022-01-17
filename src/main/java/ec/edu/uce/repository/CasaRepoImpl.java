package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
		Object[] datosBuscar = new Object[] { id };
		return this.jdbcTemplate.queryForObject("select * from casa where id=?", datosBuscar,
				new BeanPropertyRowMapper<Casa>(Casa.class));
	}

	@Override
	public void actualizarCasa(Casa casa) {
		Object[] datosActualizar = new Object[] { casa.getId(), casa.getMaterial(), casa.getNumCasa(),
				casa.getPropietario(), casa.getCallePrincipal(), casa.getNumPisos(), casa.getId() };
		this.jdbcTemplate.update(
				"update casa set id=?, material=?, num_casa=?, propietario=?, calle_principal=?, num_pisos=? where id=?",
				datosActualizar);

	}

	@Override
	public void borrarCasa(Integer id) {
		Object[] datosABorrar = new Object[] { id };
		this.jdbcTemplate.update("delete from casa where id=?", datosABorrar);

	}

}
