package dio.bootcamp.gof.core.repository;

import dio.bootcamp.gof.core.exception.ClienteNotFoundException;
import dio.bootcamp.gof.core.model.Cliente;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente,Long> {
    
    default Cliente findByIdOrElseThrow(Long id){   
        return findById(id).orElseThrow(ClienteNotFoundException::new);  
    }
    
}
