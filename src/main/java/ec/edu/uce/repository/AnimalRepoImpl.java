package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Animal;
import ec.edu.uce.modelo.Paciente;

@Repository
public class AnimalRepoImpl implements IAnimalRepo {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarAnimal(Animal animal) {
		// id, nombre, especie, edad, habitat, peso

		Object[] datosAInsertar = new Object[] { animal.getId(), animal.getNombre(), animal.getEspecie(),
				animal.getEdad(), animal.getHabitat(), animal.getPeso() };

		this.jdbcTemplate.update(
				"insert into animal (id, nombre, especie, edad, habitat, peso) values(?, ?, ?, ?, ?, ?)",
				datosAInsertar);

	}

	@Override
	public Animal buscarAnimal(Integer id) {
		Object[] datosBuscar = new Object[] { id };
		return this.jdbcTemplate.queryForObject("select * from animal where id=?", datosBuscar,
				new BeanPropertyRowMapper<Animal>(Animal.class));
	}

	@Override
	public void actualizarAnimal(Animal animal) {
		Object[] datosActualizar = new Object[] { animal.getId(), animal.getNombre(), animal.getEspecie(),
				animal.getEdad(), animal.getHabitat(), animal.getPeso(), animal.getId() };
		this.jdbcTemplate.update("update animal set id=?, nombre=?, especie=?, edad=?, habitat=?, peso=? where id=?",
				datosActualizar);

	}

	@Override
	public void borrarAnimal(Integer id) {
		Object[] datosABorrar = new Object[] { id };
		this.jdbcTemplate.update("delete from animal where id=?", datosABorrar);

	}

}
