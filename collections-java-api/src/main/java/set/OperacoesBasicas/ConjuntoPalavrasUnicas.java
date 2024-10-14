package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    
    private Set<String> conjuntoPalavras;
    
    public ConjuntoPalavrasUnicas(){
        this.conjuntoPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        if(!this.verificarPalavra(palavra)){
            this.conjuntoPalavras.add(palavra.toLowerCase());
        }
       
    }

    public void removerPalavra(String palavra){
        this.conjuntoPalavras.remove(palavra.toLowerCase());
    }

    public boolean verificarPalavra(String palavra){
        return conjuntoPalavras.contains(palavra.toLowerCase());
    }

    public void exibirPalavrasUnicas(){
        System.out.println(conjuntoPalavras);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("Inverno");
        conjuntoPalavrasUnicas.adicionarPalavra("Inverno");
        conjuntoPalavrasUnicas.adicionarPalavra("Verão");
        conjuntoPalavrasUnicas.adicionarPalavra("Primavera");
        conjuntoPalavrasUnicas.adicionarPalavra("Outono");
        conjuntoPalavrasUnicas.adicionarPalavra("Sol");
        conjuntoPalavrasUnicas.adicionarPalavra("Inverno");
        conjuntoPalavrasUnicas.adicionarPalavra("Sol"); 
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.removerPalavra("Sol");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Verão"));
        conjuntoPalavrasUnicas.removerPalavra("outono");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
