package projeto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import java.util.List;


@Entity
@Data
public class Professor {
    @Id
    private int id;
    @Column(length = 50 , nullable = false)
    private String nome;
    @Column(length = 100 , nullable = false)
    private String email;

    @ManyToMany
    private List<Cursos> cursos;
}

