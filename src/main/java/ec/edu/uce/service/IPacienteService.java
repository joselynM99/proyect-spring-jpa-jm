package ec.edu.uce.service;

import ec.edu.uce.modelo.Paciente;

public interface IPacienteService {
	void insertarPacienteNuevo(Paciente paciente);
	void borrarPacientePorId(Integer id);
	void actualizarPaciente(Paciente paciente);
	Paciente buscarPacientePorID(Integer id);
}

