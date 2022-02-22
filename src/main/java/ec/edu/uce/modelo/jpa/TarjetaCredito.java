package ec.edu.uce.modelo.jpa;

import java.math.BigDecimal;
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
@Table(name = "tarjeta_credito")
public class TarjetaCredito {

//	Id Tarjeta (PK)
//	Numero Tarjeta
//	Cédula Propietario
//	Cupo (BigDecimal

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tarjeta_credito")
	@SequenceGenerator(name = "seq_tarjeta_credito", sequenceName = "seq_tarjeta_credito", allocationSize = 1)
	@Column(name = "tacr_id")
	private Integer id;

	@Column(name = "tacr_numero_tarjeta")
	private String numeroTarjeta;

	@Column(name = "tacr_cedula_propietario")
	private String cedulaPropietario;

	@Column(name = "tacr_cupo")
	private BigDecimal cupo;

	@OneToMany(mappedBy = "tarjetaCredito", cascade = CascadeType.ALL)
	private List<Consumo> consumos;

	//Metodos set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getCedulaPropietario() {
		return cedulaPropietario;
	}

	public void setCedulaPropietario(String cedulaPropietario) {
		this.cedulaPropietario = cedulaPropietario;
	}

	public BigDecimal getCupo() {
		return cupo;
	}

	public void setCupo(BigDecimal cupo) {
		this.cupo = cupo;
	}

	public List<Consumo> getConsumos() {
		return consumos;
	}

	public void setConsumos(List<Consumo> consumos) {
		this.consumos = consumos;
	}

}
