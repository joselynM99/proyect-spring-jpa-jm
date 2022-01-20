package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Avion;

public interface IAvionService {
	void guardarAvion(Avion avion);

	void actualizar(Avion avion);

	Avion buscar(Integer id);

	void borrar(Integer id);

	Avion buscarPorModelo(String modelo);

}
