package dio.bootcamp.gof.core.exception;

import jakarta.persistence.EntityNotFoundException;

public class ClienteNotFoundException extends EntityNotFoundException {
    public ClienteNotFoundException() {
        super("O Cliente não foi encontrado!");
    }
    
    public ClienteNotFoundException(String message) {
        super(message);
    }
}
