package src.main.java.com.universidad.registro.controllers;

import com.universidad.registro.models.Materia;
import com.universidad.registro.services.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/materias")
public class MateriaController {

    @Autowired
    private MateriaService materiaService;

    @GetMapping
    public List<Materia> listarMaterias() {
        return materiaService.listarMaterias();
    }

    @PostMapping
    public Materia crearMateria(@RequestBody Materia materia) {
        return materiaService.guardarMateria(materia);
    }
}
