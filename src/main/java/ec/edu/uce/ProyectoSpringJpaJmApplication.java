package ec.edu.uce;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.jpa.Avion;
import ec.edu.uce.modelo.jpa.Ciudad;
import ec.edu.uce.modelo.jpa.FiguraGeometrica;
import ec.edu.uce.modelo.jpa.Fruta;
import ec.edu.uce.modelo.jpa.Guardia;
import ec.edu.uce.modelo.jpa.Pelicula;
import ec.edu.uce.service.IAnimalService;
import ec.edu.uce.service.IAvionService;
import ec.edu.uce.service.ICancionService;
import ec.edu.uce.service.ICasaService;
import ec.edu.uce.service.ICiudadService;
import ec.edu.uce.service.ICuentaService;
import ec.edu.uce.service.IEstudienteService;
import ec.edu.uce.service.IFiguraGeometricaService;
import ec.edu.uce.service.IFrutaService;
import ec.edu.uce.service.IGestorCitaService;
import ec.edu.uce.service.IGuardiaService;
import ec.edu.uce.service.ILibroService;
import ec.edu.uce.service.IPacienteService;
import ec.edu.uce.service.IPeliculaService;
import ec.edu.uce.service.IProfesorService;
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
	private IGestorCitaService gestorCitaService;

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

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringJpaJmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

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
		Guardia gApellido = this.guardiaService.buscarGuardiasPorApellidoNative("Martines");
		LOG.info("El guardia es: " + gApellido);

//Tarea 13***************************************************************************

		Avion avModeloNative = this.avionService.buscarPorModeloNative("Boeing 737");
		LOG.info("El avion es: " + avModeloNative);

		Ciudad ciuNombreNative = this.ciudadService.buscarCiudadPorNombreNativ("Los Angeles");
		LOG.info("La ciudad es: " + ciuNombreNative);

		FiguraGeometrica figNombreNative = this.figuraService.buscarFiguraPorNombreNative("Circulo");
		LOG.info("La figura es: " + figNombreNative);

		Fruta frColorNative = this.frutaService.buscarFrutaPorColorNative("Amarillo");
		LOG.info("La fruta es: " + frColorNative);

		Pelicula plDirectorNative = this.peliculaService.buscarPeliculaPorDirectorNative("Joe Wright");
		LOG.info("La pelicula es: " + plDirectorNative);

//Tarea 12***************************************************************************

//		Avion avModeloType = this.avionService.buscarPorModeloType("Boeing 737");
//		LOG.info("El avion es: " + avModeloType);
//
//		Avion avModeloNamed = this.avionService.buscarPorModeloNamed("Boeing 737");
//		LOG.info("El avion es: " + avModeloNamed);
//
//		Ciudad ciuNombreType = this.ciudadService.buscarCiudadPorNombreType("Los Angeles");
//		LOG.info("La ciudad es: " + ciuNombreType);
//
//		Ciudad ciuNombreNamed = this.ciudadService.buscarCiudadPorNombreNemed("Los Angeles");
//		LOG.info("La ciudad es: " + ciuNombreNamed);
//
//		FiguraGeometrica figNombreType = this.figuraService.buscarFiguraPorNombreType("Circulo");
//		LOG.info("La figura es: " + figNombreType);
//
//		FiguraGeometrica figNombreNamed = this.figuraService.buscarFiguraPorNombreNamed("Circulo");
//		LOG.info("La figura es: " + figNombreNamed);
//
//		Fruta frColorTyped = this.frutaService.buscarFrutaPorColorTyped("Amarillo");
//		LOG.info("La fruta es: " + frColorTyped);
//
//		Fruta frColorNamed = this.frutaService.buscarFrutaPorColorNamed("Amarillo");
//		LOG.info("La fruta es: " + frColorNamed);
//		
//
//		Pelicula plDirectorType = this.peliculaService.buscarPeliculaPorDirectorTyped("Joe Wright");
//		LOG.info("La pelicula es: "+plDirectorType);
//		
//		Pelicula plDirectorNamed = this.peliculaService.buscarPeliculaPorDirectorNamed("Joe Wright");
//		LOG.info("La pelicula es: "+plDirectorNamed);

