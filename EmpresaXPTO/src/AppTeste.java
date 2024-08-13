public class AppTeste {
    public static void main(String[] args) {
        CadastroAluno cadastro = new CadastroAluno();

        try {
            Aluno aluno1 = new Aluno("Adriana", "Rua 23, 345", "8754665");
            Aluno aluno2 = new Aluno("Lívia", "Rua 10, 80", "2653258");
            Aluno aluno3 = new Aluno("Fernando", "Rua 29, 142", "5985673");
            Aluno aluno4 = new Aluno("Júlio", "Rua 44, 568", "2653258");

            cadastro.adicionarAluno(aluno1);
            cadastro.adicionarAluno(aluno2);
            cadastro.adicionarAluno(aluno3);
            cadastro.adicionarAluno(aluno4);


        } catch (MatriculaExisteException e) {
            System.out.println(e.getMessage());
        }

        for (Aluno aluno : cadastro.getAlunos()) {
            System.out.println("Aluno: " + aluno.getNome() + " - Matrícula: " + aluno.getMatricula());
        }
    }
}