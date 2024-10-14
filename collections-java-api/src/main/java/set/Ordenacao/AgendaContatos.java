package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatos;
    public AgendaContatos(){
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatos.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatos);
    }

    public Set<Contato> pesquisarPorNome(String nome){
            if(!contatos.isEmpty()){
                Set<Contato> contatosPorNome = new HashSet<>();
            for(Contato c: contatos){
                if(c.getNome().startsWith(nome)){
                    contatosPorNome.add(c);
                }
            }
            return contatosPorNome;
        }
        return null;
    }

    public Contato atualizarNumeroContato(int numeroAntigo, int novoNumero){
        if(!contatos.isEmpty()){
            for(Contato c:contatos){
                if(c.getNumero() == numeroAntigo){
                    c.setNumero(novoNumero);
                    return c;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Alyson Morato", 11111);
        agendaContatos.adicionarContato("Eryk Dias", 11111);
        agendaContatos.adicionarContato("Alyson Morato", 11222);
        agendaContatos.adicionarContato("Alyson Alves", 32161);
        agendaContatos.adicionarContato("Alice Alves", 32551);
        agendaContatos.adicionarContato("Erivan Silva", 32331);
        agendaContatos.adicionarContato("Roberto Sales", 32211);
        agendaContatos.adicionarContato("Roberto Alves", 22311);
        agendaContatos.adicionarContato("Roberto Silva", 12411);
        
        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Alyson"));
        System.out.println(agendaContatos.pesquisarPorNome("Roberto"));
        System.out.println(agendaContatos.atualizarNumeroContato(11111,33333));
        agendaContatos.exibirContatos();



    }
}
