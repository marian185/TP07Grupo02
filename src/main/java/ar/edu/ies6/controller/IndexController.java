package ar.edu.ies6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.ies6.model.Alumno;
import ar.edu.ies6.service.IAlumnoService;

@Controller
public class IndexController {
	//gestiona el acceso ala vista
	
@Autowired
     Alumno unAlumno; 
@Autowired
@Qualifier("servicioAlumnoBD")
     IAlumnoService alumnoService;
	
//creado del alumno
@GetMapping("/alumnos")
public ModelAndView getIndexWithAlumnos () {
	//transporte hacia la vista
	
	ModelAndView transportador = new ModelAndView("alumno");
	transportador.addObject("alumno", unAlumno);
	
	return transportador;
}

@PostMapping("/guardarAlumno")
public ModelAndView guardarAlumno(Alumno alumno) {
	
	//AlumnoServiceImp alumnoService = new AlumnoServiceImp();
	alumnoService.guardarAlumno(alumno);
	
	ModelAndView transportador = new ModelAndView("listaAlumnos");
	transportador.addObject("listadoAlumnos", alumnoService.listarTodosAlumnos());
	
	return transportador;
}

}


