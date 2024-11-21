package src.main.java.com.universidad.registro.models;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String matricula;

    @ManyToMany
    @JoinTable(
        name = "alumno_materia",
        joinColumns = @JoinColumn(name = "alumno_id"),
        inverseJoinColumns = @JoinColumn(name = "materia_id")
    )
    private Set<Materia> materias;

    // Getters y Setters
}
