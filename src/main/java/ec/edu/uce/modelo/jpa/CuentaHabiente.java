package ec.edu.uce.modelo.jpa;

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
@Table(name = "cuenta_habiente")
public class CuentaHabiente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cuenta_habiente")
	@SequenceGenerator(name = "seq_cuenta_habiente", sequenceName = "seq_cuenta_habiente", allocationSize = 1)
	@Column(name = "cuha_id")
	private Integer id;

	@Column(name = "cuha_nombre")
	private String nombre;

	@Column(name = "cuha_apellido")
	private String apellido;

	@Column(name = "cuha_cedula")
	private String cedula;
	
	@OneToMany(mappedBy = "cuentaHabiente", cascade = CascadeType.ALL) 
	private List<CuentaBancariaCA> cuentasBancarias;
	
	@OneToMany(mappedBy = "cuentaHabiente", cascade = CascadeType.ALL) 
	private List<HistoricoRetiros> retiros;
	
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	
	public List<CuentaBancariaCA> getCuentasBancarias() {
		return cuentasBancarias;
	}

	public void setCuentasBancarias(List<CuentaBancariaCA> cuentasBancarias) {
		this.cuentasBancarias = cuentasBancarias;
	}

	public List<HistoricoRetiros> getRetiros() {
		return retiros;
	}

	public void setRetiros(List<HistoricoRetiros> retiros) {
		this.retiros = retiros;
	}

	@Override
	public String toString() {
		return "CuentaHabiente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ "]";
	}

}
