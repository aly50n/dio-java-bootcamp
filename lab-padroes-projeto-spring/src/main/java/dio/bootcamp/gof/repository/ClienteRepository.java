package dio.bootcamp.gof.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dio.bootcamp.gof.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository <Cliente,Long> {
    
}
