package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Animal;
import ec.edu.uce.repository.IAnimalRepo;

@Service
public class AnimalServiceImpl implements IAnimalService{
	
	@Autowired
	private IAnimalRepo animalRepo;

	@Override
	public void insertarAnimalNuevo(Animal animal) {
		this.animalRepo.insertarAnimal(animal);
		
	}

}
