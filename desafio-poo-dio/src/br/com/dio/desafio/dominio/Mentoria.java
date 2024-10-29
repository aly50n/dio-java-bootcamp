package br.com.dio.desafio.dominio;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Mentoria {
    String titulo;
    String descricao;
    LocalDate data;
}
