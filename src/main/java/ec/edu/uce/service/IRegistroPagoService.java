package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.RegistroPagoMembresia;

public interface IRegistroPagoService {

	void insertar(RegistroPagoMembresia registro);

	void actualizar(RegistroPagoMembresia registro);

	RegistroPagoMembresia buscarPorID(Integer id);

	void borrarPorId(Integer id);

}
