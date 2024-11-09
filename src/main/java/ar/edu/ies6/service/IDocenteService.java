package ar.edu.ies6.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.ies6.model.Docente;

@Service
public interface IDocenteService {
	
	public void guardarDocente(Docente docente);
	public void eliminarDocente(double dni);
	public void modificarDocente(Docente docenteModificado);
	public Docente consultarDocente(double dni);
	public List<Docente>listarTodosDocente();
	public List<Docente>listarTodosDocentesActivos();
}
