package ar.edu.ies6.Repository;

//import org.springframework.stereotype.Repository;
import ar.edu.ies6.model.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
//@Repository
public interface MateriaRepository extends JpaRepository <Materia,Long>{
List<Materia>   findByEstadoTrue();
}
 
    

