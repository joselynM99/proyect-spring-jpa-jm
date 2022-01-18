package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Fruta;

public interface IFrutaService {
	void guardarFruta(Fruta fruta);
	void actualizar(Fruta fruta);
}
