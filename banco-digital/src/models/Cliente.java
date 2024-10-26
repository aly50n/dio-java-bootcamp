package models;
import java.time.LocalDate;

import lombok.Data;

@Data
public class Cliente {

    private String nome;
    private String cpf;
    private LocalDate dataNascimento;

}
