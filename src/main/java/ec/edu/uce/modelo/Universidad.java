package ec.edu.uce.modelo;

public class Universidad {
	
	//id, nombre, pais, anios_vida, ciudad, num_carreras
	
	private Integer id;
	private String nombre;
	private String pais;
	private Integer aniosVida;
	private String ciudad;
	private Integer numCarreras;
	
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
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Integer getAniosVida() {
		return aniosVida;
	}
	public void setAniosVida(Integer aniosVida) {
		this.aniosVida = aniosVida;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Integer getNumCarreras() {
		return numCarreras;
	}
	public void setNumCarreras(Integer numCarreras) {
		this.numCarreras = numCarreras;
	}
	@Override
	public String toString() {
		return "Universidad [id=" + id + ", nombre=" + nombre + ", pais=" + pais + ", aniosVida=" + aniosVida
				+ ", ciudad=" + ciudad + ", numCarreras=" + numCarreras + "]";
	}
	
	

}
