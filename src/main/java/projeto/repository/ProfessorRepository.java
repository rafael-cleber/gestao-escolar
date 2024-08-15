package projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {


}
