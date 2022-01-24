package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Ciudad;

public interface ICiudadRepo {
	void insertarCiudad(Ciudad ciudad);

	void actualizarCiudad(Ciudad ciudad);

	Ciudad buscarCiudadPorID(Integer id);

	void borrarCiudadPorId(Integer id);

	Ciudad buscarCiudadPorNombre(String nombre);

	Ciudad buscarCiudadPorNombreType(String nombre);

	Ciudad buscarCiudadPorNombreNemed(String nombre);
}
