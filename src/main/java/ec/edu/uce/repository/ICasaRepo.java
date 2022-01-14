package ec.edu.uce.repository;

import ec.edu.uce.modelo.Casa;

public interface ICasaRepo {
	void insertarCasa(Casa casa);

	Casa buscarCasa(Integer id);

	void actualizarCasa(Casa casa);

	void borrarCasa(Integer id);

}
