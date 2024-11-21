package src.test.java.com.universidad.registro;

import com.universidad.registro.models.Alumno;
import com.universidad.registro.models.Materia;
import com.universidad.registro.repositories.AlumnoRepository;
import com.universidad.registro.repositories.MateriaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class RegistroApplicationTests {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private MateriaRepository materiaRepository;

    @Test
    public void testCrearAlumnoConMaterias() {
        // Crear materias
        Materia materia1 = new Materia();
        materia1.setNombre("Matemáticas");
        materia1.setCodigo("MAT101");

        Materia materia2 = new Materia();
        materia2.setNombre("Historia");
        materia2.setCodigo("HIS102");

        materiaRepository.save(materia
