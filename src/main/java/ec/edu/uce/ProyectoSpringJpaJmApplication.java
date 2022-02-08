package ec.edu.uce;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.jpa.Capital;
import ec.edu.uce.modelo.jpa.Provincia;
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

		List<Capital> lista = this.capitalService.buscarCapitalPorPoblacionJOIN(990000000);
		LOG.info("Longitud JOIN: " + lista.size());
		for (Capital c : lista) {
			LOG.info(c.toString());
		}
		
		List<Capital> lista2 = this.capitalService.buscarCapitalPorPoblacionLEFTJOIN(990000000);
		LOG.info("Longitud LEFT JOIN: " + lista2.size());
		for (Capital c : lista2) {
			LOG.info(c.toString());
		}
		
		List<Capital> lista3 = this.capitalService.buscarCapitalPorPoblacionRIGHTJOIN(990000000);
		LOG.info("Longitud RIGHT JOIN: " + lista3.size());
		for (Capital c : lista3) {
			LOG.info(c.toString());
		}
		
		List<Capital> lista4 = this.capitalService.buscarCapitalPorPoblacionWHERE(990000000);
		LOG.info("Longitud WHERE: " + lista4.size());
		for (Capital c : lista4) {
			LOG.info(c.toString());
		}

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
