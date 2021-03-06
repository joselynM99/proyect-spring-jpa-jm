package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Ciudad;
import ec.edu.uce.repository.jpa.ICiudadRepo;

@Service
public class CiudadServiceImpl implements ICiudadService {

	@Autowired
	private ICiudadRepo ciudadRepo;

	@Override
	public void guardarCiudad(Ciudad ciudad) {
		this.ciudadRepo.insertarCiudad(ciudad);
	}

	@Override
	public void actualizar(Ciudad ciudad) {
		this.ciudadRepo.actualizarCiudad(ciudad);
	}

	@Override
	public Ciudad buscar(Integer id) {
		return this.ciudadRepo.buscarCiudadPorID(id);
	}

	@Override
	public void borrar(Integer id) {
		this.ciudadRepo.borrarCiudadPorId(id);
	}

	@Override
	public Ciudad buscarCiudadPorNombre(String nombre) {
		return this.ciudadRepo.buscarCiudadPorNombre(nombre);
	}

	@Override
	public Ciudad buscarCiudadPorNombreType(String nombre) {
		return this.ciudadRepo.buscarCiudadPorNombreType(nombre);
	}

	@Override
	public Ciudad buscarCiudadPorNombreNemed(String nombre) {
		return this.ciudadRepo.buscarCiudadPorNombreNemed(nombre);
	}

}
