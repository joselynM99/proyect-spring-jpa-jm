package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.PolizaSeguro;

public interface IPolizaSeguroRepo {
	
	void insertar(PolizaSeguro polizaSeguro);

	void actualizar(PolizaSeguro polizaSeguro);

	PolizaSeguro buscarPorID(Integer id);

	void borrarPorId(Integer id);
	

}
