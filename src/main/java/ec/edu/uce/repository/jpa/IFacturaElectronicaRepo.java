package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.FacturaElectronica;

public interface IFacturaElectronicaRepo {

	void insertar(FacturaElectronica factura);

	void actualizar(FacturaElectronica factura);

	FacturaElectronica buscarPorID(Integer id);

	void borrarPorId(Integer id);
}
