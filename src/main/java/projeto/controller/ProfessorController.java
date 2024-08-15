package projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projeto.model.Professor;
import projeto.services.ProfessorServices;
import java.util.List;


@RestController
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    private ProfessorServices professorServices;

    @PostMapping
    public Professor definirProfessor(@RequestBody Professor professor) {
        return professorServices.Salvar(professor);
    }

    @GetMapping
    public List<Professor> listarProfessores() {
        return professorServices.listarProfessor();
    }
}







