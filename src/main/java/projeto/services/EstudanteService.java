package projeto.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.model.Estudante;
import projeto.repository.EstudanteRepository;

import java.util.List;

@Service
public class EstudanteService {
    @Autowired
    private EstudanteRepository estudanteRepository;

    public Estudante salvar(Estudante estudante) {
        System.out.println("Salvando estudante: " + estudante.getNome());
        return estudanteRepository.save(estudante);
    }

    public List<Estudante> listarEstudantes() {
        return estudanteRepository.findAll();
    }


}
