package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.PolizaSeguro;

public interface IPolizaSeguroService {
	void insertar(PolizaSeguro polizaSeguro);

	void actualizar(PolizaSeguro polizaSeguro);

	PolizaSeguro buscarPorID(Integer id);

	void borrarPorId(Integer id);
}