//Tarea 11***************************************************************************		
//		//Avion
//		
//		this.avionService.borrar(28);
//		
//		Avion av27 = this.avionService.buscar(27);
//		System.out.println(av27);
//		
//		Avion avModelo = this.avionService.buscarPorModelo("Boeing 737");
//		System.out.println(avModelo);
//		
//		//Ciudad
//		
//		this.ciudadService.borrar(22);
//		
//		Ciudad c10 = this.ciudadService.buscar(10);
//		System.out.println(c10);
//		
//		Ciudad cNombre = this.ciudadService.buscarCiudadPorNombre("Madrid");
//		System.out.println(cNombre);
//		
//		//FiguraGeometrica
//		
//		this.figuraService.borrar(41);
//		
//		FiguraGeometrica fg17 = this.figuraService.buscar(17);
//		System.out.println(fg17);
//		
//		FiguraGeometrica fgNombre = this.figuraService.buscarFiguraPorNombre("Circulo");
//		System.out.println(fgNombre);
//		
//		//Fruta
//		
//		this.frutaService.borrar(42);
//		
//		Fruta fr28 = this.frutaService.buscar(28);
//		System.out.println(fr28);
//		
//		Fruta frColor = this.frutaService.buscarFrutaPorColor("Rojo");
//		System.out.println(frColor);
//		
//		//Pelicula
//		
//		this.peliculaService.borrar(42);
//		
//		Pelicula pl32 = this.peliculaService.buscar(32);
//		System.out.println(pl32);
//		
//		Pelicula plDir = this.peliculaService.buscarPeliculaPorDirector("Joe Wright");
//		System.out.println(plDir);
//		

//Tarea 10	**************************************************************

//		Avion av1 = new Avion();
//		av1.setModelo("boeing 700");
//		av1.setNumMotores(2);
//		av1.setVelocidad(1000.00);
//		
//		Avion av2 = new Avion();
//		av2.setId(11);
//		av2.setModelo("Boeing 737");
//		av2.setNumMotores(2);
//		av2.setVelocidad(999.00);
//		
//		this.avionService.guardarAvion(av1);
//		this.avionService.actualizar(av2);
//		
//		
//		Ciudad c1 = new Ciudad();
//		c1.setId(9);
//		c1.setNombre("Los Angeles");
//		c1.setNumPobladores(1000000);
//		c1.setPais("EEUU");
//		
//		Ciudad c2 = new Ciudad();
//		c2.setNombre("Paris");
//		c2.setNumPobladores(1600000);
//		c2.setPais("Francia");
//		
//		this.ciudadService.guardarCiudad(c2);
//		this.ciudadService.actualizar(c1);
//		
//		FiguraGeometrica f1 = new FiguraGeometrica();
//		f1.setId(17);
//		f1.setNombre("Circulo");
//		f1.setArea(56.00);
//		f1.setPerimetro(30.36);
//		
//		FiguraGeometrica f2 = new FiguraGeometrica();
//		f2.setNombre("Traingulo");
//		f2.setArea(6.00);
//		f2.setPerimetro(3.00);
//		
//		this.figuraService.guardarFigura(f2);
//		this.figuraService.actualizar(f1);
//		
//		Fruta fr1 = new Fruta();
//		fr1.setColor("Verde");
//		fr1.setNombre("Manzana");
//		fr1.setTipoSemilla("multiple");
//		
//		Fruta fr2 = new Fruta();
//		fr2.setId(30);
//		fr2.setColor("Amarillo");
//		fr2.setNombre("Piña");
//		fr2.setTipoSemilla("tronco");
//		
//		this.frutaService.guardarFruta(fr1);
//		this.frutaService.actualizar(fr2);
//		
//		Pelicula p1 = new Pelicula();
//		p1.setId(31);
//		p1.setTitulo("Orgullo y prejuicio");
//		p1.setDirector("Joe Wright");
//		p1.setProductor("Tim Bevan");
//		
//		Pelicula p2 = new Pelicula();
//		p2.setTitulo("Your Name");
//		p2.setDirector("Makoto Shinkai");
//		p2.setProductor("Makoto Shinkai");
//		
//		this.peliculaService.guardarPelicula(p2);
//		this.peliculaService.actualizar(p1);
//		
//		
//		

