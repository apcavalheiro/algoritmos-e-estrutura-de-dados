package br.com.caelum.ed;

public class TesteMain {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno.setNomeDoAluno("João");
        aluno1.setNomeDoAluno("José");
        aluno2.setNomeDoAluno("pedro");
        VetorAlunos lista = new VetorAlunos();

        lista.adicionarAluno(aluno);
        lista.adicionarAluno(aluno1);
       // lista.adicionarAluno(1,aluno2);
        lista.removerAluno(0);
        //System.out.println(lista.quantidadeDeAlunos());
        //lista.contemAluno(aluno);
        //System.out.println(lista.pegarAlunoDaPosicao(1));
        //System.out.println(lista.contemAluno(aluno));
        System.out.println(lista);
    }
}
