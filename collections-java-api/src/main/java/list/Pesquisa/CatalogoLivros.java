package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros;

    public CatalogoLivros(){
        this.livros = new ArrayList<>();
    }

    public CatalogoLivros(Livro livro){
        this.livros = new ArrayList<>();
        this.livros.add(livro);
    }
    
    public CatalogoLivros(List<Livro> livros){
        this.livros = new ArrayList<>();
        this.livros= livros;
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        this.livros.add(new Livro(titulo,autor,anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        for(Livro l : livros){
            if(l.getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.add(l);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        if(anoInicial>anoFinal){
            int auxiliar = anoInicial;
            anoInicial=anoFinal;
            anoFinal=auxiliar;
        }
        
        List<Livro> livrosDoIntervalo = new ArrayList<>();
        for(Livro l : livros){
            if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao()<= anoFinal){
                livrosDoIntervalo.add(l);
            }
        }
        return livrosDoIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        for (Livro l : livros) {
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                return l;
            }
        }
        return null;
    }



}
