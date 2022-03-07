package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.RegistroPagoMembresia;

public interface IRegistroPagoRepo {
	
	void insertar(RegistroPagoMembresia registro);

	void actualizar(RegistroPagoMembresia registro);

	RegistroPagoMembresia buscarPorID(Integer id);

	void borrarPorId(Integer id);
}
