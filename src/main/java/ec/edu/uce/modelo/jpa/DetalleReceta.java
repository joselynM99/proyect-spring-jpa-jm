package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_receta")
public class DetalleReceta {

	@Id
	@Column(name = "dere_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_det_receta")
	@SequenceGenerator(name = "seq_det_receta", sequenceName = "seq_det_receta", allocationSize = 1)
	private Integer id;

	@Column(name = "dere_nombre")
	private String nombre;

	@Column(name = "dere_cantidad")
	private Integer cantidad;

	@Column(name = "dere_indicaciones")
	private String indicaciones;

	@ManyToOne
	@JoinColumn(name = "rece_id")
	private Receta receta;

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

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getIndicaciones() {
		return indicaciones;
	}

	public void setIndicaciones(String indicaciones) {
		this.indicaciones = indicaciones;
	}

	public Receta getReceta() {
		return receta;
	}

	public void setReceta(Receta receta) {
		this.receta = receta;
	}

	@Override
	public String toString() {
		return "DetalleReceta [id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", indicaciones="
				+ indicaciones + "]";
	}

}
