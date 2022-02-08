package ec.edu.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Capital;
import ec.edu.uce.repository.jpa.ICapitalRepo;

@Service
public class CapitalServiceImpl implements ICapitalService {

	@Autowired
	private ICapitalRepo capitalRepo;

	@Override
	public void guardarCapital(Capital capital) {
		this.capitalRepo.insertarCapital(capital);
	}

	@Override
	public List<Capital> buscarCapitalPorPoblacionJOIN(Integer población) {
		return this.capitalRepo.buscarCapitalPorPoblacionJOIN(población);
	}

	@Override
	public List<Capital> buscarCapitalPorPoblacionLEFTJOIN(Integer población) {
		return this.capitalRepo.buscarCapitalPorPoblacionLEFTJOIN(población);
	}

	@Override
	public List<Capital> buscarCapitalPorPoblacionRIGHTJOIN(Integer población) {
		return this.capitalRepo.buscarCapitalPorPoblacionRIGHTJOIN(población);
	}

	@Override
	public List<Capital> buscarCapitalPorPoblacionWHERE(Integer población) {
		return this.capitalRepo.buscarCapitalPorPoblacionWHERE(población);
	}

}
