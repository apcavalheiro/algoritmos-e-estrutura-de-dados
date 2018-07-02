package br.com.caelum.ed;

import java.util.Objects;

public class Aluno {

    private String nomeDoAluno;

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nomeDoAluno='" + nomeDoAluno + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nomeDoAluno, aluno.nomeDoAluno);
    }
}
