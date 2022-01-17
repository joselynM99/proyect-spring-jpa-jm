package ec.edu.uce.service;

import ec.edu.uce.modelo.Cancion;

public interface ICancionService {

	void insertarCancionNueva(Cancion cancion);

	void borrarCancionPorId(Integer id);

	void actualizarCancion(Cancion cancion);

	Cancion buscarCancionPorID(Integer id);

}
