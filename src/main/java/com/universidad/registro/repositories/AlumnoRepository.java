package src.main.java.com.universidad.registro.repositories;

import com.universidad.registro.models.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
}

