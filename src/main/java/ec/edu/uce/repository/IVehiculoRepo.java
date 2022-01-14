package ec.edu.uce.repository;

import ec.edu.uce.modelo.Vehiculo;

public interface IVehiculoRepo {
	
	void insertarVehiculo(Vehiculo vehiculo);

	Vehiculo buscarVehiculo(Integer id);

	void actualizarVehiculo(Vehiculo vehiculo);

	void borrarVehiculo(Integer id);

}
