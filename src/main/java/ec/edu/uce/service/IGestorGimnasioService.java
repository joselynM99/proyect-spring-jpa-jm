package ec.edu.uce.service;

import java.time.LocalDateTime;

public interface IGestorGimnasioService {

	void insertarCliente(String nombre, String apellido, String cedula, LocalDateTime fechaNacimiento, String estado);

	void pagarMembresia(String cedula, String codigo);
}
