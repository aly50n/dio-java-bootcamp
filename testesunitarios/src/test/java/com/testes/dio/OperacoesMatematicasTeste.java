package com.testes.dio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OperacoesMatematicasTeste {
    
    private OperacoesMatematicas operacoes;
    private int a;
    private int b;

    @BeforeEach
    void setUp(){
        operacoes = new OperacoesMatematicas();
        a = 6;
        b = 2;
    }

    @Test
    void validarSoma(){
        Assertions.assertEquals(8, operacoes.somar(a,b));
    }

    @Test
    void validarMultiplicacao(){
        Assertions.assertEquals(12, operacoes.multiplicacao(a, b));
    }
    
    @Test
    void validarSubtracao(){
        Assertions.assertEquals(4, operacoes.subtracao(a, b));
    }

    @Test
    void validarDivisao(){
        Assertions.assertEquals(3, operacoes.divisao(a, b));
    }

}
