package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media) {
        alunosSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        if (!alunosSet.isEmpty()) {
            for (Aluno a : alunosSet) {
                if (a.getMatricula() == matricula) {
                    System.out
                            .println("O aluno: " + a.getNome() + ", matricula: " + a.getMatricula() + " foi removido!");
                    alunosSet.remove(a);
                }
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunosSet);
        return alunosPorNota;
    }

    public Set<Aluno> exibirAlunos() {
        return this.alunosSet;
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Alyson Morato", 1L, 10d);
        gerenciadorAlunos.adicionarAluno("Larissa Silva", 2L, 8d);
        gerenciadorAlunos.adicionarAluno("Alyson Jose", 3L, 10d);
        gerenciadorAlunos.adicionarAluno("Alyson Morato", 8L, 10d);
        gerenciadorAlunos.adicionarAluno("Barbara Lustosa", 4L, 7d);
        //System.out.println(gerenciadorAlunos.exibirAlunos());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        //System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }

}
