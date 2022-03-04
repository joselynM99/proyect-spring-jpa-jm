package ec.edu.uce.modelo.jpa;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
@Table(name = "historico_retiros")
public class HistoricoRetiros {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_historico_retiros")
	@SequenceGenerator(name = "seq_historico_retiros", sequenceName = "seq_historico_retiros", allocationSize = 1)
	@Column(name = "hire_id")
	private Integer id;

	@Column(name = "hiere_monto")
	private BigDecimal monto;

	@Column(name = "hire_fecha", columnDefinition = "TIMESTAMP")
	private LocalDateTime fecha;

	@ManyToOne
	@JoinColumn(name = "cuha_id")
	private CuentaHabiente cuentaHabiente;

	@ManyToOne
	@JoinColumn(name = "cuba_id")
	private CuentaBancariaCA cuentaBancaria;

	//Metodos get y set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public CuentaHabiente getCuentaHabiente() {
		return cuentaHabiente;
	}

	public void setCuentaHabiente(CuentaHabiente cuentaHabiente) {
		this.cuentaHabiente = cuentaHabiente;
	}

	public CuentaBancariaCA getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(CuentaBancariaCA cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

	@Override
	public String toString() {
		return "HistoricoRetiros [id=" + id + ", monto=" + monto + ", fecha=" + fecha + ", cuentaHabiente="
				+ cuentaHabiente + ", cuentaBancaria=" + cuentaBancaria + "]";
	}

}
