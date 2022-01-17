package ec.edu.uce.service;

import ec.edu.uce.modelo.Casa;

public interface ICasaService {

	void insertarCasaNueva(Casa casa);

	void borrarCasaPorId(Integer id);

	void actualizarCasa(Casa casa);

	Casa buscarCasaPorID(Integer id);

}
