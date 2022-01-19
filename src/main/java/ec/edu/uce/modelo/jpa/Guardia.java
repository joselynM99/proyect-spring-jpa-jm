package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "guardia") // Es totalmente necesario cuando la tabla tiene un nombre diferente
public class Guardia {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_guardia1")
	@SequenceGenerator(name = "seq_guardia1", sequenceName = "seq_guardia1", allocationSize = 1)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellido")
	private String apellido;

	@Column(name = "edificio")
	private String edificio;

	// Metodos set y get
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

	public String getEdificio() {
		return edificio;
	}

	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}

	@Override
	public String toString() {
		return "Guardia [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edificio=" + edificio + "]";
	}

}
