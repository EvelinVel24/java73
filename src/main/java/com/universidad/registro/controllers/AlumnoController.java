package src.main.java.com.universidad.registro.controllers;

import com.universidad.registro.models.Alumno;
import com.universidad.registro.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping
    public List<Alumno> listarAlumnos() {
        return alumnoService.listarAlumnos();
    }

    @PostMapping
    public Alumno crearAlumno(@RequestBody Alumno alumno) {
        return alumnoService.guardarAlumno(alumno);
    }
}
