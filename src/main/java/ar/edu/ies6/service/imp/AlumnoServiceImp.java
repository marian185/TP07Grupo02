package ar.edu.ies6.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.edu.ies6.model.Alumno;
import ar.edu.ies6.service.IAlumnoService;
import ar.edu.ies6.util.AlmacenAlumnos;


@Service
@Qualifier("servicioAlumnoArrayList")

public class AlumnoServiceImp implements IAlumnoService {

	@Override
	public void guardarAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		AlmacenAlumnos.alumnos.add(alumno);
		
		System.out.println(AlmacenAlumnos.alumnos.get(0).getDni());
	}

	@Override
	public void eliminarAlumno(String dni) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarAlumno(Alumno alumnoModificado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Alumno consultarAlumno(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Alumno> listarTodosAlumnos() {
		// TODO Auto-generated method stub
		return AlmacenAlumnos.alumnos ;
	}

}
