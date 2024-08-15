package projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projeto.model.Cursos;
import projeto.services.CursosService;
import java.util.List;


@RestController
@RequestMapping("/cursos")
public class CursosController {
    @Autowired
    private CursosService cursoService;

    @PostMapping
    public Cursos criarCurso(@RequestBody Cursos curso) {
        return cursoService.salvarCurso(curso);
    }

    @GetMapping
    public List<Cursos> listarCursos() {
        return cursoService.listarCursos();
    }
}
