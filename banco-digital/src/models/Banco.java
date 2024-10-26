package models;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta pesquisarContaClientePorCpf(String Cpf) {

        return contas.stream()
                .filter(x -> Cpf.equalsIgnoreCase(x.getCliente().getCpf()))
                .findFirst()
                .orElse(null);
    
    }

    public Conta pesquisarContaPorNumeroConta(int numeroConta) {

        return contas.stream()
                .filter(x -> numeroConta == x.getNumeroConta())
                .findFirst()
                .orElse(null);
    
    }

    public void removerConta(int numeroConta){
        Conta contaParaRemover = contas.stream().filter(x -> numeroConta == x.getNumeroConta()).findFirst().orElse(null);
        if(contaParaRemover != null){
            System.out.println("Conta removida: "+ contaParaRemover);
            contas.remove(contaParaRemover);
        }
        else{
            System.out.println("Conta não encontrada!");
        }
    }

    public void listarContas(){
        contas.stream().forEach(System.out::println);
    }

}
