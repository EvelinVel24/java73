package src.main.java.com.universidad.registro.repositories;

import com.universidad.registro.models.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MateriaRepository extends JpaRepository<Materia, Long> {
}
