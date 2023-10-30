package fakeDB;

import dominio.Disciplina;
import dominio.Professor;
import dominio.Turma;
import dominio.Aluno;

import java.util.ArrayList;
import java.util.List;

public class TurmaFakeDB extends BaseGenericaFakeDB<Turma> {
    private List<Turma> turmas;
    private AlunoFakeDB alunoDB;
    private ProfessorFakeDB professorDB;
    private DisciplinaFakeDB disciplinaDB;

    @Override
    public void CarregarDados() {

        alunoDB = new AlunoFakeDB();
        professorDB = new ProfessorFakeDB();
        disciplinaDB = new DisciplinaFakeDB();

        List<Aluno> alunos = alunoDB.getAlunos();
        List<Professor> professores = professorDB.getProfessores();
        List<Disciplina> disciplinas = disciplinaDB.getDisciplinas();

        turmas = new ArrayList<>();

        Turma turma1 = new Turma(1, 6, new Disciplina[] { disciplinas.get(0), disciplinas.get(1) },
                new Professor[] { professores.get(0), professores.get(1) },
                new Aluno[] { alunos.get(0), alunos.get(1), alunos.get(2) });

        Turma turma2 = new Turma(2, 6, new Disciplina[] { disciplinas.get(2), disciplinas.get(3) },
                new Professor[] { professores.get(2), professores.get(3) },
                new Aluno[] { alunos.get(3), alunos.get(4), alunos.get(5) });

        turmas.add(turma1);
        turmas.add(turma2);
    }

    public TurmaFakeDB() {
        super();
        turmas = new ArrayList<>();
    }

    public void ImprimirTurmas() {
        for (Turma turma : turmas) {
            turma.Imprimir();
        }
    }

    public List<Turma> getTurmas() {
        return turmas;
    }
}
