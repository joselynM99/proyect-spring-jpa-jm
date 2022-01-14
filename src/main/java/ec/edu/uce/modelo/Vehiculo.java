package ec.edu.uce.modelo;

import java.math.BigDecimal;

public class Vehiculo {
	
	private Integer id;
	private String marca;
	private String paisOrigen;
	private String placa;
	private BigDecimal precio;
	private BigDecimal valorMatricula;

	// Metodos Set y Get
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}

	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", marca=" + marca + ", paisOrigen=" + paisOrigen + ", placa=" + placa
				+ ", precio=" + precio + ", valorMatricula=" + valorMatricula + "]";
	}

	
	

}
