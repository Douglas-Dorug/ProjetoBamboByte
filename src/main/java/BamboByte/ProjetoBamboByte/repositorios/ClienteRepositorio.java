package BamboByte.ProjetoBamboByte.repositorios;

import BamboByte.ProjetoBamboByte.entidades.Cliente;
import BamboByte.ProjetoBamboByte.entidades.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {

    List<Empresa> findByCostumer(Cliente cliente);

}
