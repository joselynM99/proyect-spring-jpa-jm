package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "pais")
public class Pais {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pais")
	@SequenceGenerator(name = "seq_pais", sequenceName = "seq_pais", allocationSize = 1)
	@Column(name = "pais_id")
	private Integer id;

	@Column(name = "pais_nombre")
	private String nombre;

	@Column(name = "pais_continente")
	private String continente;
	
	@OneToOne(mappedBy = "pais")
	private Presidente presidente;
	
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

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}

	public Presidente getPresidente() {
		return presidente;
	}

	public void setPresidente(Presidente presidente) {
		this.presidente = presidente;
	}

	
	
	

}
