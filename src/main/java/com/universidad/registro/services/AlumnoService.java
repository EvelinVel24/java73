package src.main.java.com.universidad.registro.services;

import com.universidad.registro.models.Alumno;
import com.universidad.registro.repositories.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    public List<Alumno> listarAlumnos() {
        return alumnoRepository.findAll();
    }

    public Alumno guardarAlumno(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }
}
