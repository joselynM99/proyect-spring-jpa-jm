package ec.edu.uce.repository;

import ec.edu.uce.modelo.Tienda;

public interface ITiendaRepo {
	
	void insertarTienda(Tienda tienda);
	
	Tienda buscarTienda(Integer id);

	void actualizarTienda(Tienda tienda);

	void borrarTienda(Integer id);

}
