package ar.edu.ies6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import  ar.edu.ies6.model.Materia;
import ar.edu.ies6.Repository.MateriaRepository;
@Controller
public class ControllerMateria {
    @Autowired
    private MateriaRepository materiaRepository;
    @GetMapping("/inicio") 
    public String mostrarInicio (){
        return "index";
    } 
}
