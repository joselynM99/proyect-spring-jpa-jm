package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Fruta;

public interface IFrutaService {

	void guardarFruta(Fruta fruta);

	void actualizar(Fruta fruta);

	Fruta buscar(Integer id);

	void borrar(Integer id);

	Fruta buscarFrutaPorColor(String color);
}
