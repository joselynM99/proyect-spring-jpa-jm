package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "fruta")
@NamedQuery(name = "Fruta.buscarPorColor", query = "select fr from Fruta fr where fr.color =:valor")
public class Fruta {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_fruta")
	@SequenceGenerator(name = "seq_fruta", sequenceName = "seq_fruta", allocationSize = 1)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "color")
	private String color;

	@Column(name = "tipo_semilla")
	private String tipoSemilla;

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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipoSemilla() {
		return tipoSemilla;
	}

	public void setTipoSemilla(String tipoSemilla) {
		this.tipoSemilla = tipoSemilla;
	}

	@Override
	public String toString() {
		return "Fruta [id=" + id + ", nombre=" + nombre + ", color=" + color + ", tipoSemilla=" + tipoSemilla + "]";
	}

}
