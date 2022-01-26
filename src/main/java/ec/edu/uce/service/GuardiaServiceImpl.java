package ec.edu.uce.service;

import java.util.List;

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

	@Override
	public Guardia buscarPorApellidoTyped(String apellido) {
		return this.guardiaRepo.buscarGuardiasPorApellidoType(apellido);
	}

	@Override
	public Guardia buscarPorApellidoNamed(String apellido) {
		return this.guardiaRepo.buscarGuardiasPorApellidoNamed(apellido);
	}

	@Override
	public Guardia buscarGuardiasPorApellidoNative(String apellido) {
		return this.guardiaRepo.buscarGuardiasPorApellidoNative(apellido);
	}

	@Override
	public Guardia buscarGuardiasPorApellidoNamedNative(String apellido) {
		return this.guardiaRepo.buscarGuardiasPorApellidoNamedNative(apellido);
	}
	
	@Override
	public Guardia buscarGuardiasPorApellidoCriteriaAPI(String apellido) {
		return this.guardiaRepo.buscarGuardiasPorApellidoCriteriaAPI(apellido);
	}
	
	@Override
	public Guardia buscarGuardiasPorApellidoCriteriaAPIAND(String apellido, String edificio) {
		return this.guardiaRepo.buscarGuardiasPorApellidoCriteriaAPIAND(apellido, edificio);
	}

	@Override
	public List<Guardia> buscarGuardiasPorApellidoCriteriaAPIOR(String apellido, String edificio) {
		return this.guardiaRepo.buscarGuardiasPorApellidoCriteriaAPIOR(apellido, edificio);
	}


	@Override
	public Guardia buscarListaGuardiasPorApellido(String apellido) {
		return this.guardiaRepo.buscarListaGuardiasPorApellido(apellido);
	}

	

	
}
