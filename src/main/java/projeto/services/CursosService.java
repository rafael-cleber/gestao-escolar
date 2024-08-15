package projeto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.model.Cursos;
import projeto.repository.CursosRepository;

import java.util.List;

@Service
public class CursosService {
    @Autowired
    private CursosRepository cursoRepository;

    public Cursos salvarCurso(Cursos curso) {
        return cursoRepository.save(curso);
    }

    public List<Cursos> listarCursos() {
        return cursoRepository.findAll();
    }

    // Outros métodos conforme necessário
}
