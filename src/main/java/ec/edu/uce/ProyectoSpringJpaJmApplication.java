package ec.edu.uce;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Animal;
import ec.edu.uce.modelo.Cancion;
import ec.edu.uce.modelo.Casa;
import ec.edu.uce.modelo.Cuenta;
import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.modelo.Libro;
import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.modelo.Profesor;
import ec.edu.uce.modelo.Tienda;
import ec.edu.uce.modelo.Universidad;
import ec.edu.uce.modelo.Vehiculo;
import ec.edu.uce.service.IAnimalService;
import ec.edu.uce.service.ICancionService;
import ec.edu.uce.service.ICasaService;
import ec.edu.uce.service.ICuentaService;
import ec.edu.uce.service.IEstudienteService;
import ec.edu.uce.service.ILibroService;
import ec.edu.uce.service.IPacienteService;
import ec.edu.uce.service.IProfesorService;
import ec.edu.uce.service.ITiendaService;
import ec.edu.uce.service.IUniversidadService;
import ec.edu.uce.service.IVehiculoService;

@SpringBootApplication
public class ProyectoSpringJpaJmApplication implements CommandLineRunner{

	@Autowired
	private IPacienteService pacienteService;
	
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
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringJpaJmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Paciente paciente1 = new Paciente();
		paciente1.setId(5);
		paciente1.setNombre("Juana");
		paciente1.setApellido("Perez");
		paciente1.setEdad(6);
		
		this.pacienteService.insertarPacienteNuevo(paciente1);
		
		Estudiante estu1 = new Estudiante();
		estu1.setId(2);
		estu1.setNombre("Pedro");
		estu1.setApellido("Martinez");
		estu1.setEdad(22);
		estu1.setFacultad("Medicina");
		estu1.setSemestre("cuarto");
		
		this.estudianteService.insertarEstudianteNuevo(estu1);
		
		Vehiculo veh1 = new Vehiculo();
		veh1.setId(2);
		veh1.setMarca("Toyota");
		veh1.setPaisOrigen("Brasil");
		veh1.setPlaca("GYT234");
		veh1.setPrecio(new BigDecimal(120000));
		veh1.setValorMatricula(new BigDecimal(1000));
		
		this.vehiculoService.insertarVehiculoNuevo(veh1);
		
		Casa casa1 = new Casa();
		casa1.setCallePrincipal("Andres Perez");
		casa1.setId(2);
		casa1.setMaterial("Adobe");
		casa1.setNumCasa(76);
		casa1.setNumPisos(3);
		casa1.setPropietario("Estrella Ayala");
		
		this.casaService.insertarCasaNueva(casa1);
		
		Cuenta cuenta1 = new Cuenta();
		cuenta1.setId(2);
		cuenta1.setNumCuenta("23426");
		cuenta1.setPropietario("Gio Aslan");
		cuenta1.setSaldo(new BigDecimal(5545));
		cuenta1.setTipo("Corriente");
		cuenta1.setInteres(new BigDecimal(100));
		
		this.cuentaService.insertarCuentaNueva(cuenta1);
		
		Animal anim1= new Animal();
		anim1.setId(2);
		anim1.setEdad(5);
		anim1.setNombre("Jerry");
		anim1.setEspecie("Felino grande");
		anim1.setPeso(100.00);
		anim1.setHabitat("Selva");
		
		this.animalService.insertarAnimalNuevo(anim1);
		
		Libro lib1= new Libro();
		lib1.setId(2);
		lib1.setTitulo("La brujula dorada");
		lib1.setAutor("Philip Pullman");
		lib1.setEdicion(6);
		lib1.setEditorial("Bantam Spectra");
		lib1.setAnio(2000);
		
		this.libroService.insertarLibroNuevo(lib1);
		
		Tienda tienda = new Tienda();
		tienda.setId(2);
		tienda.setNombre("Marea");
		tienda.setDireccion("Ecuatoriana");
		tienda.setConstoArriendo(new BigDecimal(150));
		tienda.setPropietario("Juana Perez");
		tienda.setTipo("De abarrotes");
		
		this.tiendaService.insertarTiendaNueva(tienda);
		
		Cancion cancion = new Cancion();
		cancion.setId(2);
		cancion.setAlbum("Vertigo");
		cancion.setCantante("Pablo Alboran");
		cancion.setCompositor("Pablo Alboran");
		cancion.setGenero("Pop Latino");
		cancion.setTitulo("Dicen");
		
		this.cancionService.insertarCancionNueva(cancion);
		
		Profesor prof = new Profesor();
		prof.setId(2);
		prof.setNombre("Karla");
		prof.setApellido("Quishpe");
		prof.setCedula("158953");
		prof.setHorasClase(30);
		prof.setInstitucion("UCE");
		
		this.profService.insertarProfesorNuevo(prof);
		
		Universidad uni = new Universidad();
		uni.setId(2);
		uni.setNombre("Politecnica Nacional");
		uni.setAniosVida(125);
		uni.setCiudad("Quito");
		uni.setPais("Ecuador");
		uni.setNumCarreras(200);
		
		this.uniService.insertarUniversidadNueva(uni);
		
		
		
	
	}

}
