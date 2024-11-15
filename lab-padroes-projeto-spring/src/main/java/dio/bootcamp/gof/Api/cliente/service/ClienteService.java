package dio.bootcamp.gof.Api.cliente.service;

import java.util.List;

import dio.bootcamp.gof.Api.cliente.dto.ClienteRequest;
import dio.bootcamp.gof.Api.cliente.dto.ClienteResponse;
import dio.bootcamp.gof.core.model.Cliente;

/** 
 * Interface que define o padrão <b>Strategy</b> no dominio de cliente. 
 * Com isso, se necessário, podemos ter multiplas implementações dessa 
 * mesma interface.
 * @author aly50n
*/

public interface ClienteService {

    List<ClienteResponse> buscarTodos();
    
    Cliente buscarPorId(Long id);
    
    void inserir(ClienteRequest cliente);
    
    void atualizar(Long id, ClienteRequest clienteRequest);

    void deletar(Long id);

}
