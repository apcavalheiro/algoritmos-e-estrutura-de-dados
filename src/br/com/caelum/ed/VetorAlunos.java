package br.com.caelum.ed;

import java.util.Arrays;

public class VetorAlunos {

    private Aluno[] alunos = new Aluno[2];

    public void adicionarAluno(Aluno aluno) {
        for (int i = 0; i < this.alunos.length; i++) {
            if (this.alunos[i] == null) {
                this.alunos[i] = aluno;
                break;
            }
        }
    }

    public void adicionarAluno(int posicao, Aluno aluno) {

    }

    public Aluno pegarAlunoDaPosicao(int posicao) {
        return null;
    }

    public void removerAluno() {

    }

    public Boolean contemAluno(Aluno aluno) {
        return null;
    }

    public int quantidadeDeAlunos() {
        return 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(alunos);
    }
}
