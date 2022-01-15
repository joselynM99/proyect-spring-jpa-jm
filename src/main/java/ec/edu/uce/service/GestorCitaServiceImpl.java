package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.modelo.Receta;

@Service
public class GestorCitaServiceImpl implements IGestorCitaService {

	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	private IRecetaService recetaService;
	
	//Inserta paciente y receta
	@Override
	public void registrarNuevaConsulta(Paciente paciente, Receta receta) {
		this.pacienteService.insertarPacienteNuevo(paciente);
		this.recetaService.guardarReceta(receta);

	}

}