//TAREA 9 ************************************************************************************************************
// Animal
//
// 		Animal anim1 = new Animal();
//		anim1.setId(3);
//		anim1.setEdad(3);
//		anim1.setNombre("Tob");
//		anim1.setEspecie("Lobo");
//		anim1.setPeso(99.00);
//		anim1.setHabitat("Montaña");
//
//		Animal anim2 = new Animal();
//		anim2.setId(2);
//		anim2.setEdad(5);
//		anim2.setNombre("Jerry");
//		anim2.setEspecie("Felino Grande");
//		anim2.setPeso(100.00);
//		anim2.setHabitat("Selva");

//		this.animalService.insertarAnimalNuevo(anim1);
//		this.animalService.borrarAnimalPorId(1);
//		System.out.println("Animal: " + this.animalService.buscarAnimalPorID(2));
//		this.animalService.actualizarAnimal(anim2);
//		System.out.println("Animal: " + this.animalService.buscarAnimalPorID(3));
//		System.out.println("Animal actualizado 2: " + this.animalService.buscarAnimalPorID(2));

//Cancion
//		
//		Cancion cancion = new Cancion();
//		cancion.setId(3);
//		cancion.setAlbum("Vertigo");
//		cancion.setCantante("Pablo Alboran");
//		cancion.setCompositor("Pablo Alboran");
//		cancion.setGenero("Pop");
//		cancion.setTitulo("Fiesta");
//		
//		Cancion cancion2 = new Cancion();
//		cancion2.setId(2);
//		cancion2.setAlbum("Saturno");
//		cancion2.setCantante("Pablo Alboran");
//		cancion2.setCompositor("Pablo Alboran");
//		cancion2.setGenero("Pop");
//		cancion2.setTitulo("Dicen");
//		
//		
//		this.cancionService.borrarCancionPorId(1);
//		this.cancionService.insertarCancionNueva(cancion);
//		System.out.println("Cancion: "+ this.cancionService.buscarCancionPorID(2));
//		this.cancionService.actualizarCancion(cancion2);
//		System.out.println("Cancion actualizada: "+ this.cancionService.buscarCancionPorID(2));

//Casa
//		
//		Casa casa1 = new Casa();
//		casa1.setCallePrincipal("Andres Perez");
//		casa1.setId(2);
//		casa1.setMaterial("Bloque");
//		casa1.setNumCasa(76);
//		casa1.setNumPisos(4);
//		casa1.setPropietario("Tatiana Viteri");
//		
//		Casa casa2 = new Casa();
//		casa2.setCallePrincipal("Mariscal Sucre");
//		casa2.setId(3);
//		casa2.setMaterial("Ladrillo");
//		casa2.setNumCasa(659);
//		casa2.setNumPisos(2);
//		casa2.setPropietario("Abril Hidalgo");
//		
//		this.casaService.insertarCasaNueva(casa2);
//		this.casaService.borrarCasaPorId(1);
//		System.out.println("Casa: " +this.casaService.buscarCasaPorID(2));
//		this.casaService.actualizarCasa(casa1);
//		System.out.println("Casa actualizada: " +this.casaService.buscarCasaPorID(2));

