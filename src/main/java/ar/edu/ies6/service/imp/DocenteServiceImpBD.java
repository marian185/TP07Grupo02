package ar.edu.ies6.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.edu.ies6.model.Docente;
import ar.edu.ies6.repository.DocenteRepository;
import ar.edu.ies6.service.IDocenteService;

@Service
@Qualifier("servicioDocenteBD")
public class DocenteServiceImpBD implements IDocenteService{

	@Autowired
	DocenteRepository docenteRepository;
	
	@Override
	public void guardarDocente(Docente docente) {
		// TODO Auto-generated method stub
		//guardar en la BD
		docenteRepository.save(docente);
	}

	@Override
	public void eliminarDocente(double dni) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarDocente(Docente docenteModificado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Docente consultarDocente(double dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Docente> listarTodosDocente() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
