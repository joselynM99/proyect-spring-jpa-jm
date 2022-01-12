package ec.edu.uce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.service.IPacienteService;

@SpringBootApplication
public class ProyectoSpringJpaJmApplication implements CommandLineRunner{

	@Autowired
	private IPacienteService pacienteService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringJpaJmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Paciente paciente1 = new Paciente();
		paciente1.setId(4);
		paciente1.setNombre("Jorge");
		paciente1.setApellido("Gomez");
		paciente1.setEdad(62);
		
		this.pacienteService.insertarPacienteNuevo(paciente1);
	}

}
