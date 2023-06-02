package wecare.care.Modal;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import wecare.care.DTO.Dados;

@Table(name="Pessoa")
@Entity(name="Pessoa")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pessoa {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String nome;
    @Column(nullable = false, length = 100)
    private String cpf;
    @Column(nullable = false, length = 100)
    private String idade;


    public Pessoa(Dados pas) {

        this.nome = pas.nome();
        this.cpf = pas.cpf();
        this.idade = pas.idade();


    }

}
