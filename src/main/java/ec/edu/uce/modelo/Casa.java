package ec.edu.uce.modelo;

public class Casa {

	private Integer id;
	private String material;
	private Integer numCasa;
	private String propietario;
	private String callePrincipal;
	private Integer numPisos;
	
	//id, material, num_casa, propietario, calle_principal, num_pisos

	// Metodos get y set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Integer getNumCasa() {
		return numCasa;
	}

	public void setNumCasa(Integer numCasa) {
		this.numCasa = numCasa;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public String getCallePrincipal() {
		return callePrincipal;
	}

	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}

	public Integer getNumPisos() {
		return numPisos;
	}

	public void setNumPisos(Integer numPisos) {
		this.numPisos = numPisos;
	}

	@Override
	public String toString() {
		return "Casa [id=" + id + ", material=" + material + ", numCasa=" + numCasa + ", propietario=" + propietario
				+ ", callePrincipal=" + callePrincipal + ", numPisos=" + numPisos + "]";
	}

}
