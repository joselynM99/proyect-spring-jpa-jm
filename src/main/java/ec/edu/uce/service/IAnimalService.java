package ec.edu.uce.service;

import ec.edu.uce.modelo.Animal;

public interface IAnimalService {
	
	void insertarAnimalNuevo(Animal animal);
	void borrarAnimalPorId(Integer id);
	void actualizarAnimal(Animal animal);
	Animal buscarAnimalPorID(Integer id);

}