//Cuenta		
//		
//		Cuenta cuenta1 = new Cuenta();
//		cuenta1.setId(2);
//		cuenta1.setNumCuenta("5458566");
//		cuenta1.setPropietario("Aslan Lynx");
//		cuenta1.setSaldo(new BigDecimal(3000));
//		cuenta1.setTipo("Corriente");
//		cuenta1.setInteres(new BigDecimal(23));
//
//		Cuenta cuenta2 = new Cuenta();
//		cuenta2.setId(3);
//		cuenta2.setNumCuenta("5646556");
//		cuenta2.setPropietario("Ernesto Luna");
//		cuenta2.setSaldo(new BigDecimal(300000));
//		cuenta2.setTipo("Corriente");
//		cuenta2.setInteres(new BigDecimal(2365));
//
//		this.cuentaService.insertarCuentaNueva(cuenta2);
//		this.cuentaService.borrarCuentaPorId(1);
//		System.out.println("Cuenta: " + this.cuentaService.buscarCuentaPorID(2));
//		this.cuentaService.actualizarCuenta(cuenta1);
//		System.out.println("Cuenta actualizada: " + this.cuentaService.buscarCuentaPorID(2));

//Estudiante
//		
//		Estudiante estu1 = new Estudiante();
//		estu1.setId(2);
//		estu1.setNombre("Pedro");
//		estu1.setApellido("Martinez");
//		estu1.setEdad(26);
//		estu1.setFacultad("Ingeniería");
//		estu1.setSemestre("Cuarto");
//		
//		Estudiante estu2 = new Estudiante();
//		estu2.setId(4);
//		estu2.setNombre("Delia");
//		estu2.setApellido("Lopez");
//		estu2.setEdad(26);
//		estu2.setFacultad("Radiología");
//		estu2.setSemestre("Quinto");
//		
//		this.estudianteService.insertarEstudianteNuevo(estu2);
//		this.estudianteService.borrarEstudiantePorId(3);
//		System.out.println("Estudiante "+ this.estudianteService.buscarEstudiantePorID(2));
//		this.estudianteService.actualizarEstudiante(estu1);
//		System.out.println("Estudiante actualizado: "+this.estudianteService.buscarEstudiantePorID(2));

//Libro		
//		
//		Libro lib1 = new Libro();
//		lib1.setId(2);
//		lib1.setTitulo("La brújula dorada");
//		lib1.setAutor("Philip Pullman");
//		lib1.setEdicion(9);
//		lib1.setEditorial("Bantam");
//		lib1.setAnio(2015);
//		
//		Libro lib2 = new Libro();
//		lib2.setId(3);
//		lib2.setTitulo("Bound by Honor");
//		lib2.setAutor("Cora Reilly");
//		lib2.setEdicion(2);
//		lib2.setEditorial("Bookzinga");
//		lib2.setAnio(2020);
//		
//		this.libroService.insertarLibroNuevo(lib2);
//		this.libroService.borrarLibroPorId(1);
//		System.out.println("Libro: "+this.libroService.buscarLibroPorID(2));
//		this.libroService.actualizarLibro(lib1);
//		System.out.println("Libro actualizado: "+this.libroService.buscarLibroPorID(2));

//	Profesor	
//		
//		Profesor prof = new Profesor();
//		prof.setId(2);
//		prof.setNombre("Karla");
//		prof.setApellido("Quishpe");
//		prof.setCedula("158953");
//		prof.setHorasClase(10);
//		prof.setInstitucion("Politecnica");
//		
//		Profesor prof1 = new Profesor();
//		prof1.setId(3);
//		prof1.setNombre("Lucas");
//		prof1.setApellido("Orellana");
//		prof1.setCedula("170894587");
//		prof1.setHorasClase(30);
//		prof1.setInstitucion("UCE");
//		
//		this.profService.insertarProfesorNuevo(prof1);
//		this.profService.borrarProfesorPorId(1);
//		System.out.println("Profesor: " +this.profService.buscarProfesorPorID(2));
//		this.profService.actualizarProfesor(prof);
//		System.out.println("Profesor actualizado: " +this.profService.buscarProfesorPorID(2));
//		

