package BamboByte.ProjetoBamboByte.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoEmpresa {

    VENDAS("Vendas"),
    SERVICOS("Servicos"),
    OUTROS("Outros");


    private final String description;
}
