package ec.edu.uce;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.jpa.CuentaBancaria;
import ec.edu.uce.modelo.jpa.Turista;
import ec.edu.uce.service.IAnimalService;
import ec.edu.uce.service.IAvionService;
import ec.edu.uce.service.ICancionService;
import ec.edu.uce.service.ICapitalService;
import ec.edu.uce.service.ICasaService;
import ec.edu.uce.service.ICiudadService;
import ec.edu.uce.service.IClienteService;
import ec.edu.uce.service.ICuentaBancariaService;
import ec.edu.uce.service.ICuentaService;
import ec.edu.uce.service.IDetalleFacturaService;
import ec.edu.uce.service.IEmpleadoService;
import ec.edu.uce.service.IEstudienteService;
import ec.edu.uce.service.IFacturaService;
import ec.edu.uce.service.IFiguraGeometricaService;
import ec.edu.uce.service.IFrutaService;
import ec.edu.uce.service.IGuardiaService;
import ec.edu.uce.service.ILibroService;
import ec.edu.uce.service.IPacienteService;
import ec.edu.uce.service.IPeliculaService;
import ec.edu.uce.service.IPresidenteService;
import ec.edu.uce.service.IProfesorService;
import ec.edu.uce.service.IRecetaService;
import ec.edu.uce.service.ITiendaService;
import ec.edu.uce.service.ITuristaService;
import ec.edu.uce.service.IUniversidadService;
import ec.edu.uce.service.IVehiculoService;

@SpringBootApplication
public class ProyectoSpringJpaJmApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(ProyectoSpringJpaJmApplication.class);

	@Autowired
	private IEstudienteService estudianteService;

	@Autowired
	private IVehiculoService vehiculoService;

	@Autowired
	private ICasaService casaService;

	@Autowired
	private ICuentaService cuentaService;

	@Autowired
	private IAnimalService animalService;

	@Autowired
	private ILibroService libroService;

	@Autowired
	private ITiendaService tiendaService;

	@Autowired
	private ICancionService cancionService;

	@Autowired
	private IProfesorService profService;

	@Autowired
	private IUniversidadService uniService;

	@Autowired
	private IPacienteService pacienteService;

	@Autowired
	private IGuardiaService guardiaService;

	@Autowired
	private IAvionService avionService;

	@Autowired
	private ICiudadService ciudadService;

	@Autowired
	private IFiguraGeometricaService figuraService;

	@Autowired
	private IFrutaService frutaService;

	@Autowired
	private IPeliculaService peliculaService;

	@Autowired
	private IFacturaService facService;

	@Autowired
	private IRecetaService recetaService;

	@Autowired
	private IEmpleadoService empleadoService;

	@Autowired
	private ICapitalService capitalService;

	@Autowired
	private IPresidenteService presidenteService;

	@Autowired
	private IDetalleFacturaService detalleFacturaService;

	@Autowired
	private IClienteService clienteService;

	@Autowired
	private ITuristaService turistaService;
	
	@Autowired
	private ICuentaBancariaService cuentaBService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringJpaJmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		CuentaBancaria cuenta = new CuentaBancaria();
		cuenta.setClienteCedula("871222");
		cuenta.setNumero("96");
		cuenta.setSaldo(new BigDecimal(300.2));
		cuenta.setTipo("Ahorro");
		
		CuentaBancaria cuenta1 = new CuentaBancaria();
		cuenta1.setClienteCedula("45563333");
		cuenta1.setNumero("25");
		cuenta1.setSaldo(new BigDecimal(200.2));
		cuenta1.setTipo("Ahorro");
		
//		this.cuentaBService.insertar(cuenta1);
//		
//		this.cuentaBService.insertar(cuenta);
		
		this.cuentaBService.realizarTransferencia("96", "25", new BigDecimal(20.0));
		
//		CuentaBancaria c = this.cuentaBService.buscarPorNumero("225426");
//		LOG.info(c.toString());
		
