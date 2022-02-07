package ec.edu.uce;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.jpa.Capital;
import ec.edu.uce.modelo.jpa.Pais;
import ec.edu.uce.modelo.jpa.Presidente;
import ec.edu.uce.modelo.jpa.Provincia;
import ec.edu.uce.repository.jpa.IPresidenteRepo;
import ec.edu.uce.service.IAnimalService;
import ec.edu.uce.service.IAvionService;
import ec.edu.uce.service.ICancionService;
import ec.edu.uce.service.ICapitalService;
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
import ec.edu.uce.service.IPresidenteService;
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
	
	@Autowired
	private ICapitalService capitalService;
	
	@Autowired
	private IPresidenteService presidenteService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringJpaJmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Capital cap = new Capital();
		cap.setNombre("Quito");
		cap.setPoblación(2000000);
		
		Provincia prov = new Provincia();
		prov.setNombre("Pichincha");
		prov.setSuperficie(9.536);
		prov.setCapital(cap);
		
		cap.setProvincia(prov);
		
		this.capitalService.guardarCapital(cap);

		
		Presidente pres = new Presidente();
		pres.setNombre("Guillermo Lasso");
		pres.setPartidoPolitico("Movimiento CREO");
		
		Pais pais = new Pais();
		pais.setNombre("Ecuador");
		pais.setContinente("America del Sur");
		pais.setPresidente(pres);
		
		pres.setPais(pais);
		
		this.presidenteService.guardarPresidente(pres);
		
		
//		Empleado em = new Empleado();
//		em.setIess("ahhads4");
//		em.setSalario(new BigDecimal(600));
//		
//		Ciudadano ciu = new Ciudadano();
//		ciu.setNombre("Joselyn");
//		ciu.setApellido("Moncayo");
//		ciu.setEmpleado(em);
//		
//		em.setCiudadano(ciu);
//		
//		this.empleadoService.guardarEmpleado(em);



	}

}
