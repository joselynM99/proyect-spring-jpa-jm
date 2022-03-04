package ec.edu.uce.modelo.jpa;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cuenta_bancaria_ca")
public class CuentaBancariaCA {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cuenta_b")
	@SequenceGenerator(name = "seq_cuenta_b", sequenceName = "seq_cuenta_b", allocationSize = 1)
	@Column(name = "cuba_id")
	private Integer id;

	@Column(name = "cuba_numero")
	private String numero;

	@Column(name = "cuba_saldo")
	private BigDecimal saldo;

	@Column(name = "cuba_tipo")
	private String tipo;

	@ManyToOne
	@JoinColumn(name = "cuha_id")
	private CuentaHabiente cuentaHabiente;
	
	@OneToMany(mappedBy = "cuentaHabiente", cascade = CascadeType.ALL) 
	private List<HistoricoRetiros> retiros;
	

//Metodos set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public CuentaHabiente getCuentaHabiente() {
		return cuentaHabiente;
	}

	public void setCuentaHabiente(CuentaHabiente cuentaHabiente) {
		this.cuentaHabiente = cuentaHabiente;
	}

	@Override
	public String toString() {
		return "CuentaBancariaCA [id=" + id + ", numero=" + numero + ", saldo=" + saldo + ", tipo=" + tipo
				+ "]";
	}

}
