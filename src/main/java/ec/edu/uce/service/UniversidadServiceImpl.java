package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Universidad;
import ec.edu.uce.repository.IUniversidadRepo;

@Service
public class UniversidadServiceImpl implements IUniversidadService {

	@Autowired
	private IUniversidadRepo uniRepo;

	@Override
	public void insertarUniversidadNueva(Universidad universidad) {
		this.uniRepo.insertarUniversidad(universidad);
	}

	@Override
	public void borrarUniversidadPorId(Integer id) {
		this.uniRepo.borrarUniversidad(id);
	}

	@Override
	public void actualizarUniversidad(Universidad universidad) {
		this.uniRepo.actualizarUniversidad(universidad);
	}

	@Override
	public Universidad buscarUniversidadPorID(Integer id) {
		// TODO Auto-generated method stub
		return this.uniRepo.buscarUniversidad(id);
	}

}
