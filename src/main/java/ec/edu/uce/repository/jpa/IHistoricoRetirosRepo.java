package ec.edu.uce.repository.jpa;

import java.util.List;

import ec.edu.uce.modelo.jpa.HistoricoRetiros;

public interface IHistoricoRetirosRepo {
	void insertar(HistoricoRetiros retiros);

	void actualizar(HistoricoRetiros retiros);

	HistoricoRetiros buscarPorID(Integer id);

	void borrarPorId(Integer id);

	List<HistoricoRetiros> historicos();


}
