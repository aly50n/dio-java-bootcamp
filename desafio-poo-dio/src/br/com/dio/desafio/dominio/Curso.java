package br.com.dio.desafio.dominio;

import lombok.Data;

@Data
public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;
}
