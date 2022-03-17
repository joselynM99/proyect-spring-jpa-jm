package ec.edu.uce.repository.jpa;

import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.modelo.jpa.Factura;
import ec.edu.uce.modelo.jpa.FacturaSencilla;

public interface IFacturaRepo {
	
	void insertarFactura(Factura factura);
	
	List<Factura> buscarPorFechaJOIN(LocalDateTime fecha);

	List<Factura> buscarPorFechaLEFTJOIN(LocalDateTime fecha);
	
	List<Factura> buscarPorFechaWHERE(LocalDateTime fecha);

	List<Factura> buscarPorFechaJOINFetch(LocalDateTime fecha);
	
	List<FacturaSencilla> buscarPorFechaSencilla(LocalDateTime fecha);

	Factura buscarPorCedula(String cedula);


}
