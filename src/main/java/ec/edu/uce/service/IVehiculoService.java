package ec.edu.uce.service;

import ec.edu.uce.modelo.Vehiculo;

public interface IVehiculoService {

	void insertarVehiculoNuevo(Vehiculo vehiculo);

	void borrarVehiculoPorId(Integer id);

	void actualizarVehiculo(Vehiculo vehiculo);

	Vehiculo buscarVehiculoPorID(Integer id);
}
