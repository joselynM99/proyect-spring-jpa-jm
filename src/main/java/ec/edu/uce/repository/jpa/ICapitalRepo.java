package ec.edu.uce.repository.jpa;

import java.util.List;

import ec.edu.uce.modelo.jpa.Capital;

public interface ICapitalRepo {

	void insertarCapital(Capital capital);

	List<Capital> buscarCapitalPorPoblacionJOIN(Integer población);

	List<Capital> buscarCapitalPorPoblacionLEFTJOIN(Integer población);

	List<Capital> buscarCapitalPorPoblacionRIGHTJOIN(Integer población);

	List<Capital> buscarCapitalPorPoblacionWHERE(Integer población);

}
