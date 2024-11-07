package ar.edu.ies6.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.edu.ies6.model.Docente;
import ar.edu.ies6.service.IDocenteService;
import ar.edu.ies6.util.AlmacenDocentes;

@Service
@Qualifier("servicioDocenteArrayList")
public class DocenteServiceImp implements IDocenteService {
	
	@Override
	public void guardarDocente(Docente docente) {
		AlmacenDocentes.docentes.add(docente);
		
		System.out.println(AlmacenDocentes.docentes.get(0).getDni());
	}
	@Override
	public void eliminarDocente(double dni){
		
	}
	@Override
	public void modificarDocente(Docente docenteModificado) {
		
	}
	@Override
	public Docente consultarDocente(double dni) {
		return null;
	}
	@Override
	public List<Docente>listarTodosDocente(){
		
		return AlmacenDocentes.docentes;
		
	}

}
