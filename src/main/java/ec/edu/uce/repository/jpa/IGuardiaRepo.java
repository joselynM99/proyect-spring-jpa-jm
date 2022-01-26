package ec.edu.uce.repository.jpa;

import java.util.List;

import ec.edu.uce.modelo.jpa.Guardia;

public interface IGuardiaRepo {
	void insertarGuardia(Guardia guardia);

	void actualizarGuardia(Guardia guardia);

	Guardia buscarGuardiaPorID(Integer id);

	void borrarGuardiaPorId(Integer id);

	Guardia buscarGuardiaPorApellido(String apellido);

	Guardia buscarGuardiasPorApellidoType(String apellido);

	Guardia buscarGuardiasPorApellidoNamed(String apellido);

	Guardia buscarGuardiasPorApellidoNative(String apellido);

	Guardia buscarGuardiasPorApellidoNamedNative(String apellido);

	Guardia buscarGuardiasPorApellidoCriteriaAPI(String apellido);

	Guardia buscarGuardiasPorApellidoCriteriaAPIAND(String apellido, String edificio);

	List<Guardia> buscarGuardiasPorApellidoCriteriaAPIOR(String apellido, String edificio);

	Guardia buscarListaGuardiasPorApellido(String apellido);
}
