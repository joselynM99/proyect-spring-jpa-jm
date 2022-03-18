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
@Table(name = "poliza_seguro")
public class PolizaSeguro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_poliza_seguro")
	@SequenceGenerator(name = "seq_poliza_seguro", sequenceName = "seq_poliza_seguro", allocationSize = 1)
	@Column(name = "pose_id")
	private Integer id;

	@Column(name = "pose_numero")
	private String numero;
	
	@Column(name = "pose_valor")
	private BigDecimal valor;
	
	@Column(name = "pose_descripcion")
	private String descripcion;
	
	@Column(name = "pose_fecha_emision")
	private LocalDateTime fechaEmision;
	
	@Column(name = "pose_fecha_vigencia")
	private LocalDateTime fechaVigencia;
	
	@Column(name = "pose_estado")
	private String estado;

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

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDateTime getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(LocalDateTime fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public LocalDateTime getFechaVigencia() {
		return fechaVigencia;
	}

	public void setFechaVigencia(LocalDateTime fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	



}
