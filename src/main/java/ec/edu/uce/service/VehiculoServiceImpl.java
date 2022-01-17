package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Vehiculo;
import ec.edu.uce.repository.IVehiculoRepo;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepo vehiculoRepo;

	@Override
	public void insertarVehiculoNuevo(Vehiculo vehiculo) {
		this.vehiculoRepo.insertarVehiculo(vehiculo);
	}

	@Override
	public void borrarVehiculoPorId(Integer id) {
		this.vehiculoRepo.borrarVehiculo(id);
	}

	@Override
	public void actualizarVehiculo(Vehiculo vehiculo) {
		this.vehiculoRepo.actualizarVehiculo(vehiculo);
	}

	@Override
	public Vehiculo buscarVehiculoPorID(Integer id) {
		// TODO Auto-generated method stub
		return this.vehiculoRepo.buscarVehiculo(id);
	}

}
