package ec.edu.uce.modelo.jpa;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "presidente")
public class Presidente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_presidente")
	@SequenceGenerator(name = "seq_presidente", sequenceName = "seq_presidente", allocationSize = 1)
	@Column(name = "pres_id")
	private Integer id;

	@Column(name = "pres_nombre")
	private String nombre;

	@Column(name = "pres_partido_politico")
	private String partidoPolitico;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pres_id_pais")
	private Pais pais;
	
	
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

	public String getPartidoPolitico() {
		return partidoPolitico;
	}

	public void setPartidoPolitico(String partidoPolitico) {
		this.partidoPolitico = partidoPolitico;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	

}
