package ec.edu.uce.modelo;

public class Paciente {

	private Integer id; // al mapear los modelos debemos usar las clases wrappers, no los primitivos
	private String nombre;
	private String apellido;
	private Integer edad; //los wrapers nos proporcionan funcionalidad adicional

	// Metodos Set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Paciente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}

}
