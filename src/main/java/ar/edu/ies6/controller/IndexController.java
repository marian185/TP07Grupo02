package ar.edu.ies6.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.ies6.model.Alumno;
import ar.edu.ies6.util.Carrera;
import ar.edu.ies6.util.Curso;

@Controller
public class IndexController {
	//gestiona el acceso ala vista

@GetMapping("/alumno")
public ModelAndView getIndexWithAlumno () {
	Alumno unAlumno = new Alumno ();
	unAlumno.setDni("43789456");
	unAlumno.setApellido("Marino");
	unAlumno.setNombre("Mariel");
	unAlumno.setFechaNacimiento(LocalDate.of(2002,10,06));
	unAlumno.setDomicilio("B° Centro Perico");
	unAlumno.setCarrera(Carrera.PROFESORADO_DE_INFORMATICA);
	unAlumno.setCurso(Curso.SEGUNDO_AÑO);
	
	ModelAndView transportador = new ModelAndView("index");
	transportador.addObject("alumno", unAlumno);
	
	return transportador;
}

}
