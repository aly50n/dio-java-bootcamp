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
        if(!livros.isEmpty()){
            for(Livro l : livros){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosDoIntervalo = new ArrayList<>();
        if(!livros.isEmpty()){
            if(anoInicial>anoFinal){
                int auxiliar = anoInicial;
                anoInicial=anoFinal;
                anoFinal=auxiliar;
            }
            for(Livro l : livros){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao()<= anoFinal){
                    livrosDoIntervalo.add(l);
                }
            }
        }
        return livrosDoIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        if(!livros.isEmpty()){
            for (Livro l : livros) {
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    return l;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CatalogoLivros livros = new CatalogoLivros();
        //testando lista vazia
        System.out.println(livros.pesquisarPorAutor("J.K. ROWLING"));
        System.out.println(livros.pesquisarPorIntervaloAnos(1997, 2008));
        System.out.println(livros.pesquisarPorTitulo("Harry potter e a pedra filosofal"));
        
        //adicionando livros
        livros.adicionarLivro("Harry potter e a pedra filosofal", "J.K. Rowling", 1997);
        livros.adicionarLivro("Clean Code", "Robert C. Martin", 2008);
        livros.adicionarLivro("Effective Java", "Joshua Bloch", 2001);
        livros.adicionarLivro("The Pragmatic Programmer", "Andrew Hunt, David Thomas", 1999);
        livros.adicionarLivro("Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", 1994);
        livros.adicionarLivro("Code Complete", "Steve McConnell", 1993);
        livros.adicionarLivro("Refactoring: Improving the Design of Existing Code", "Martin Fowler", 1999);

        //testando pesquisas
        System.out.println(livros.pesquisarPorAutor("J.K. ROWLING"));
        System.out.println(livros.pesquisarPorIntervaloAnos(1997, 2000));
        System.out.println(livros.pesquisarPorTitulo("Harry potter e a pedra filosofal"));
    }



}
