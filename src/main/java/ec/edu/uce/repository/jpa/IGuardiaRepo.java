package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Guardia;

public interface IGuardiaRepo {
	void insertarGuardia(Guardia guardia);

	void actualizarGuardia(Guardia guardia);

	Guardia buscarGuardiaPorID(Integer id);

	void borrarGuardiaPorId(Integer id);

	Guardia buscarGuardiaPorApellido(String apellido);

	Guardia buscarGuardiasPorApellidoType(String apellido);

	Guardia buscarGuardiasPorApellidoNamed(String apellido);

	Guardia buscarListaGuardiasPorApellido(String apellido);
}
