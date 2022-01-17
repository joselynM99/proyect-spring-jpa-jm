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

	@Override
	public void borrarLibroPorId(Integer id) {
		this.libroRepo.borrarLibro(id);		
	}

	@Override
	public void actualizarLibro(Libro libro) {
		this.libroRepo.actualizarLibro(libro);		
	}

	@Override
	public Libro buscarLibroPorID(Integer id) {
		// TODO Auto-generated method stub
		return this.libroRepo.buscarLibro(id);
	}

}
