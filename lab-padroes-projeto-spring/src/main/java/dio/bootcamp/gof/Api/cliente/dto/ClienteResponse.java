package dio.bootcamp.gof.Api.cliente.dto;

import dio.bootcamp.gof.core.model.Endereco;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteResponse {
    private Long id;
    private String nome;
    private Endereco endereco;
}
