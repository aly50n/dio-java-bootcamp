package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario (){
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        this.dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        this.dicionario.remove(palavra);
    }

    public void exibirPalavras(){
        System.out.println(this.dicionario);
    }

    public String pesquisarPorPalavra(String palavra){
        return this.dicionario.get(palavra);
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Java", "Uma linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("Python", "Uma linguagem de programação de alto nível, famosa por sua simplicidade.");
        dicionario.adicionarPalavra("Algoritmo", "Uma sequência de instruções para resolver um problema.");
        dicionario.adicionarPalavra("Compilador", "Um programa que traduz código de uma linguagem de programação para linguagem de máquina.");
        dicionario.adicionarPalavra("Framework", "Uma estrutura reutilizável de código usada para facilitar o desenvolvimento de software.");
        dicionario.adicionarPalavra("Banco de Dados", "Um sistema para armazenar e organizar dados.");
        
        System.out.println("===============Exibindo Palavras================");
        dicionario.exibirPalavras();
        System.out.println("================================================");
        
        System.out.println("\n===========Removendo compilador===============");
        dicionario.removerPalavra("Compilador");
        dicionario.exibirPalavras();
       
        System.out.println("\n===========Pesquisa por Python=================");
        System.out.println(dicionario.pesquisarPorPalavra("Python"));
        System.out.println("===============================================");
    }
}
