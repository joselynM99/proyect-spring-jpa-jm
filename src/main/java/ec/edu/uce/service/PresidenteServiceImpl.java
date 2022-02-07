package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Presidente;
import ec.edu.uce.repository.jpa.IPresidenteRepo;

@Service
public class PresidenteServiceImpl implements IPresidenteService{

	@Autowired
	private IPresidenteRepo presidenteRepo;
	
	@Override
	public void guardarPresidente(Presidente presidente) {
		this.presidenteRepo.insertarPresidente(presidente);
	}
	
}
