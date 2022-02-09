package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Factura;
import ec.edu.uce.modelo.jpa.FacturaSencilla;
import ec.edu.uce.repository.jpa.IFacturaRepo;
@Service
public class FacturaServiceImpl implements IFacturaService{

	@Autowired
	private IFacturaRepo facRepo;
	
	@Override
	public void guardarFactura(Factura factura) {
		this.facRepo.insertarFactura(factura);		
	}

	@Override
	public List<Factura> buscarPorFechaJOIN(LocalDateTime fecha) {
		return this.facRepo.buscarPorFechaJOIN(fecha);
	}

	@Override
	public List<Factura> buscarPorFechaLEFTJOIN(LocalDateTime fecha) {
		return this.facRepo.buscarPorFechaLEFTJOIN(fecha);
	}

	@Override
	public List<Factura> buscarPorFechaWHERE(LocalDateTime fecha) {
		return this.facRepo.buscarPorFechaWHERE(fecha);
	}

	@Override
	public List<Factura> buscarPorFechaJOINFetch(LocalDateTime fecha) {
		return this.facRepo.buscarPorFechaJOINFetch(fecha);
	}

	@Override
	public List<FacturaSencilla> buscarPorFechaSencilla(LocalDateTime fecha) {
		return this.facRepo.buscarPorFechaSencilla(fecha);
	}
	

}
