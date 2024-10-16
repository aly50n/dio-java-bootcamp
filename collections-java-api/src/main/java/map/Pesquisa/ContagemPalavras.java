package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String,Integer> contagemPalavras;

    public ContagemPalavras(){
        this.contagemPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        this.contagemPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        this.contagemPalavras.remove(palavra);
        System.out.println("Palavra "+palavra+" removida!");
    }

    public void exibirContagemPalavras(){
        System.out.println(this.contagemPalavras);
    }

    public Map<String,Integer> encontrarPalavraMaisFrequente(){
        Map<String,Integer> palavraMaisFrequente = new HashMap<>();
        int maiorContagem = 0;
        String palavraMaisFrequenteAux= "";
        if(!contagemPalavras.isEmpty()){
            for(Map.Entry<String, Integer> entry : contagemPalavras.entrySet()){
                if(entry.getValue() > maiorContagem){
                    maiorContagem = entry.getValue();
                    palavraMaisFrequenteAux= entry.getKey();
                }
            }
            palavraMaisFrequente.put(palavraMaisFrequenteAux, maiorContagem);
        }

        return palavraMaisFrequente;
    }


    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Livro", 20);
        contagemPalavras.adicionarPalavra("Noite", 50);
        contagemPalavras.adicionarPalavra("Dia", 30);
        contagemPalavras.adicionarPalavra("Alyson", 1);
        contagemPalavras.adicionarPalavra("Constante", 60);
        contagemPalavras.adicionarPalavra("Saudade", 60);

        contagemPalavras.exibirContagemPalavras();
        contagemPalavras.removerPalavra("Alyson");
        contagemPalavras.exibirContagemPalavras();

        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
        
    }

}
