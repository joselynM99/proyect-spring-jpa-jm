package ec.edu.uce.modelo.jpa;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cliente_gimnasio")
public class ClienteGimnasio {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cliente_gimnasio")
	@SequenceGenerator(name = "seq_cliente_gimnasio", sequenceName = "seq_cliente_gimnasio", allocationSize = 1)
	@Column(name = "clgi_id")
	private Integer id;

	@Column(name = "clgi_nombre")
	private String nombre;

	@Column(name = "clgi_apellido")
	private String apellido;

	@Column(name = "clgi_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;

	@Column(name = "clgi_estado")
	private String estado;

	@Column(name = "clgi_cedula")
	private String cedula;

	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<RegistroPagoMembresia> registros;

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

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<RegistroPagoMembresia> getRegistros() {
		return registros;
	}

	public void setRegistros(List<RegistroPagoMembresia> registros) {
		this.registros = registros;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return "ClienteGimnasio [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + ", estado=" + estado + ", registros=" + registros + "]";
	}

}
