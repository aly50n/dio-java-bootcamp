package main.java.map.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LivariaOnline {
    private Map<String, Livro> acervoOnline;

    public LivariaOnline() {
        this.acervoOnline = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        acervoOnline.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        if (!acervoOnline.isEmpty()) {
            for (Map.Entry<String, Livro> entry : acervoOnline.entrySet()) {
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                    acervoOnline.remove(entry.getKey());
                    System.out.println("Livro titulo: " + entry.getValue() + " removido!");
                    return;
                }
            }
        } else {
            System.out.println("O acervo está vazio!");
        }
    }

    public void exibirLivrosOrdenadosPorPreco() {
        if (!acervoOnline.isEmpty()) {
            List<Livro> livrosOrdenadosPorPreco = new ArrayList<>(acervoOnline.values());
            Collections.sort(livrosOrdenadosPorPreco);
            System.out.println(livrosOrdenadosPorPreco);
        } else {
            System.out.println("O acervo está vazio!");
        }
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livrosPorAutor = null;
        if (!acervoOnline.isEmpty()) {
            livrosPorAutor = new TreeMap<>();
            for (Map.Entry<String, Livro> entry : acervoOnline.entrySet()) {
                if (entry.getValue().getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return livrosPorAutor;
    }

    public Livro obterLivroMaisCaro() {
        Livro livroMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!acervoOnline.isEmpty()) {
            for (Map.Entry<String, Livro> entry : acervoOnline.entrySet()) {
                if (entry.getValue().getPreco() > maiorPreco) {
                    livroMaisCaro = entry.getValue();
                    maiorPreco = livroMaisCaro.getPreco();
                }
            }
        }
        return livroMaisCaro;
    }

    public Livro exibirLivroMaisBarato() {
        Livro livroMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!acervoOnline.isEmpty()) {
            for (Map.Entry<String, Livro> entry : acervoOnline.entrySet()) {
                if (entry.getValue().getPreco() < menorPreco) {
                    livroMaisBarato = entry.getValue();
                    menorPreco = livroMaisBarato.getPreco();
                }
            }
        }
        return livroMaisBarato;
    }

    public static void main(String[] args) {
        LivariaOnline livraria = new LivariaOnline();

        // Adicionando livros
        livraria.adicionarLivro("link1", "Java para Iniciantes", "John Doe", 49.90d);
        livraria.adicionarLivro("link2", "Estruturas de Dados", "Jane Smith", 79.90d);
        livraria.adicionarLivro("link3", "Design Patterns", "Robert C. Martin", 99.90d);
        livraria.adicionarLivro("link4", "Clean Code", "Robert C. Martin", 89.90d);
        livraria.adicionarLivro("link5", "Introdução à POO", "John Doe", 39.90d);

        // Exibindo todos os livros adicionados
        System.out.println("Livros disponíveis:");
        livraria.exibirLivrosOrdenadosPorPreco();

        // Removendo um livro
        System.out.println("\nRemovendo o livro 'Estruturas de Dados':");
        livraria.removerLivro("Estruturas de Dados");

        // Exibindo novamente os livros após a remoção
        System.out.println("\nLivros após remoção:");
        livraria.exibirLivrosOrdenadosPorPreco();

        // Pesquisando por autor
        System.out.println("\nLivros do autor Robert C. Martin: "+livraria.pesquisarLivrosPorAutor("Robert C. Martin"));

        // Obtendo livro mais caro.
        System.out.println("\nO livro mais caro é: " + livraria.obterLivroMaisCaro());

        // Obtendo livro mais barato.
        System.out.println("\nO livro mais barato é: " + livraria.exibirLivroMaisBarato());

    }
}
