package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Avion;

public interface IAvionService {
	void guardarAvion(Avion avion);
	void actualizar(Avion avion);

}