//TIENDA		
//		
//		Tienda tienda = new Tienda();
//		tienda.setId(2);
//		tienda.setNombre("Marthita");
//		tienda.setDireccion("Carcelen");
//		tienda.setConstoArriendo(new BigDecimal(230));
//		tienda.setPropietario("Daniela Perez");
//		tienda.setTipo("De abarrotes");
//		
//		Tienda tienda1 = new Tienda();
//		tienda1.setId(3);
//		tienda1.setNombre("Kin");
//		tienda1.setDireccion("Villaflora");
//		tienda1.setConstoArriendo(new BigDecimal(169));
//		tienda1.setPropietario("Daniel Martinez");
//		tienda1.setTipo("Minimarket");
//		
//		this.tiendaService.insertarTiendaNueva(tienda1);
//		this.tiendaService.borrarTiendaPorId(1);
//		System.out.println("Tienda: "+this.tiendaService.buscarTiendaPorID(2));
//		this.tiendaService.actualizarTienda(tienda);
//		System.out.println("Tienda: "+this.tiendaService.buscarTiendaPorID(2));

//Universidad		
//		
//		Universidad uni = new Universidad();
//		uni.setId(2);
//		uni.setNombre("Escuela Nacional Politecnica Nacional");
//		uni.setAniosVida(128);
//		uni.setCiudad("Quito");
//		uni.setPais("Ecuador");
//		uni.setNumCarreras(150);
//		
//		Universidad uni1 = new Universidad();
//		uni1.setId(3);
//		uni1.setNombre("ESPE");
//		uni1.setAniosVida(100);
//		uni1.setCiudad("Quito");
//		uni1.setPais("Ecuador");
//		uni1.setNumCarreras(55);
//		
//		this.uniService.insertarUniversidadNueva(uni1);
//		this.uniService.borrarUniversidadPorId(1);
//		System.out.println("Universidad: "+this.uniService.buscarUniversidadPorID(2));
//		this.uniService.actualizarUniversidad(uni);
//		System.out.println("Universidad actualizada: "+this.uniService.buscarUniversidadPorID(2));

//		Vehiculo veh1 = new Vehiculo();
//		veh1.setId(2);
//		veh1.setMarca("Toyota");
//		veh1.setPaisOrigen("Brasil");
//		veh1.setPlaca("XYk54");
//		veh1.setPrecio(new BigDecimal(230000));
//		veh1.setValorMatricula(new BigDecimal(2000));
//		
//		Vehiculo veh2 = new Vehiculo();
//		veh2.setId(3);
//		veh2.setMarca("Chevrolet");
//		veh2.setPaisOrigen("EEUU");
//		veh2.setPlaca("HUN235");
//		veh2.setPrecio(new BigDecimal(30000));
//		veh2.setValorMatricula(new BigDecimal(200));
//		
//		this.vehiculoService.insertarVehiculoNuevo(veh2);
//		this.vehiculoService.borrarVehiculoPorId(1);
//		System.out.println("Vehiculo: "+this.vehiculoService.buscarVehiculoPorID(2));
//		this.vehiculoService.actualizarVehiculo(veh1);
//		System.out.println("Vehiculo actualizado: "+this.vehiculoService.buscarVehiculoPorID(2));

//****************************************************************************************************************

//		Paciente paciente1 = new Paciente();
//		paciente1.setId(7);
//		paciente1.setNombre("Daniel");
//		paciente1.setApellido("Osoria");
//		paciente1.setEdad(25);
//
//		Receta r1 = new Receta();
//		r1.setId(1);
//		r1.setIndicaciones("Reposo por 7 semanas");
//		r1.setMedicamentos("Paracetamol");
//
//		this.gestorCitaService.registrarNuevaConsulta(paciente1, r1);

