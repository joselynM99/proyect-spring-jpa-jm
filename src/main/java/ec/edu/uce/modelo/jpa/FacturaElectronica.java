package ec.edu.uce.modelo.jpa;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "factura_electronica")
public class FacturaElectronica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cliente_gimnasio")
	@SequenceGenerator(name = "seq_cliente_gimnasio", sequenceName = "seq_cliente_gimnasio", allocationSize = 1)
	@Column(name = "fael_id")
	private Integer id;
	
	@Column(name = "fael_cedula_cliente")
	private String cedulaCliente;
	
	@Column(name = "fael_fecha_pago")
	private LocalDateTime fechaPago;
	
	@Column(name = "fael_valor_pago")
	private BigDecimal valorPago;

	//Metodos set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
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

	@Override
	public String toString() {
		return "FacturaElectronica [id=" + id + ", cedulaCliente=" + cedulaCliente + ", fechaPago=" + fechaPago
				+ ", valorPago=" + valorPago + "]";
	}
	
	

}
