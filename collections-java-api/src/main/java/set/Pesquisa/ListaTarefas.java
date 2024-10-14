package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    
    private Set<Tarefa> conjuntoTarefas;
    
    public ListaTarefas(){
        this.conjuntoTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        conjuntoTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        if(!conjuntoTarefas.isEmpty()){
            for(Tarefa t:conjuntoTarefas){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    conjuntoTarefas.remove(t);
                    break;
                }
            }
        }
    }

    public void exibirTarefas(){
        System.out.println(conjuntoTarefas);
    }

    public int contarTarefas(){
        return conjuntoTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        if(!conjuntoTarefas.isEmpty()){
            Set<Tarefa> tarefasConcluidas = new HashSet<>();
            for(Tarefa t:conjuntoTarefas){
                if(t.isConcluida()){
                    tarefasConcluidas.add(t);
                }
            }
            return tarefasConcluidas;
        }  
        return null;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        if(!conjuntoTarefas.isEmpty()){
            Set<Tarefa> tarefasPendentes = new HashSet<>();
            for(Tarefa t:conjuntoTarefas){
                if(!t.isConcluida()){
                    tarefasPendentes.add(t);
                }
            }
            return tarefasPendentes;
        }  
        return null;
    }

    public void marcarTarefaConcluida(String descricao){
        if(!conjuntoTarefas.isEmpty()){
            for(Tarefa t:conjuntoTarefas){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluida(true);
                }
            }
        }  
    }

    public void marcarTarefaPendente(String descricao){
        if(!conjuntoTarefas.isEmpty()){
            for(Tarefa t:conjuntoTarefas){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluida(false);
                }
            }
        }  
    }

    public void limparListaTarefas(){
        conjuntoTarefas.removeAll(conjuntoTarefas);
        System.out.println("Lista de tarefas esvaziada!");
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Academia");
        listaTarefas.adicionarTarefa("Correr");
        listaTarefas.adicionarTarefa("Estudar");
        listaTarefas.adicionarTarefa("Cozinhar");
        listaTarefas.adicionarTarefa("Assistir");
        listaTarefas.adicionarTarefa("Estudar");
        listaTarefas.adicionarTarefa("Tocar violão");
       
        listaTarefas.exibirTarefas();
        listaTarefas.marcarTarefaConcluida("Academia");
        listaTarefas.marcarTarefaConcluida("Estudar");
        listaTarefas.marcarTarefaConcluida("Cozinhar");
        System.out.println("Tarefas Concluidas: \n"+listaTarefas.obterTarefasConcluidas());
        System.out.println("\nTarefas Pendentes: \n"+listaTarefas.obterTarefasPendentes());
        listaTarefas.marcarTarefaPendente("Cozinhar");
        System.out.println("\nTarefas Concluidas: \n"+listaTarefas.obterTarefasConcluidas());
        System.out.println("\nTarefas Pendentes: \n"+listaTarefas.obterTarefasPendentes());
        listaTarefas.limparListaTarefas();
        

    }
}
