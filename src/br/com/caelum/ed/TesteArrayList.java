package br.com.caelum.ed;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno.setNomeDoAluno("joão");
        aluno1.setNomeDoAluno("josé");
        aluno2.setNomeDoAluno("pedro");

        List<Aluno> vetor = new ArrayList<>();
        vetor.add(aluno);
        vetor.add(aluno1);
        vetor.add(0, aluno2);

        int tamanho = vetor.size();
        if (tamanho != 3) {
            System.out.println("Erro: O tamanho da lista está errado.");
        }
        if (!vetor.contains(aluno1)) {
            System.out.println("Erro: Não achou um aluno que deveria estar na lista");
        }
        vetor.remove(0);
        tamanho = vetor.size();
        if (tamanho != 2) {
            System.out.println("Erro: O tamanho da lista está errado.");
        }
        if (vetor.contains(aluno2)) {
            System.out.println("Erro: Achou um aluno que não deveria estar na lista");
        }
    }
}