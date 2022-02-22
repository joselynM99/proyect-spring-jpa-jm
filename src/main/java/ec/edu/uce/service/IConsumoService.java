package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Consumo;

public interface IConsumoService {
	
	void insertar(Consumo consumo);

	void actualizar(Consumo consumo);

}
