package gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Catedraticos {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "nombres")
    private String nombres;
    
    @Column(name = "apelldios")
    private String apellidos;
    
    @Column(name = "codigo_catedratico")
    private String codigoCatedratico;

    public Catedraticos() {
    }

    public Catedraticos(Long id, String nombres, String apellidos, String codigoCatedratico) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigoCatedratico = codigoCatedratico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCodigoCatedratico() {
        return codigoCatedratico;
    }

    public void setCodigoCatedratico(String codigoCatedratico) {
        this.codigoCatedratico = codigoCatedratico;
    }
    
    
}
