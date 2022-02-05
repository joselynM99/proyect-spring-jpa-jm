package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Empleado;
import ec.edu.uce.repository.jpa.IEmpleadoRepo;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{
	
	@Autowired
	private IEmpleadoRepo empleado;

	@Override
	public void guardarEmpleado(Empleado empleado) {
		this.empleado.insertarEmpleado(empleado);
	}

}
