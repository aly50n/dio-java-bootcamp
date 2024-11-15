package dio.bootcamp.gof.core.repository;

import org.springframework.data.repository.CrudRepository;

import dio.bootcamp.gof.core.model.Endereco;

public interface EnderecoRepository extends CrudRepository<Endereco,String> {
    
}
