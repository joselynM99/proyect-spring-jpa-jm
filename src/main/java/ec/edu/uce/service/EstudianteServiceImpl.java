package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Vehiculo;
import ec.edu.uce.repository.IVehiculoRepo;

@Service
public class EstudianteServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepo vehiculoRepo;

	@Override
	public void insertarVehiculoNuevo(Vehiculo vehiculo) {
		this.vehiculoRepo.insertarVehiculo(vehiculo);

	}

}
