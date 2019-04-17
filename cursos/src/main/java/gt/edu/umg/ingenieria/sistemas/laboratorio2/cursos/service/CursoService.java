package gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.service;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.dao.CursoRepository;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.model.Curso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {
    
    @Autowired
    private CursoRepository cursoRepository;
    
    public List<Curso> buscarTodos(){
        return (List<Curso>)this.cursoRepository.findAll();
    }
    
    public Curso crear(Curso curso){
        return this.cursoRepository.save(curso);
    }
}
