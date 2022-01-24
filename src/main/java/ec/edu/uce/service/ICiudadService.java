package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Ciudad;

public interface ICiudadService {

	void guardarCiudad(Ciudad ciudad);

	void actualizar(Ciudad ciudad);

	Ciudad buscar(Integer id);

	void borrar(Integer id);

	Ciudad buscarCiudadPorNombre(String nombre);
	
	Ciudad buscarCiudadPorNombreType(String nombre);

	Ciudad buscarCiudadPorNombreNemed(String nombre);

}
