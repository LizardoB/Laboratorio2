package gt.edu.umg.ingenieria.sistemas.laboratorio2.estudiantes.controller;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.estudiantes.model.Estudiantes;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.estudiantes.service.EstudiantesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudiantes")
public class EstudiantesController {
    
    @Autowired
    private EstudiantesService estudiantesService;
    
    @GetMapping("/buscarTodos")
    public List<Estudiantes> buscarTodos(){
        return this.estudiantesService.buscarTodos();
    }
    
    @PostMapping("/registrar")
    public Estudiantes registrar(@RequestBody(required = true) Estudiantes estudiante){
        return this.estudiantesService.registrar(estudiante);
    }
}
