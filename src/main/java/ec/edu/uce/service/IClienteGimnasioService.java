package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.ClienteGimnasio;

public interface IClienteGimnasioService {
	
	void insertar(ClienteGimnasio cliente);

	void actualizar(ClienteGimnasio cliente);

	ClienteGimnasio buscarPorID(Integer id);

	void borrarPorId(Integer id);

	ClienteGimnasio buscarClientePorCedula(String cedula);


}
