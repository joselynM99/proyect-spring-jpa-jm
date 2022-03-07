package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.FacturaElectronica;

public interface IFacturaElectronicaService {
	
	void insertar(FacturaElectronica factura);

	void actualizar(FacturaElectronica factura);

	FacturaElectronica buscarPorID(Integer id);

	void borrarPorId(Integer id);

}
