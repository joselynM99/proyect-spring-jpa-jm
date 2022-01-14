package ec.edu.uce.modelo;

public class Profesor {
	//id, nombre, apellido, institucion, horas_clase, cedula
	
	private Integer id;
	private String nombre;
	private String apellido;
	private String institucion;
	private Integer horasClase;
	private String cedula;
	
	//Metodos set y get
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
	public String getInstitucion() {
		return institucion;
	}
	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}
	public Integer getHorasClase() {
		return horasClase;
	}
	public void setHorasClase(Integer horasClase) {
		this.horasClase = horasClase;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	@Override
	public String toString() {
		return "Profesor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", institucion=" + institucion
				+ ", horasClase=" + horasClase + ", cedula=" + cedula + "]";
	}
	
	

}
