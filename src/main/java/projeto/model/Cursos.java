package projeto.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Cursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 50, nullable = false)
    private String nome;

    @ManyToMany(mappedBy = "cursos")
    private List<Estudante> estudantes;
    @ManyToMany(mappedBy = "cursos")
    private List<Professor> professores;
}
