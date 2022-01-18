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

}
