package BamboByte.ProjetoBamboByte.dtos.pedidos;

import BamboByte.ProjetoBamboByte.enums.TipoEmpresa;

public class EmpresaPedidoDTO {

    private Long id;

    private String nomeEmpresa;

    private String cnpj;

    private TipoEmpresa tipo;

    private String email;

    private String rua;

    private String bairro;

    private String numeroCasa;

    private String referencia;

    private String numContato;

    private Long idCliente;
}
