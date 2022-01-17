package ec.edu.uce.repository;

import ec.edu.uce.modelo.Cancion;

public interface ICancionRepo {

	void insertarCancion(Cancion cancion);

	Cancion buscarCancion(Integer id);

	void actualizarCancion(Cancion cancion);

	void borrarCancion(Integer id);

}
