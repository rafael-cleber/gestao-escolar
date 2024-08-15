package projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.model.Cursos;

public interface CursosRepository extends JpaRepository<Cursos, Integer> {

}
