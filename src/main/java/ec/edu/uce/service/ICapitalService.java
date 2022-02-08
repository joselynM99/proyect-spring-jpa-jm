package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.modelo.jpa.Capital;

public interface ICapitalService {

	void guardarCapital(Capital capital);

	List<Capital> buscarCapitalPorPoblacionJOIN(Integer población);

	List<Capital> buscarCapitalPorPoblacionLEFTJOIN(Integer población);

	List<Capital> buscarCapitalPorPoblacionRIGHTJOIN(Integer población);

	List<Capital> buscarCapitalPorPoblacionWHERE(Integer población);
}
