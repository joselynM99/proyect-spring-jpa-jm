package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Tienda;
import ec.edu.uce.repository.ITiendaRepo;

@Service
public class TiendaServiceImpl implements ITiendaService {

	@Autowired
	private ITiendaRepo tiendaRepo;

	@Override
	public void insertarTiendaNueva(Tienda tienda) {
		this.tiendaRepo.insertarTienda(tienda);
	}

	@Override
	public void borrarTiendaPorId(Integer id) {
		this.tiendaRepo.borrarTienda(id);
	}

	@Override
	public void actualizarTienda(Tienda tienda) {
		this.tiendaRepo.actualizarTienda(tienda);
	}

	@Override
	public Tienda buscarTiendaPorID(Integer id) {
		// TODO Auto-generated method stub
		return this.tiendaRepo.buscarTienda(id);
	}

}
