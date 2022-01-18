package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Ciudad;

public interface ICiudadService {
	
	void guardarCiudad(Ciudad ciudad);
	void actualizar(Ciudad ciudad);

}
