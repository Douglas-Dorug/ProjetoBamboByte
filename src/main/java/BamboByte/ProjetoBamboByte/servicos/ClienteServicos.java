package BamboByte.ProjetoBamboByte.servicos;

import BamboByte.ProjetoBamboByte.dtos.MessageResponseDTO;
import BamboByte.ProjetoBamboByte.dtos.pedidos.ClientePedidoDTO;
import BamboByte.ProjetoBamboByte.entidades.Cliente;
import BamboByte.ProjetoBamboByte.repositorios.ClienteRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ClienteServicos {

    private ClienteRepositorio clienteRepositorio;

    public MessageResponseDTO salvarCliente(ClientePedidoDTO clientePedidoDTO){

        Cliente novoCliente = new Cliente();
        novoCliente.setCpf(clientePedidoDTO.getCpf());
        novoCliente.setEmail(clientePedidoDTO.getEmail());
        novoCliente.setSenha(clientePedidoDTO.getSenha());
        novoCliente.setNomeCompleto(clientePedidoDTO.getNomeCompleto());
        novoCliente.setNomeUsuario(clientePedidoDTO.getNomeUsuario());
        novoCliente.setNumContato(clientePedidoDTO.getNumContato());

        clienteRepositorio.save(novoCliente);

        return criarMenssagemResposta(novoCliente.getId(),"Created costumer with ID ");
    }

    private MessageResponseDTO criarMenssagemResposta(Long id, String mensagem) {
        return MessageResponseDTO
                .builder()
                .mensagem(mensagem + id)
                .build();
    }
}
