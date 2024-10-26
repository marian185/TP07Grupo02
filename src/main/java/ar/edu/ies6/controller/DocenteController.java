package ar.edu.ies6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.ies6.model.Docente;

@Controller
public class DocenteController {
	
	@GetMapping("/indexDocente")
	public String getIndex() {
		System.out.println("ingreso por aqui IndexDocente");
		return "indexDocente";
	}
	@GetMapping("/docente")
	public ModelAndView getIndexWithDocente() {
		//Codigo
		//Creado el docente
		Docente unDocente = new Docente();
		unDocente.setApellido("Apellido001");
	    unDocente.setNombre("Nombre001");
		unDocente.setDni(231212);
		
		//transporte hacia la vista
		ModelAndView transportador = new ModelAndView("indexDocente");
		transportador.addObject("docente", unDocente);
        
		return transportador;
	}
}
