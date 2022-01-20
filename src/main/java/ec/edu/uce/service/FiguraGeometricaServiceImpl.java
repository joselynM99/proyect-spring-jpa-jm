package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.FiguraGeometrica;
import ec.edu.uce.repository.jpa.IFiguraGeometricaRepo;

@Service
public class FiguraGeometricaServiceImpl implements IFiguraGeometricaService {

	@Autowired
	private IFiguraGeometricaRepo figuraRepo;

	@Override
	public void guardarFigura(FiguraGeometrica figura) {
		this.figuraRepo.insertarFiguraGeometrica(figura);
	}

	@Override
	public void actualizar(FiguraGeometrica figura) {
		this.figuraRepo.actualizarFiguraGeometrica(figura);
	}

	@Override
	public FiguraGeometrica buscar(Integer id) {
		return this.figuraRepo.buscarFiguraGeometricaPorID(id);
	}

	@Override
	public void borrar(Integer id) {
		this.figuraRepo.borrarFiguraGeometricaPorId(id);
	}

	@Override
	public FiguraGeometrica buscarFiguraPorNombre(String nombre) {
		return this.figuraRepo.buscarFiguraPorNombre(nombre);
	}

}
