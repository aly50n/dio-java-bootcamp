package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto 1", 40d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 2", 30d, 10);
        cadastroProdutos.adicionarProduto(4L, "Produto 3", 15d, 3);
        cadastroProdutos.adicionarProduto(9L, "Produto 4", 25d, 2);

        System.out.println("\nProdutosSet: "+cadastroProdutos.produtoSet);
        System.out.println("\nProdutos por nome: "+cadastroProdutos.exibirProdutosPorNome());
        System.out.println("\nProdutos por preco: "+cadastroProdutos.exibirProdutosPorPreco());



    }
}
