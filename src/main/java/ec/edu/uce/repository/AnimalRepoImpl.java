package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Animal;

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

}
