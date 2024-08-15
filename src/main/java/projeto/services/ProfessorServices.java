package projeto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.model.Professor;
import projeto.repository.ProfessorRepository;

import java.util.List;

@Service
public class ProfessorServices {
    @Autowired
    private ProfessorRepository professorRepository;


    public Professor Salvar(Professor professor) {
        return professorRepository.save(professor);
    }

    public List<Professor> listarProfessor() {

        return professorRepository.findAll();
    }

}
