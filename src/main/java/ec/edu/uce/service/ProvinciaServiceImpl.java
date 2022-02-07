package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Provincia;
import ec.edu.uce.repository.jpa.IProvinciaRepo;

@Service
public class ProvinciaServiceImpl implements IProvinciaService{
	
	@Autowired
	private IProvinciaRepo provinciaRepo;

	@Override
	public void guargarProvincia(Provincia provincia) {
		this.provinciaRepo.insertarProvincia(provincia);
	}
	
	

}
