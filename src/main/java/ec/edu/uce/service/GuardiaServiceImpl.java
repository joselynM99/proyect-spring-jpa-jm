package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Guardia;
import ec.edu.uce.repository.jpa.IGuardiaRepo;

@Service
public class GuardiaServiceImpl implements IGuardiaService {
	
	@Autowired
	private IGuardiaRepo guardiaRepo;

	@Override
	public void guardarGuardia(Guardia guardia) {
		this.guardiaRepo.insertarGuardia(guardia);
	}

	@Override
	public void actualizar(Guardia guardia) {
		this.guardiaRepo.actualizarGuardia(guardia);		
	}

	@Override
	public Guardia buscar(Integer id) {
		return this.guardiaRepo.buscarGuardiaPorID(id);
	}

	@Override
	public void borrar(Integer id) {
		this.guardiaRepo.borrarGuardiaPorId(id);		
	}

	@Override
	public Guardia buscarPorApellido(String apellido) {
		return this.guardiaRepo.buscarGuardiaPorApellido(apellido);
	}

}
