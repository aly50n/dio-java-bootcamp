package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados(){
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        if(!convidados.isEmpty()){
            for(Convidado c:convidados){
                if(c.getCodigoConvite() == codigoConvite){
                    convidados.remove(c);
                    break;
                }
            }
        }
    }

    public int contarConvidados(){
        return convidados.size();
    }

    public void exibirConvidados(){
        System.out.println(convidados);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjunto = new ConjuntoConvidados();
        conjunto.adicionarConvidado("Alyson", 1);
        conjunto.adicionarConvidado("zezo", 1);
        conjunto.adicionarConvidado("Ornio", 2);
        conjunto.adicionarConvidado("Otavio", 3);
        conjunto.adicionarConvidado("Rayssa", 3);
        System.out.println("Numero de convidados: "+conjunto.contarConvidados());
        conjunto.exibirConvidados();
        conjunto.removerConvidadoPorCodigoConvite(2);
        System.out.println("Numero de convidados: "+conjunto.contarConvidados());
        conjunto.exibirConvidados();
    }
}
