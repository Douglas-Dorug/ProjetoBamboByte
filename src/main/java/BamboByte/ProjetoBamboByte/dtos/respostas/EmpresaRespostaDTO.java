package BamboByte.ProjetoBamboByte.dtos.respostas;

import BamboByte.ProjetoBamboByte.entidades.Cliente;
import BamboByte.ProjetoBamboByte.enums.TipoEmpresa;

public class EmpresaRespostaDTO {

    private String nomeEmpresa;

    private TipoEmpresa tipo;

    private String email;

    private String rua;

    private String bairro;

    private String numeroCasa;

    private String referencia;

    private String numContato;

    private Cliente cliente;
}
