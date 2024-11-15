package dio.bootcamp.gof.service;

import dio.bootcamp.gof.model.Cliente;

/** 
 * Interface que define o padrão <b>Strategy</b> no dominio de cliente. 
 * Com isso, se necessário, podemos ter multiplas implementações dessa 
 * mesma interface.
 * @author aly50n
*/

public interface ClienteService {

    Iterable<Cliente> buscarTodos();
    
    Cliente buscarPorId(Long id);
    
    void inserir(Cliente cliente);
    
    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
