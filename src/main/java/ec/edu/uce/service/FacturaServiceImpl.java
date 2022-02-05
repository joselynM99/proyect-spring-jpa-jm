package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Factura;
import ec.edu.uce.repository.jpa.IFacturaRepo;
@Service
public class FacturaServiceImpl implements IFacturaService{

	@Autowired
	private IFacturaRepo facRepo;
	
	@Override
	public void guardarFactura(Factura factura) {
		this.facRepo.insertarFactura(factura);		
	}

}