//		this.cuentaBService.insertar(cuenta);
//		
//		this.cuentaBService.insertar(cuenta);
		

//		Turista turista = new Turista();
//		turista.setNombre("Tatiana Mendez");
//		turista.setAbono(new BigDecimal(500.0));
//		turista.setValor(new BigDecimal(1000.0));
//
//		this.turistaService.insertarTurista(turista);
//
//		List<Turista> lista = this.turistaService.obtenerTodosTuristas();
//		for (Turista t : lista) {
//			LOG.info(t.toString());
//		}

////Taller 27**************************************************************************************************
//		LocalDateTime fecha = LocalDateTime.of(2022, Month.AUGUST, 8, 10, 30);
//		
//		List<FacturaSencilla> lista = this.facService.buscarPorFechaSencilla(fecha);
//		LOG.info("Longitud Lista Sencilla: " + lista.size());
//		for (FacturaSencilla f : lista) {
//			LOG.info(f.toString());
//		}
//		
//		//Collection
//		List<String> lista1 = new ArrayList<>();
//
//		lista1.add("0982565454");
//		lista1.add("023690074");
//
//		Cliente cliente = new Cliente();
//		cliente.setNombre("Joselyn Moncayo");
//		cliente.setTelefonos(lista1);
//
//		this.clienteService.guardarCliente(cliente);
//
////Taller 26***************************************************************************************************
//
//		List<Factura> list= this.facService.buscarPorFechaJOINFetch(fecha);
//		LOG.info("Longitud JOIN Fetch: " + list.size());
//		for (Factura f : list) {
//			LOG.info("Detalles: " + f.getDetalles());
//			LOG.info(f.toString());
//		}
//
//		List<DetalleFactura> lista2 = this.detalleFacturaService.buscarProductos(new BigDecimal(1), fecha);
//		LOG.info("Longitud JOIN Fetch, Detalle por fecha de precio: " + lista2.size());
//		for (DetalleFactura d : lista2) {
//			LOG.info(d.toString());
//		}
//**************************************************************************************************************		

//		List<Capital> lista = this.capitalService.buscarCapitalPorPoblacionJOIN(990000000);
//		LOG.info("Longitud JOIN: " + lista.size());
//		for (Capital c : lista) {
//			LOG.info(c.toString());
//		}
//		
//		List<Capital> lista2 = this.capitalService.buscarCapitalPorPoblacionLEFTJOIN(990000000);
//		LOG.info("Longitud LEFT JOIN: " + lista2.size());
//		for (Capital c : lista2) {
//			LOG.info(c.toString());
//		}
//		
//		List<Capital> lista3 = this.capitalService.buscarCapitalPorPoblacionRIGHTJOIN(990000000);
//		LOG.info("Longitud RIGHT JOIN: " + lista3.size());
//		for (Capital c : lista3) {
//			LOG.info(c.toString());
//		}
//		
//		List<Capital> lista4 = this.capitalService.buscarCapitalPorPoblacionWHERE(990000000);
//		LOG.info("Longitud WHERE: " + lista4.size());
//		for (Capital c : lista4) {
//			LOG.info(c.toString());
//		}

//		LocalDateTime fecha = LocalDateTime.of(2021, Month.AUGUST, 8, 10, 30);

//		List<Factura> lista = this.facService.buscarPorFechaJOIN(fecha);
//		LOG.info("Longitud" + lista.size());
//		for(Factura f: lista) {
//			LOG.info(f.toString());
//		}
//		
//		List<Factura> lista = this.facService.buscarPorFechaWHERE(fecha);
//		LOG.info("Longitud" + lista.size());
//		for(Factura f: lista) {
//			LOG.info(f.toString());
//		}
//		
//		List<Factura> lista2 = this.facService.buscarPorFechaLEFTJOIN(fecha);
//		for(Factura f: lista2) {
//			LOG.info("La factura es: " + f);
//		}

	}

}
