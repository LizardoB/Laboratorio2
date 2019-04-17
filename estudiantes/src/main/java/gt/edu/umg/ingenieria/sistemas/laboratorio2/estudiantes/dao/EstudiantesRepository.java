package gt.edu.umg.ingenieria.sistemas.laboratorio2.estudiantes.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.estudiantes.model.Estudiantes;

@Repository
public interface EstudiantesRepository extends CrudRepository<Estudiantes, Long>{
    
}
