public class TesteAluno {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.nome = "Matheus";
        aluno1.idade = 19;
        aluno1.curso = "Engenharia de Software";

        aluno2.nome = "Lívia";
        aluno2.idade = 21;
        aluno2.curso = "Arquitetura";

        aluno1.apresentar();

        aluno2.apresentar();
    }
}
