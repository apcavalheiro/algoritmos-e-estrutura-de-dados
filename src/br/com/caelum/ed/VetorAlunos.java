package br.com.caelum.ed;

public class VetorAlunos {

    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

    /*public void adicionarAluno(Aluno aluno) {
        for (int i = 0; i < this.alunos.length; i++) {
            if (this.alunos[i] == null) {
                this.alunos[i] = aluno;
                break;
            }versao 1
        }
    }*/

    public void adicionarAluno(Aluno aluno) {
        this.garantaEspaco();
        this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++; //versao 2 melhorado
    }

    public void adicionarAluno(int posicao, Aluno aluno) {
        this.garantaEspaco();
        if (!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = this.totalDeAlunos - 1; i >= posicao; i -= 1) {
            this.alunos[i + 1] = this.alunos[i];
        }
        this.alunos[posicao] = aluno;
        this.totalDeAlunos++;
    }

    private void garantaEspaco() {
        if (this.totalDeAlunos == this.alunos.length) {
            Aluno[] novoArray = new Aluno[this.alunos.length * 2];
            for (int i = 0; i < this.alunos.length; i++) {
                novoArray[i] = this.alunos[i];
            }
            this.alunos = novoArray;
        }

    }

    public Aluno pegarAlunoDaPosicao(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.alunos[posicao];
    }

    public void removerAluno(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.totalDeAlunos - 1; i++) {
            this.alunos[i] = this.alunos[i + 1];
        }
        this.totalDeAlunos--;
    }

    public Boolean contemAluno(Aluno aluno) {
        for (int i = 0; i < this.totalDeAlunos; i++) {
            if (aluno.equals(this.alunos[i])) {
                return true;
            }
        }
        return false;
    }

    public int quantidadeDeAlunos() {
        return this.totalDeAlunos;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeAlunos;
    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= this.totalDeAlunos;
    }

    @Override
    public String toString() {
        if (this.totalDeAlunos == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < this.totalDeAlunos - 1; i++) {
            builder.append(this.alunos[i]);
            builder.append(", ");
        }
        builder.append(this.alunos[this.totalDeAlunos - 1]);
        builder.append("]");
        return builder.toString();
    }
}
