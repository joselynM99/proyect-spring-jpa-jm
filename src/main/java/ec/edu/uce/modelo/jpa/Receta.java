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
@Table(name = "receta")
public class Receta {

	@Id
	@Column(name = "rece_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_receta")
	@SequenceGenerator(name = "seq_receta", sequenceName = "seq_receta", allocationSize = 1)
	private Integer id;

	@Column(name = "rece_clinica")
	private String clinica;

	@Column(name = "rece_fecha")
	private LocalDateTime fecha;

	@Column(name = "rece_cedula")
	private String cedula;

	// Relacion de uno a muchos
	@OneToMany(mappedBy = "receta", cascade = CascadeType.ALL) // sale del atributo de DetalleFactura
	private List<DetalleReceta> detalles;

	// Metodos set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClinica() {
		return clinica;
	}

	public void setClinica(String clinica) {
		this.clinica = clinica;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public List<DetalleReceta> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<DetalleReceta> detalles) {
		this.detalles = detalles;
	}

	@Override
	public String toString() {
		return "Receta [id=" + id + ", clinica=" + clinica + ", fecha=" + fecha + ", cedula=" + cedula + "]";
	}

}
