package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Bootcamp javaspring = new Bootcamp();
        javaspring.setNome("Java com springboot");
        javaspring.setDescricao("Do basico ao avançado utilizando a linguagem Java com Springboot");

        Conteudo mentoria = new Mentoria("Maravilhas do Ecossistema spring","Com profissionais de grandes empresas, uma motivação para o estudo e uso do Java com Springboot", LocalDate.now().plusDays(10));
        Conteudo javabasico = new Curso("Java basico","variaveis, Laços de repetição, condicionais", 20);
        Set<Conteudo> conteudos = new LinkedHashSet<>();
        conteudos.add(mentoria);
        conteudos.add(javabasico);
        javaspring.setConteudos(conteudos);
        System.out.println(javaspring.getConteudos());

        Dev alyson = new Dev();
        alyson.setNome("Alyson Morato");
        alyson.setConteudosInscritos(conteudos);
        alyson.progredir();

        javaspring.adicionarDevsInscritos(alyson);
        System.out.println(javaspring);
        
    }
}
