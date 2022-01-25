package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Fruta;
import ec.edu.uce.repository.jpa.IFrutaRepo;

@Service
public class FrutaServiceImpl implements IFrutaService {

	@Autowired
	private IFrutaRepo frutaRepo;

	@Override
	public void guardarFruta(Fruta fruta) {
		this.frutaRepo.insertarFruta(fruta);
	}

	@Override
	public void actualizar(Fruta fruta) {
		this.frutaRepo.actualizarFruta(fruta);
	}

	@Override
	public Fruta buscar(Integer id) {
		return this.frutaRepo.buscarFrutaPorID(id);
	}

	@Override
	public void borrar(Integer id) {
		this.frutaRepo.borrarFrutaPorId(id);
		
	}

	@Override
	public Fruta buscarFrutaPorColor(String color) {
		return this.frutaRepo.buscarFrutaPorColor(color);
	}

	@Override
	public Fruta buscarFrutaPorColorTyped(String color) {
		return this.frutaRepo.buscarFrutaPorColorTyped(color);
	}

	@Override
	public Fruta buscarFrutaPorColorNamed(String color) {
		return this.frutaRepo.buscarFrutaPorColorNamed(color);
	}

	@Override
	public Fruta buscarFrutaPorColorNative(String color) {
		return this.frutaRepo.buscarFrutaPorColorNative(color);
	}

}
