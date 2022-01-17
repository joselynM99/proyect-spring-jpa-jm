package ec.edu.uce.service;

import ec.edu.uce.modelo.Tienda;

public interface ITiendaService {

	void insertarTiendaNueva(Tienda tienda);

	void borrarTiendaPorId(Integer id);

	void actualizarTienda(Tienda tienda);

	Tienda buscarTiendaPorID(Integer id);
}
