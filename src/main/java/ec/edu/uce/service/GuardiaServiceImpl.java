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

}
