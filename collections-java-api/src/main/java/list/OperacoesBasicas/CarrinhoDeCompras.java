package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> listaItens;

    public CarrinhoDeCompras(){
        this.listaItens = new ArrayList<>();
    }

    public CarrinhoDeCompras(Item item){
        this.listaItens = new ArrayList<>();
        listaItens.add(item);
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        this.listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> listaItensParaRemover = new ArrayList<>();
        for(Item i : listaItens){
            if(i.getNome().equalsIgnoreCase(nome)){
                listaItensParaRemover.add(i);
            }
        }
        this.listaItens.removeAll(listaItensParaRemover);
    }

    public double calcularValorTotal(){
        int totalCarrinho = 0;
        for(Item i:listaItens){
            totalCarrinho+= (i.getPreco()*i.getQuantidade());
        }
        return totalCarrinho;
    }

    public void exibirItens(){
        System.out.println(listaItens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.exibirItens();
        carrinho.adicionarItem("Carne", 20, 2);
        carrinho.exibirItens();
        carrinho.adicionarItem("Iorgute", 5, 1);
        carrinho.adicionarItem("IorguTe", 5, 1);
        carrinho.exibirItens();
        System.out.println("Valor total do carrinho: "+ carrinho.calcularValorTotal());
        carrinho.removerItem("iorgute");
        carrinho.exibirItens();
        System.out.println("Valor total do carrinho: "+ carrinho.calcularValorTotal());

    }
}
