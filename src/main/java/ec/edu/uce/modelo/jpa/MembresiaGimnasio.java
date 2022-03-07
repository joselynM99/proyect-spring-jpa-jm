package ec.edu.uce.modelo.jpa;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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
@Table(name = "membresia")
public class MembresiaGimnasio {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_membresia")
	@SequenceGenerator(name = "seq_membresia", sequenceName = "seq_membresia", allocationSize = 1)
	@Column(name = "memb_id")
	private Integer id;

	@Column(name = "memb_codigo")
	private String codigo;

	@Column(name = "memb_nombre")
	private String nombre;

	@Column(name = "memb_valor")
	private BigDecimal valor;

	@Column(name = "memb_vigencia")
	private LocalDateTime vigencia;

	@Column(name = "memb_cantidad_clientes")
	private Integer cantidadClientes;

	@OneToMany(mappedBy = "membresia", cascade = CascadeType.ALL)
	private List<RegistroPagoMembresia> registros;

	// Mwtodos set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public LocalDateTime getVigencia() {
		return vigencia;
	}

	public void setVigencia(LocalDateTime vigencia) {
		this.vigencia = vigencia;
	}

	public Integer getCantidadClientes() {
		return cantidadClientes;
	}

	public void setCantidadClientes(Integer cantidadClientes) {
		this.cantidadClientes = cantidadClientes;
	}

	public List<RegistroPagoMembresia> getRegistros() {
		return registros;
	}

	public void setRegistros(List<RegistroPagoMembresia> registros) {
		this.registros = registros;
	}

	@Override
	public String toString() {
		return "MembresiaGimnasio [id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", valor=" + valor
				+ ", vigencia=" + vigencia + ", cantidadClientes=" + cantidadClientes + ", registros=" + registros
				+ "]";
	}

}
