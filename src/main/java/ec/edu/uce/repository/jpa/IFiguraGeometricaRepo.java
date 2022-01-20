package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.FiguraGeometrica;

public interface IFiguraGeometricaRepo {
	
	void insertarFiguraGeometrica(FiguraGeometrica figura);

	void actualizarFiguraGeometrica(FiguraGeometrica figura);

	FiguraGeometrica buscarFiguraGeometricaPorID(Integer id);

	void borrarFiguraGeometricaPorId(Integer id);
	
	FiguraGeometrica buscarFiguraPorNombre(String nombre);
}
