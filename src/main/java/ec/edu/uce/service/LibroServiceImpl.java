package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Libro;
import ec.edu.uce.repository.ILibroRepo;

@Service
public class LibroServiceImpl implements ILibroService{
	
	@Autowired
	private ILibroRepo libroRepo;

	@Override
	public void insertarLibroNuevo(Libro libro) {
		this.libroRepo.insertarLibro(libro);
		
	}

}
