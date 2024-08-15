package projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import projeto.model.Estudante;
import projeto.services.EstudanteService;
import java.util.List;


@RestController
@RequestMapping("/estudante")
public class EstudanteController {

    private final EstudanteService estudanteService;

    @Autowired
    public EstudanteController(EstudanteService estudanteService) {
        this.estudanteService = estudanteService;
    }

    @PostMapping
    public Estudante criarEstudante(@RequestBody Estudante estudante) {
        return estudanteService.salvar(estudante);
    }

    @GetMapping
    public List<Estudante> listarEstudantes() {
        return estudanteService.listarEstudantes();
    }

}
