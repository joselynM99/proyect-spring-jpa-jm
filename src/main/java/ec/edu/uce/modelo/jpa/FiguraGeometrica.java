package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "figura_geometrica")
public class FiguraGeometrica {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_figura_geometrica")
	@SequenceGenerator(name = "seq_figura_geometrica", sequenceName = "seq_figura_geometrica", allocationSize = 1)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "perimetro")
	private Double perimetro;

	@Column(name = "area")
	private Double area;

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

	public Double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(Double perimetro) {
		this.perimetro = perimetro;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "FiguraGeometrica [id=" + id + ", nombre=" + nombre + ", perimetro=" + perimetro + ", area=" + area
				+ "]";
	}

}
