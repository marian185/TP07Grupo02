package ar.edu.ies6.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.ies6.model.Alumno;

@Service

public interface IAlumnoService {
 //crod
 //metodos	
	public void guardarAlumno(Alumno alumno);
	public void eliminarAlumno(String dni);
	public void modificarAlumno(Alumno alumnoModificado);
	public Alumno consultarAlumno(String dni);
	public List<Alumno> listarTodosAlumnos();
	
}
