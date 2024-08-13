import java.util.ArrayList;
import java.util.List;

public class CadastroAluno {
    private List<Aluno> alunos;

    public CadastroAluno() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) throws MatriculaExisteException {
        for (Aluno al : alunos) {
            if (al.getMatricula().equals(aluno.getMatricula())) {
                throw new MatriculaExisteException("A matrícula " + aluno.getMatricula() + " já existe.");
            }
        }
        alunos.add(aluno);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
