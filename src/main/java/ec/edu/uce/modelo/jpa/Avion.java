package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "avion")
public class Avion {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_avion")
	@SequenceGenerator(name = "seq_avion", sequenceName = "seq_avion", allocationSize = 1)
	@Column(name = "id")
	private Integer id;

	@Column(name = "modelo")
	private String modelo;

	@Column(name = "velocidad")
	private Double velocidad;

	@Column(name = "num_motores")
	private Integer numMotores;

	// Metodos set y get

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}

	public Integer getNumMotores() {
		return numMotores;
	}

	public void setNumMotores(Integer numMotores) {
		this.numMotores = numMotores;
	}

	@Override
	public String toString() {
		return "Avion [id=" + id + ", modelo=" + modelo + ", velocidad=" + velocidad + ", numMotores=" + numMotores
				+ "]";
	}

}
