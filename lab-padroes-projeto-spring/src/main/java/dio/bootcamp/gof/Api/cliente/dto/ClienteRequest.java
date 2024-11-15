package dio.bootcamp.gof.Api.cliente.dto;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.validation.constraints.Size;
import dio.bootcamp.gof.core.model.Endereco;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotEmpty;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteRequest {
    
    @NotNull
    @NotEmpty
    @Size(min = 3, max = 255)
    private String nome;

    @NotNull
    private Endereco endereco;
}