//		Paciente paciente1 = new Paciente();
//		paciente1.setId(6);
//		paciente1.setNombre("Luck");
//		paciente1.setApellido("Perez");
//		paciente1.setEdad(61);
//
//		// this.pacienteService.insertarPacienteNuevo(paciente1);
//		// this.pacienteService.borrarPacientePorId(2);
//		//this.pacienteService.actualizarPaciente(paciente1);
//		
//		Paciente p1 = this.pacienteService.buscarPacientePorID(1);
//		System.out.println("El paciente que usted estábuscando es: ");
//		System.out.println(p1);

		/*
		 * TAREA 8 (comentado para continuar con talleres) Estudiante estu1 = new
		 * Estudiante(); estu1.setId(2); estu1.setNombre("Pedro");
		 * estu1.setApellido("Martinez"); estu1.setEdad(22);
		 * estu1.setFacultad("Medicina"); estu1.setSemestre("cuarto");
		 * 
		 * this.estudianteService.insertarEstudianteNuevo(estu1);
		 * 
		 * Vehiculo veh1 = new Vehiculo(); veh1.setId(2); veh1.setMarca("Toyota");
		 * veh1.setPaisOrigen("Brasil"); veh1.setPlaca("GYT234"); veh1.setPrecio(new
		 * BigDecimal(120000)); veh1.setValorMatricula(new BigDecimal(1000));
		 * 
		 * this.vehiculoService.insertarVehiculoNuevo(veh1);
		 * 
		 * Casa casa1 = new Casa(); casa1.setCallePrincipal("Andres Perez");
		 * casa1.setId(2); casa1.setMaterial("Adobe"); casa1.setNumCasa(76);
		 * casa1.setNumPisos(3); casa1.setPropietario("Estrella Ayala");
		 * 
		 * this.casaService.insertarCasaNueva(casa1);
		 * 
		 * Cuenta cuenta1 = new Cuenta(); cuenta1.setId(2);
		 * cuenta1.setNumCuenta("23426"); cuenta1.setPropietario("Gio Aslan");
		 * cuenta1.setSaldo(new BigDecimal(5545)); cuenta1.setTipo("Corriente");
		 * cuenta1.setInteres(new BigDecimal(100));
		 * 
		 * this.cuentaService.insertarCuentaNueva(cuenta1);
		 * 
		 * Animal anim1= new Animal(); anim1.setId(2); anim1.setEdad(5);
		 * anim1.setNombre("Jerry"); anim1.setEspecie("Felino grande");
		 * anim1.setPeso(100.00); anim1.setHabitat("Selva");
		 * 
		 * this.animalService.insertarAnimalNuevo(anim1);
		 * 
		 * Libro lib1= new Libro(); lib1.setId(2); lib1.setTitulo("La brujula dorada");
		 * lib1.setAutor("Philip Pullman"); lib1.setEdicion(6);
		 * lib1.setEditorial("Bantam Spectra"); lib1.setAnio(2000);
		 * 
		 * this.libroService.insertarLibroNuevo(lib1);
		 * 
		 * Tienda tienda = new Tienda(); tienda.setId(2); tienda.setNombre("Marea");
		 * tienda.setDireccion("Ecuatoriana"); tienda.setConstoArriendo(new
		 * BigDecimal(150)); tienda.setPropietario("Juana Perez");
		 * tienda.setTipo("De abarrotes");
		 * 
		 * this.tiendaService.insertarTiendaNueva(tienda);
		 * 
		 * Cancion cancion = new Cancion(); cancion.setId(2);
		 * cancion.setAlbum("Vertigo"); cancion.setCantante("Pablo Alboran");
		 * cancion.setCompositor("Pablo Alboran"); cancion.setGenero("Pop Latino");
		 * cancion.setTitulo("Dicen");
		 * 
		 * this.cancionService.insertarCancionNueva(cancion);
		 * 
		 * Profesor prof = new Profesor(); prof.setId(2); prof.setNombre("Karla");
		 * prof.setApellido("Quishpe"); prof.setCedula("158953");
		 * prof.setHorasClase(30); prof.setInstitucion("UCE");
		 * 
		 * this.profService.insertarProfesorNuevo(prof);
		 * 
		 * Universidad uni = new Universidad(); uni.setId(2);
		 * uni.setNombre("Politecnica Nacional"); uni.setAniosVida(125);
		 * uni.setCiudad("Quito"); uni.setPais("Ecuador"); uni.setNumCarreras(200);
		 * 
		 * this.uniService.insertarUniversidadNueva(uni);
		 */

	}

}
