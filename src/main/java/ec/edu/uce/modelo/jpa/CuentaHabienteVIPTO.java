package ec.edu.uce.modelo.jpa;

import java.math.BigDecimal;

public class CuentaHabienteVIPTO {

	private String nombre;

	private String apellido;

	private String cedula;

	private BigDecimal saldo;

	private String tipo;

	private String numeroCuenta;
	
	

	/**
	 * @param nombre
	 * @param apellido
	 * @param cedula
	 * @param saldo
	 * @param tipo
	 * @param numeroCuenta
	 */
	public CuentaHabienteVIPTO(String nombre, String apellido, String cedula, BigDecimal saldo, String tipo,
			String numeroCuenta) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.saldo = saldo;
		this.tipo = tipo;
		this.numeroCuenta = numeroCuenta;
	}

	// Metodo set y getO
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

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	

}
