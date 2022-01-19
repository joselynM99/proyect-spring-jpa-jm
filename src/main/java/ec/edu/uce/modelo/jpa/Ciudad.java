package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ciudad")
public class Ciudad {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_ciudad")
	@SequenceGenerator(name = "seq_ciudad", sequenceName = "seq_ciudad", allocationSize = 1)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "pais")
	private String pais;

	@Column(name = "num_pobladores")
	private Integer numPobladores;

	// metodos set y get
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

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Integer getNumPobladores() {
		return numPobladores;
	}

	public void setNumPobladores(Integer numPobladores) {
		this.numPobladores = numPobladores;
	}

	@Override
	public String toString() {
		return "Ciudad [id=" + id + ", nombre=" + nombre + ", pais=" + pais + ", numPobladores=" + numPobladores + "]";
	}

}
