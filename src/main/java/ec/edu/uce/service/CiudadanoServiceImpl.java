package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;

import ec.edu.uce.modelo.jpa.Ciudadano;
import ec.edu.uce.repository.jpa.ICiudadanoRepo;

public class CiudadanoServiceImpl implements ICiudadanoService{

	@Autowired
	private ICiudadanoRepo ciudadano;
	@Override
	public void guardarCiudadano(Ciudadano ciudadano) {
		this.ciudadano.insertarCiudadano(ciudadano);
		
	}

}
