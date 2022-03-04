package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.HistoricoRetiros;

public interface IHistoricoRetirosService {
	
	void insertar(HistoricoRetiros retiros);

	void actualizar(HistoricoRetiros retiros);

	HistoricoRetiros buscarPorID(Integer id);

	void borrarPorId(Integer id);

}
