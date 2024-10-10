package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public ListaTarefa(String descricao){
        this.tarefaList = new ArrayList<>();
        this.tarefaList.add(new Tarefa(descricao));
    }

    public void adicionarTarefas(String descricao){
        this.tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterMeuTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("A quantidade de tarefas é: "+ listaTarefa.obterMeuTotalTarefas());
        
        listaTarefa.adicionarTarefas("tarefa1");
        System.out.println("A quantidade de tarefas é: "+ listaTarefa.obterMeuTotalTarefas());
        
        listaTarefa.adicionarTarefas("tArEfa1");
        listaTarefa.adicionarTarefas("tarefa2");
        System.out.println("A quantidade de tarefas é: "+ listaTarefa.obterMeuTotalTarefas());
    
        System.out.println("A quantidade de tarefas é: "+ listaTarefa.obterMeuTotalTarefas());
        listaTarefa.obterDescricoesTarefas();
        
        ListaTarefa listaTarefa2 = new ListaTarefa("Tarefa1");
        listaTarefa2.obterDescricoesTarefas();
        System.out.println("A quantidade de tarefas é: "+ listaTarefa2.obterMeuTotalTarefas());
    }
}   
