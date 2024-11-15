package dio.bootcamp.gof.Api.cliente.mapper;

import dio.bootcamp.gof.core.model.Cliente;
import org.springframework.stereotype.Component;

import dio.bootcamp.gof.Api.cliente.dto.ClienteRequest;
import dio.bootcamp.gof.Api.cliente.dto.ClienteResponse;

@Component
public class ClienteMapper {
    public ClienteResponse toResponse(Cliente cliente) {
        return ClienteResponse.builder()
                            .id(cliente.getId())
                            .nome(cliente.getNome())
                            .endereco(cliente.getEndereco())
                            .build();
    }

    public Cliente toModel(ClienteRequest clienteRequest){
        return Cliente.builder()
                    .nome(clienteRequest.getNome())
                    .endereco(clienteRequest.getEndereco())
                    .build();
    }
}
