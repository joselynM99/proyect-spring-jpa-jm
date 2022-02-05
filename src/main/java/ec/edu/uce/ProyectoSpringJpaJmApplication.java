package ec.edu.uce;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.jpa.Ciudadano;
import ec.edu.uce.modelo.jpa.DetalleReceta;
import ec.edu.uce.modelo.jpa.Empleado;
import ec.edu.uce.modelo.jpa.Receta;
import ec.edu.uce.service.IAnimalService;
import ec.edu.uce.service.IAvionService;
import ec.edu.uce.service.ICancionService;
import ec.edu.uce.service.ICasaService;
import ec.edu.uce.service.ICiudadService;
import ec.edu.uce.service.ICuentaService;
import ec.edu.uce.service.IEmpleadoService;
import ec.edu.uce.service.IEstudienteService;
import ec.edu.uce.service.IFacturaService;
import ec.edu.uce.service.IFiguraGeometricaService;
import ec.edu.uce.service.IFrutaService;
import ec.edu.uce.service.IGuardiaService;
import ec.edu.uce.service.ILibroService;
import ec.edu.uce.service.IPacienteService;
import ec.edu.uce.service.IPeliculaService;
import ec.edu.uce.service.IProfesorService;
import ec.edu.uce.service.IRecetaService;
import ec.edu.uce.service.ITiendaService;
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

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringJpaJmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Empleado em = new Empleado();
		em.setIess("ahhads4");
		em.setSalario(new BigDecimal(600));
		
		Ciudadano ciu = new Ciudadano();
		ciu.setNombre("Joselyn");
		ciu.setApellido("Moncayo");
		ciu.setEmpleado(em);
		
		em.setCiudadano(ciu);
		
		this.empleadoService.guardarEmpleado(em);

//		Receta miReceta = new Receta();
//		miReceta.setCedula("12364895");
//		LocalDateTime miFecha = LocalDateTime.of(2022, Month.NOVEMBER, 6, 10, 45);
//		miReceta.setFecha(miFecha);
//		miReceta.setClinica("Jerusalen");
//
//		// detalles
//
//		List<DetalleReceta> detalles = new ArrayList<DetalleReceta>();
//		DetalleReceta d1 = new DetalleReceta();
//		d1.setCantidad(12);
//		d1.setIndicaciones("Una tableta diaria");
//		d1.setNombre("Omeprasol");
//		d1.setReceta(miReceta);
//
//		DetalleReceta d2 = new DetalleReceta();
//		d2.setCantidad(24);
//		d2.setIndicaciones("Dos tabletas diarias");
//		d2.setNombre("Concor");
//		d2.setReceta(miReceta);
//
//		detalles.add(d1);
//		detalles.add(d2);
//
//		miReceta.setDetalles(detalles);
//
//		this.recetaService.guardarReceta(miReceta);

//		Guardia g1= new Guardia();
//		g1.setNombre("Lucas");
//		g1.setApellido("Torrez");
//		g1.setEdificio("Naciones Unidas");
//		this.guardiaService.guardarGuardia(g1);
//		
//		Guardia g2= new Guardia();
//		g2.setId(3);
//		g2.setNombre("Lucas");
//		g2.setApellido("Martines");
//		g2.setEdificio("Villaflora");
//		this.guardiaService.actualizar(g2);

		// Guardia g52 =this.guardiaService.buscar(102);
		// System.out.println(g52);

		// this.guardiaService.borrar(52);

//		Guardia gApellido = this.guardiaService.buscarListaGuardiasPorApellido("Torrez");
//		
//		System.out.println(gApellido);

		// busqueda con Typed
//		Guardia gApellido = this.guardiaService.buscarPorApellidoTyped("Martines");
//		System.out.println(gApellido);

		// Busqueda con Named
//		Guardia gApellido = this.guardiaService.buscarGuardiasPorApellidoNative("Martines");
//		LOG.info("El guardia es: " + gApellido);

//		Guardia gApellido = this.guardiaService.buscarGuardiasPorApellidoNamedNative("Martines");
//		LOG.info("El guardia es(Named Native): " + gApellido);

		// Criteria API
//		Guardia gApellido = this.guardiaService.buscarGuardiasPorApellidoCriteriaAPI("Martines");
//		LOG.info("El guardia es(Criteria API): " + gApellido);

		// Criteria con and
//		Guardia gApellido = this.guardiaService.buscarGuardiasPorApellidoCriteriaAPIAND("Martines", "Villaflora");
//		LOG.info("El guardia es(Criteria API AND): " + gApellido);

		// Criteria con or
//		Guardia gApellido = this.guardiaService.buscarGuardiasPorApellidoCriteriaAPIOR("Martin", "Villaflora");
//		LOG.info("El guardia es(Criteria API OR): " + gApellido);

		// Or lista
//		List<Guardia> listaGuardia = this.guardiaService.buscarGuardiasPorApellidoCriteriaAPIOR("Martines","Naciones Unidas");
//		for(Guardia g: listaGuardia) {
//			LOG.info("El guardia es: " + g);
//		}

//		Factura miFactura = new Factura();
//		miFactura.setCedula("15454");
//		
//		LocalDateTime miFecha = LocalDateTime.of(2021, Month.AUGUST, 8, 12, 45);
//
//		miFactura.setFecha(miFecha);
//		miFactura.setNumero("545-512");
//
//		// Lista de detales
//
//		List<DetalleFactura> detalles = new ArrayList<DetalleFactura>();
//		// detalle 1
//		DetalleFactura d1 = new DetalleFactura();
//		d1.setCantidad(2);
//		d1.setPrecio(new BigDecimal(2.78));
//		d1.setFactura(miFactura);
//
//		detalles.add(d1);
//		// detalle 2
//		DetalleFactura d2 = new DetalleFactura();
//		d2.setCantidad(10);
//		d2.setPrecio(new BigDecimal(5.26));
//		d2.setFactura(miFactura);
//
//		detalles.add(d1);
//		detalles.add(d2);
//
//		miFactura.setDetalles(detalles);
//
//		this.facService.guardarFactura(miFactura);

	}

}
