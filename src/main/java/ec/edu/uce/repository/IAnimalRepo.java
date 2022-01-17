package ec.edu.uce.repository;

import ec.edu.uce.modelo.Animal;

public interface IAnimalRepo {

	void insertarAnimal(Animal animal);

	Animal buscarAnimal(Integer id);

	void actualizarAnimal(Animal animal);

	void borrarAnimal(Integer id);

}
