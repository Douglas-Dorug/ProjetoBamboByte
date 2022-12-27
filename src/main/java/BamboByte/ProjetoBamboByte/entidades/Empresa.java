package BamboByte.ProjetoBamboByte.entidades;

import BamboByte.ProjetoBamboByte.enums.TipoEmpresa;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.validator.constraints.br.CNPJ;

@Entity
@Data
@Builder
@Table(name = "empresas")
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Size(min = 2,max = 100)
    @Column(nullable = false)
    private String nomeEmpresa;

    @NotEmpty
    @CNPJ
    @Column(nullable = false, unique = true)
    private String cnpj;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoEmpresa tipo;

    @Email
    @Column(unique = false)
    private String email;

    @NotEmpty
    @Size(min = 4, max = 100)
    @Column
    private String rua;

    @NotEmpty
    @Size(min = 4, max = 50)
    @Column
    private String bairro;

    @NotEmpty
    @Size( max = 10)
    @Column
    private String numeroCasa;

    @Size(max = 100)
    @Column
    private String referencia;

    @NotEmpty
    @Size(min = 9,max = 13 )
    @Column
    private String numContato;

    @ManyToOne
    @JoinColumn(name = "fk_clientes_id", nullable = false)
    private Cliente cliente;
}
