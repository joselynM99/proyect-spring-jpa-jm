package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.ClienteGimnasio;

public interface IClienteGimnasioRepo {
	
	void insertar(ClienteGimnasio cliente);

	void actualizar(ClienteGimnasio cliente);

	ClienteGimnasio buscarPorID(Integer id);

	void borrarPorId(Integer id);

	ClienteGimnasio buscarClientePorCedula(String cedula);

	

}
