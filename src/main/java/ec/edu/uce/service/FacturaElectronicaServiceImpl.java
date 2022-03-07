package ec.edu.uce.service;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.FacturaElectronica;
import ec.edu.uce.repository.jpa.IFacturaElectronicaRepo;

@Service
public class FacturaElectronicaServiceImpl implements IFacturaElectronicaService{

	@Autowired
	private IFacturaElectronicaRepo facturaElectronicaRepo;
	
	@Override
	@Transactional(value =TxType.REQUIRES_NEW)
	public void insertar(FacturaElectronica factura) {
		this.facturaElectronicaRepo.insertar(factura);
//		throw new ArrayIndexOutOfBoundsException();
	}

	@Override
	public void actualizar(FacturaElectronica factura) {
		this.facturaElectronicaRepo.actualizar(factura);
	}

	@Override
	public FacturaElectronica buscarPorID(Integer id) {
		return this.facturaElectronicaRepo.buscarPorID(id);
	}

	@Override
	public void borrarPorId(Integer id) {
		this.facturaElectronicaRepo.borrarPorId(id);
	}
	
	

}
