package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import lombok.Data;

@Data
public class Bootcamp {
    
    private String nome;
    private String descricao;
    private LocalDate dataInicial = LocalDate.now();
    private LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public void adicionarConteudo(Conteudo conteudo){
        this.conteudos.add(conteudo);
    }

    public void adicionarDevsInscritos(Dev dev){
        this.devsInscritos.add(dev);
    }

}
