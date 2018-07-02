package br.com.caelum.ed;

import br.com.caelum.ed.Aluno;

public class Vetor {

    private Object[] objetos = new Aluno[100];
    private int totalDeObjetos = 0;

    /*public void adicionarAluno(Aluno aluno) {
        for (int i = 0; i < this.objetos.length; i++) {
            if (this.objetos[i] == null) {
                this.objetos[i] = aluno;
                break;
            }versao 1
        }
    }*/

    public void adicionarAluno(Aluno aluno) {
        this.garantaEspaco();
        this.objetos[totalDeObjetos] = aluno;
        totalDeObjetos++; //versao 2 melhorado
    }

    public void adicionarAluno(int posicao, Aluno aluno) {
        this.garantaEspaco();
        if (!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = this.totalDeObjetos - 1; i >= posicao; i -= 1) {
            this.objetos[i + 1] = this.objetos[i];
        }
        this.objetos[posicao] = aluno;
        this.totalDeObjetos++;
    }

    private void garantaEspaco() {
        if (this.totalDeObjetos == this.objetos.length) {
            Aluno[] novoArray = new Aluno[this.objetos.length * 2];
            for (int i = 0; i < this.objetos.length; i++) {
                novoArray[i] = (Aluno) this.objetos[i];
            }
            this.objetos = novoArray;
        }

    }

    public Aluno pegarAlunoDaPosicao(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return (Aluno) this.objetos[posicao];
    }

    public void removerAluno(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.totalDeObjetos - 1; i++) {
            this.objetos[i] = this.objetos[i + 1];
        }
        this.totalDeObjetos--;
    }

    public Boolean contemAluno(Aluno aluno) {
        for (int i = 0; i < this.totalDeObjetos; i++) {
            if (aluno.equals(this.objetos[i])) {
                return true;
            }
        }
        return false;
    }

    public int quantidadeDeAlunos() {
        return this.totalDeObjetos;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeObjetos;
    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= this.totalDeObjetos;
    }

    @Override
    public String toString() {
        if (this.totalDeObjetos == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < this.totalDeObjetos - 1; i++) {
            builder.append(this.objetos[i]);
            builder.append(", ");
        }
        builder.append(this.objetos[this.totalDeObjetos - 1]);
        builder.append("]");
        return builder.toString();
    }
}
