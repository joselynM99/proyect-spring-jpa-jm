package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Fruta;

public interface IFrutaRepo {
	void insertarFruta(Fruta guardia);

	void actualizarFruta(Fruta guardia);

	Fruta buscarFrutaPorID(Integer id);

	void borrarFrutaPorId(Integer id);

}
