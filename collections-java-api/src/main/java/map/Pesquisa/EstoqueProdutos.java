package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos(){
        this.estoqueProdutosMap= new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        this.estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p:estoqueProdutosMap.values()){
                valorTotalEstoque+= p.getPreco()*p.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }


    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p: estoqueProdutosMap.values()){
                if(p.getPreco() > maiorPreco){
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p: estoqueProdutosMap.values()){
                if(p.getPreco() < menorPreco){
                    menorPreco=p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidadeValorTotal = null;
        double maiorQuantidadeValorTotal = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p: estoqueProdutosMap.values()){
                if((p.getPreco()*p.getQuantidade()) > maiorQuantidadeValorTotal){
                    maiorQuantidadeValorTotal = p.getPreco()*p.getQuantidade();
                    produtoMaiorQuantidadeValorTotal = p;
                }
            }
        }
        return produtoMaiorQuantidadeValorTotal;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1, "Shampoo", 12, 30);
        estoqueProdutos.adicionarProduto(2, "Sabonete", 5, 10);
        estoqueProdutos.adicionarProduto(3, "Arroz", 4, 20);
        estoqueProdutos.adicionarProduto(4, "Pitu", 7, 30);
        estoqueProdutos.adicionarProduto(5, "Iorgute", 3, 50);
        estoqueProdutos.adicionarProduto(5, "Carne de boi", 32, 10);

        estoqueProdutos.exibirProdutos();

        System.out.println("O valor total em estoque de produtos é: "+estoqueProdutos.calcularValorTotalEstoque());

        System.out.println("O produto mais caro é: "+estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("O produto mais barato é: "+estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("O produto com mais valor no estoque devido a quantidade é: "+estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    }
}
