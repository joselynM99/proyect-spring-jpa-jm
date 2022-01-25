package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Avion;
import ec.edu.uce.repository.jpa.IAvionRepo;

@Service
public class AvionServiceImpl implements IAvionService {

	@Autowired
	private IAvionRepo avionRepo;

	@Override
	public void guardarAvion(Avion avion) {
		this.avionRepo.insertarAvion(avion);
	}

	@Override
	public void actualizar(Avion avion) {
		this.avionRepo.actualizarAvion(avion);
	}

	@Override
	public Avion buscar(Integer id) {
		return this.avionRepo.buscarAvionPorID(id);
	}

	@Override
	public void borrar(Integer id) {
		this.avionRepo.borrarAvionPorId(id);
	}

	@Override
	public Avion buscarPorModelo(String modelo) {
		return this.avionRepo.buscarPorModelo(modelo);
	}

	@Override
	public Avion buscarPorModeloType(String modelo) {
		return this.avionRepo.buscarPorModeloType(modelo);
	}

	@Override
	public Avion buscarPorModeloNamed(String modelo) {
		return this.avionRepo.buscarPorModeloNamed(modelo);
	}

	@Override
	public Avion buscarPorModeloNative(String modelo) {
		return this.avionRepo.buscarPorModeloNative(modelo);
	}

}
