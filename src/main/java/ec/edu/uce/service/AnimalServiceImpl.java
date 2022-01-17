package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Animal;
import ec.edu.uce.repository.IAnimalRepo;

@Service
public class AnimalServiceImpl implements IAnimalService {

	@Autowired
	private IAnimalRepo animalRepo;

	@Override
	public void insertarAnimalNuevo(Animal animal) {
		this.animalRepo.insertarAnimal(animal);

	}

	@Override
	public void borrarAnimalPorId(Integer id) {
		this.animalRepo.borrarAnimal(id);

	}

	@Override
	public void actualizarAnimal(Animal animal) {
		this.animalRepo.actualizarAnimal(animal);
	}

	@Override
	public Animal buscarAnimalPorID(Integer id) {

		return this.animalRepo.buscarAnimal(id);
	}

}
