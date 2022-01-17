package ec.edu.uce.service;

import ec.edu.uce.modelo.Universidad;

public interface IUniversidadService {
	
	void insertarUniversidadNueva(Universidad universidad);

	void borrarUniversidadPorId(Integer id);

	void actualizarUniversidad(Universidad universidad);

	Universidad buscarUniversidadPorID(Integer id);
}
