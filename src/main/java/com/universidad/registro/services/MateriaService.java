package src.main.java.com.universidad.registro.services;

import com.universidad.registro.models.Materia;
import com.universidad.registro.repositories.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaService {

    @Autowired
    private MateriaRepository materiaRepository;

    public List<Materia> listarMaterias() {
        return materiaRepository.findAll();
    }

    public Materia guardarMateria(Materia materia) {
        return materiaRepository.save(materia);
    }
}
