package projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.model.Estudante;

@Repository
public interface EstudanteRepository  extends JpaRepository<Estudante, Integer> {



}
