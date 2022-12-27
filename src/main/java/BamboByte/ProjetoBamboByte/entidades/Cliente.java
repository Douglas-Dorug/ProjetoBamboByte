package BamboByte.ProjetoBamboByte.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Data
@Builder
@Table(name = "clientes")
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Size(min = 2,max = 20)
    @Column(nullable = false)
    private String nomeUsuario;

    @NotEmpty
    @Size(min = 2,max = 100)
    @Column(nullable = false)
    private String nomeCompleto;

    @NotEmpty
    @CPF
    @Column(nullable = false, unique = true)
    private String cpf;

    @Email
    @Column(unique = true)
    private String email;

    @Size(min = 5,max = 20)
    @Column(nullable = false)
    private String senha;

    @NotEmpty
    @Size(min = 9,max = 13 )
    @Column
    private String numContato;

    @OneToMany
    @JoinColumn(name = "fk_empresas_id", nullable = false)
    private Empresa empresa;
}
