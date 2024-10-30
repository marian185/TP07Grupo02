package ar.edu.ies6.service.imp;

import java.util.List;

import ar.edu.ies6.model.Docente;
import ar.edu.ies6.service.IDocenteService;
import ar.edu.ies6.util.AlmacenDocentes;

public class DocenteServiceImp implements IDocenteService {
	
	@Override
	public void guardarDocente(Docente docente) {
		AlmacenDocentes.docentes.add(docente);
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
		return null;
		
	}

}
