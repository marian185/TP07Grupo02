package ar.edu.ies6.Repository;

import org.springframework.stereotype.Repository;
import ar.edu.ies6.model.Materia;
import org.springframework.data.repository.CrudRepository;
@Repository
public interface MateriaRepository extends CrudRepository <Materia,Integer>{

}
 
    

