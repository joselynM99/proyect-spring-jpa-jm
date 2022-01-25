package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Guardia;

public interface IGuardiaService {

	void guardarGuardia(Guardia guardia);

	void actualizar(Guardia guardia);

	Guardia buscar(Integer id);

	void borrar(Integer id);

	Guardia buscarPorApellido(String apellido);

	Guardia buscarPorApellidoTyped(String apellido);

	Guardia buscarPorApellidoNamed(String apellido);

	Guardia buscarGuardiasPorApellidoNative(String apellido);

	Guardia buscarListaGuardiasPorApellido(String apellido);

}
