package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Consumo;
import ec.edu.uce.repository.jpa.IConsumoRepo;

@Service
public class ConsumoServiceImpl implements IConsumoService{
	
	@Autowired
	private IConsumoRepo consumoRepo;

	@Override
	public void insertar(Consumo consumo) {
		this.consumoRepo.insertar(consumo);
	}

	@Override
	public void actualizar(Consumo consumo) {
		this.consumoRepo.actualizar(consumo);
	}

}
