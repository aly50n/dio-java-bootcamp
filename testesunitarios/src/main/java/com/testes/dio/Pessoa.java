package com.testes.dio;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {

    private String nome;
    private LocalDateTime nascimento;
    private String documento;
    private DadosLocalizacao endereco;

    public Pessoa(final String nome, final String documento, final LocalDateTime nascimento) {
        this.nome = nome;
        this.documento = documento;
        this.nascimento = nascimento;
    }

    public Pessoa(final String nome, final LocalDateTime nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public void adicionaDadosDeEndereco(DadosLocalizacao dadosLocalizacao) {
        this.endereco = dadosLocalizacao;
    }

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(nascimento, LocalDateTime.now());
    }

    public boolean ehMaiorDeIdade(){
        return getIdade() >= 18;
    }

}
