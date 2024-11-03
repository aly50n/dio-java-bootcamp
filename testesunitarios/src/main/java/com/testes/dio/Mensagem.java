package com.testes.dio;

import java.util.UUID;

import lombok.Getter;

@Getter
public class Mensagem {

    private String id;

    private String mensagem;

    public Mensagem(final String mensagem) {
        this.id = UUID.randomUUID().toString();
        this.mensagem = mensagem;
    }

}
