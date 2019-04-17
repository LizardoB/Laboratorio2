package gt.edu.umg.ingenieria.sistemas.laboratorio2.estudiantes.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.estudiantes.model.Estudiantes;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.estudiantes.dao.EstudiantesRepository;

@Service
public class EstudiantesService {
    
    
    @Autowired
    private EstudiantesRepository estudiantesRepository;
    
    public List<Estudiantes> buscarTodos(){
        return (List<Estudiantes>) this.estudiantesRepository.findAll();
    }
    
    public Estudiantes registrar(Estudiantes estudiantes){
        return this.estudiantesRepository.save(estudiantes);
    }
}
