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
@Table(name = "registro_pago")
public class RegistroPagoMembresia {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_registro_pago")
	@SequenceGenerator(name = "seq_registro_pago", sequenceName = "seq_registro_pago", allocationSize = 1)
	@Column(name = "repa_id")
	private Integer id;

	@Column(name = "repa_fecha_pago")
	private LocalDateTime fechaPago;

	@Column(name = "repa_valor_pago")
	private BigDecimal valorPago;

	@ManyToOne
	@JoinColumn(name = "clgi_id")
	private ClienteGimnasio cliente;

	@ManyToOne
	@JoinColumn(name = "memb_id")
	private MembresiaGimnasio membresia;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(LocalDateTime fechaPago) {
		this.fechaPago = fechaPago;
	}

	public BigDecimal getValorPago() {
		return valorPago;
	}

	public void setValorPago(BigDecimal valorPago) {
		this.valorPago = valorPago;
	}

	public ClienteGimnasio getCliente() {
		return cliente;
	}

	public void setCliente(ClienteGimnasio cliente) {
		this.cliente = cliente;
	}

	public MembresiaGimnasio getMembresia() {
		return membresia;
	}

	public void setMembresia(MembresiaGimnasio membresia) {
		this.membresia = membresia;
	}

	@Override
	public String toString() {
		return "RegistroPagoMembresia [id=" + id + ", fechaPago=" + fechaPago + ", valorPago=" + valorPago
				+ ", cliente=" + cliente + ", membresia=" + membresia + "]";
	}

}
