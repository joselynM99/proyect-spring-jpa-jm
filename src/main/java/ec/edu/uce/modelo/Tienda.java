package ec.edu.uce.modelo;

import java.math.BigDecimal;

public class Tienda {

	// id, nombre, direccion, tipo, propietario, costo_arriendo

	private Integer id;
	private String nombre;
	private String direccion;
	private String tipo;
	private String propietario;
	private BigDecimal constoArriendo;

	// Metodos set y get
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public BigDecimal getConstoArriendo() {
		return constoArriendo;
	}

	public void setConstoArriendo(BigDecimal constoArriendo) {
		this.constoArriendo = constoArriendo;
	}

	@Override
	public String toString() {
		return "Tienda [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", tipo=" + tipo
				+ ", propietario=" + propietario + ", constoArriendo=" + constoArriendo + "]";
	}

}
