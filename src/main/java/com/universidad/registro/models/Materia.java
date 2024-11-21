package src.main.java.com.universidad.registro.models;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String codigo;

    @ManyToMany(mappedBy = "materias")
    private Set<Alumno> alumnos;

    // Getters y Setters
}
