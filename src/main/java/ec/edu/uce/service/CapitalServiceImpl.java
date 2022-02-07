package ec.edu.uce.service;

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

}
