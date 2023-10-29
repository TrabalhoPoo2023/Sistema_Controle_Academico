package fakeDB;

import dominio.Turma;
import dominio.Disciplina;
import dominio.Professor;
import dominio.Aluno;

import java.util.ArrayList;
import java.util.List;

public class TurmaFakeDB extends BaseGenericaFakeDB<Turma> {
    private List<Turma> turmas;

    @Override
    protected void CarregarDados() {

        ProfessorFakeDB professorFakeDB = new ProfessorFakeDB();
        List<Professor> professores = professorFakeDB.getProfessores();

        DisciplinaFakeDB disciplinaFakeDB = new DisciplinaFakeDB();
        List<Disciplina> disciplinas = disciplinaFakeDB.getDisciplinas();

        AlunoFakeDB alunoFakeDB = new AlunoFakeDB();
        List<Aluno> alunos = alunoFakeDB.getAlunos();


        Professor prof1 = professores.get(0);
        Professor prof2 = professores.get(1);
        Disciplina disciplina1 = disciplinas.get(0);
        Disciplina disciplina2 = disciplinas.get(1);
        Aluno aluno1 = alunos.get(0);
        Aluno aluno2 = alunos.get(1);
        Aluno aluno3 = alunos.get(2);

        Turma turma1 = new Turma(101, 6, prof1, prof2, disciplina1, disciplina2, aluno1, aluno2, aluno3);

        Professor prof3 = professores.get(2);
        Professor prof4 = professores.get(3);
        Disciplina disciplina3 = disciplinas.get(2);
        Disciplina disciplina4 = disciplinas.get(3);
        Aluno aluno4 = alunos.get(3);
        Aluno aluno5 = alunos.get(4);
        Aluno aluno6 = alunos.get(5);

        Turma turma2 = new Turma(102, 6, prof3, prof4, disciplina3, disciplina4, aluno4, aluno5, aluno6);

        turmas = new ArrayList<>();
        turmas.add(turma1);
        turmas.add(turma2);
    }

    public TurmaFakeDB() {
        super();
    }

    public List<Turma> getTurmas() {
        return turmas;
    }
}
