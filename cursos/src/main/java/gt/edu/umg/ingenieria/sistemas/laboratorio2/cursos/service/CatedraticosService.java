package gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.service;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.dao.CatedraticosRepository;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.model.Catedraticos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatedraticosService {
    
    @Autowired
    private CatedraticosRepository catedraticosRepository;
    
    public List<Catedraticos> buscarTodos(){
        return (List<Catedraticos>)this.catedraticosRepository.findAll();
    }
    
    public Catedraticos registrar(Catedraticos catedratico){
        return this.catedraticosRepository.save(catedratico);
    }
}
