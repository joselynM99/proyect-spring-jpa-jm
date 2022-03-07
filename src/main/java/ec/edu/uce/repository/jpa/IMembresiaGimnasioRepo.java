package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.MembresiaGimnasio;

public interface IMembresiaGimnasioRepo {
	
	void insertar(MembresiaGimnasio membresia);

	void actualizar(MembresiaGimnasio membresia);

	MembresiaGimnasio buscarPorID(Integer id);

	void borrarPorId(Integer id);

	MembresiaGimnasio buscarMembresiaPorCodigo(String codigo);
}
