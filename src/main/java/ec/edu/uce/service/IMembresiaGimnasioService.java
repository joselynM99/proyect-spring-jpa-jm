package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.MembresiaGimnasio;

public interface IMembresiaGimnasioService {

	void insertar(MembresiaGimnasio membresia);

	void actualizar(MembresiaGimnasio membresia);

	MembresiaGimnasio buscarPorID(Integer id);

	void borrarPorId(Integer id);

	MembresiaGimnasio buscarMembresiaPorCodigo(String codigo);

}
