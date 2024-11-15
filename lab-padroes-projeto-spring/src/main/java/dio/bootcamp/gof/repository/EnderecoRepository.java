package dio.bootcamp.gof.repository;

import org.springframework.data.repository.CrudRepository;

import dio.bootcamp.gof.model.Endereco;

public interface EnderecoRepository extends CrudRepository<Endereco,String> {
    
}
