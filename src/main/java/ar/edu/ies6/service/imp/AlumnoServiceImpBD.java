package ar.edu.ies6.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.edu.ies6.model.Alumno;
import ar.edu.ies6.repository.AlumnoRepository;
import ar.edu.ies6.service.IAlumnoService;

@Service
@Qualifier("servicioAlumnoBD")
public class AlumnoServiceImpBD implements IAlumnoService {

	@Autowired
	AlumnoRepository alumnoRepository;
	
	@Override
	public void guardarAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		//guardar en la BD
	    alumnoRepository.save(alumno);	
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
		return (List<Alumno>) alumnoRepository.findAll();
	}

}
