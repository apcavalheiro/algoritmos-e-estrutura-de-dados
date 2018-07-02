package br.com.caelum.ed;

public class TesteMain {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Aluno aluno1 = new Aluno();

        aluno.setNomeDoAluno("João");
        aluno1.setNomeDoAluno("José");

        VetorAlunos lista = new VetorAlunos();

        lista.adicionarAluno(aluno);
        lista.adicionarAluno(aluno1);

        System.out.println(lista);
    }
}
