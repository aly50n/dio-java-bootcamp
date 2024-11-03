package com.testes.dio;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTeste {

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa jaciara = new Pessoa("Jaciara", LocalDateTime.of(2000, 04, 20, 15, 0, 0));
        Assertions.assertEquals(24, jaciara.getIdade());
    }

    @Test
    void validaVerificacaoDeMaioridade() {

        Pessoa jaciara = new Pessoa("Jaciara", LocalDateTime.of(2000, 04, 20, 15, 0, 0));
        Assertions.assertTrue(jaciara.ehMaiorDeIdade());

        Pessoa joacir = new Pessoa("Joacir", LocalDateTime.now());
        Assertions.assertFalse(joacir.ehMaiorDeIdade());

    }
}
