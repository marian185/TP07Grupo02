package ar.edu.ies6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

import  ar.edu.ies6.model.Materia;
import ar.edu.ies6.Repository.MateriaRepository;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ControllerMateria {
    @Autowired
    private MateriaRepository materiaRepository;
    @GetMapping("/inicio") 
    public String mostrarInicio (){
        return "index";
    } 
    



    @GetMapping("/formulario")
    public String mostrarFormulario(Model model){
        model.addAttribute("materia", new Materia());
        return "formulario";
    }


    @PostMapping("/guardarMateria")
    public String guardarMateria(@ModelAttribute Materia materia,Model model ) {
        materiaRepository.save(materia);
        
        return "redirect:/inicio";
    }
    
    

    @GetMapping("/materias")
    public String listaMateria (Model model){
 model.addAttribute("materias", materiaRepository.findByEstadoTrue());
        return "listaMaterias";
    }


    @PostMapping("/eliminarMateria/{codigo}")
    public String eliminarMateria(@PathVariable Long codigo ){


        Materia materia=materiaRepository.findById(codigo).orElse(null);

            if(materia!=null){

                materia.setEstado(false);
                materiaRepository.save(materia);

            }
            return"redirect:/materias";
    }
}
