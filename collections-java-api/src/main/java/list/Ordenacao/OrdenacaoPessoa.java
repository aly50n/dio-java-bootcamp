package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa(){
        pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        this.pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public List<Pessoa> getListaPessoas(){
        return pessoaList;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa listPessoas = new OrdenacaoPessoa();

        listPessoas.adicionarPessoa("Alyson", 24, 1.63);
        listPessoas.adicionarPessoa("Vitoria", 20, 1.55);
        listPessoas.adicionarPessoa("Aline", 11, 1.43);
        listPessoas.adicionarPessoa("Naiane", 7, 0.90);
        listPessoas.adicionarPessoa("Aleff", 21, 1.80);
        System.out.println("Lista pessoas: "+listPessoas.getListaPessoas());
        
        System.out.println("\nLista pessoas por altura: "+listPessoas.ordenarPorAltura());
        
        System.out.println("\nLista pessoas por idade: "+listPessoas.ordenarPorIdade());
    }



}
