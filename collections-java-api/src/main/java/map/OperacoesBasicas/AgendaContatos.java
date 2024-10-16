package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }

    }

    public void exibirContatos(){
        System.out.println(this.agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        if(!agendaContatoMap.isEmpty()){
            return this.agendaContatoMap.get(nome);
        }
        return null;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Alyson", 87988552);
        agendaContatos.adicionarContato("Heron", 1111222);
        agendaContatos.exibirContatos();
        agendaContatos.adicionarContato("Leticia", 222222);
        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Heron");
        agendaContatos.exibirContatos();
        System.out.println("Pesquisando por Alyson => Contato: "+agendaContatos.pesquisarPorNome("Alyson"));
    }

}
