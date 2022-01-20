package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Avion;

public interface IAvionRepo {
	
	void insertarAvion(Avion avion);

	void actualizarAvion(Avion avion);

	Avion buscarAvionPorID(Integer id);

	void borrarAvionPorId(Integer id);
	
	Avion buscarPorModelo(String modelo);

}
