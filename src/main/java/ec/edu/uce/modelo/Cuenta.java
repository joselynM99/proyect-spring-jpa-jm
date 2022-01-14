package ec.edu.uce.modelo;

import java.math.BigDecimal;

public class Cuenta {

	// id, propietario, saldo, tipo, interes, num_cuenta

	private Integer id;
	private String numCuenta;
	private String propietario;
	private BigDecimal saldo;
	private String tipo;
	private BigDecimal interes;

	// Metodos set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
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

	public BigDecimal getInteres() {
		return interes;
	}

	public void setInteres(BigDecimal interes) {
		this.interes = interes;
	}

	@Override
	public String toString() {
		return "Cuenta [id=" + id + ", numCuenta=" + numCuenta + ", propietario=" + propietario + ", saldo=" + saldo
				+ ", tipo=" + tipo + ", interes=" + interes + "]";
	}
	
	

}
