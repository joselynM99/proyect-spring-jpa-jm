package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.FiguraGeometrica;

public interface IFiguraGeometricaService {
	
	void guardarFigura(FiguraGeometrica figura);

	void actualizar(FiguraGeometrica figura);

	FiguraGeometrica buscar(Integer id);

	void borrar(Integer id);

	FiguraGeometrica buscarFiguraPorNombre(String nombre);

}
