package projeto.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter@Setter
@Entity
public class Estudante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 50 , nullable = false)
    private String nome;
    @Column(length = 100 , nullable = false)
    private String email;

    @ManyToMany
    private List<Cursos> cursos;
}
