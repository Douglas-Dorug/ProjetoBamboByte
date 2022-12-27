package BamboByte.ProjetoBamboByte.dtos.pedidos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientePedidoDTO {

    private Long id;

    private String nomeUsuario;

    private String nomeCompleto;

    private String cpf;

    private String email;

    private String senha;

    private String numContato;
}
