package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.ClienteGimnasio;
import ec.edu.uce.modelo.jpa.FacturaElectronica;
import ec.edu.uce.modelo.jpa.MembresiaGimnasio;
import ec.edu.uce.modelo.jpa.RegistroPagoMembresia;
import ec.edu.uce.repository.jpa.CuentaBancariaCARepo;

@Service
public class GestorGimnasioServiceImpl implements IGestorGimnasioService {
	
	private static final Logger LOG = LoggerFactory.getLogger(GestorGimnasioServiceImpl.class);


	@Autowired
	private IClienteGimnasioService clienteService;

	@Autowired
	private IMembresiaGimnasioService memebresiaService;

	@Autowired
	private IRegistroPagoService registroPagoSevice;

	@Autowired
	private IFacturaElectronicaService facturaElectronicaService;

	@Override
	public void insertarCliente(String nombre, String apellido, String cedula, LocalDateTime fechaNacimiento,
			String estado) {

		ClienteGimnasio cliente = new ClienteGimnasio();
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		cliente.setCedula(cedula);
		cliente.setFechaNacimiento(fechaNacimiento);
		cliente.setEstado(estado);

		this.clienteService.insertar(cliente);
	}

	@Override
	@Transactional
	public void pagarMembresia(String cedula, String codigo) {

		ClienteGimnasio cliente = this.clienteService.buscarClientePorCedula(cedula);
		MembresiaGimnasio membresia = this.memebresiaService.buscarMembresiaPorCodigo(codigo);
		RegistroPagoMembresia registroPago = new RegistroPagoMembresia();
		registroPago.setFechaPago(LocalDateTime.now());
		registroPago.setValorPago(membresia.getValor());
		registroPago.setCliente(cliente);
		registroPago.setMembresia(membresia);

		cliente.setEstado("P");
		membresia.setCantidadClientes(membresia.getCantidadClientes() + 1);

		this.registroPagoSevice.insertar(registroPago);

		this.clienteService.actualizar(cliente);

		this.memebresiaService.actualizar(membresia);

		FacturaElectronica factura = new FacturaElectronica();
		factura.setCedulaCliente(cedula);
		factura.setFechaPago(registroPago.getFechaPago());
		factura.setValorPago(membresia.getValor());

//		try {
			this.facturaElectronicaService.insertar(factura);
//		}catch(ArrayIndexOutOfBoundsException e) {
//			LOG.error("ERROR");
//		}
		
	}

}
