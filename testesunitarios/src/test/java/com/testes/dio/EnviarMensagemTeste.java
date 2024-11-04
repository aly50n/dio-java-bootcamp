package com.testes.dio;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

@ExtendWith(MockitoExtension.class)
public class EnviarMensagemTeste {
    
    @Spy
    private EnviarMensagem enviarMensagem;

    @Test
    void verificarComportamentoDaClasse(){
        
        Mockito.verifyNoInteractions(enviarMensagem);
        Mensagem mensagem = new Mensagem("Olá mundo!");
        enviarMensagem.adicionarMensagem(mensagem);
        Mockito.verify(enviarMensagem).adicionarMensagem(mensagem);
        
        assertFalse(enviarMensagem.getMensagens().isEmpty());

    }
}
