package fakeDB;

import dominio.Turma;
import dominio.Aluno;
import java.util.ArrayList;
import java.util.List;

public class TurmaFakeDB {
    private List<Turma> turmas;

    public TurmaFakeDB() {
        turmas = new ArrayList<>();
        carregarDados();
    }

    private void carregarDados() {
        turmas.add(new Turma(1, 30, DisciplinaFakeDB.buscarDisciplinaPorCodigo(1), ProfessorFakeDB.buscarProfessorPorCodigo(1)));
        turmas.add(new Turma(2, 25, DisciplinaFakeDB.buscarDisciplinaPorCodigo(2), ProfessorFakeDB.buscarProfessorPorCodigo(2)));
        turmas.add(new Turma(3, 30, DisciplinaFakeDB.buscarDisciplinaPorCodigo(3), ProfessorFakeDB.buscarProfessorPorCodigo(3)));
        turmas.add(new Turma(4, 20, DisciplinaFakeDB.buscarDisciplinaPorCodigo(4), ProfessorFakeDB.buscarProfessorPorCodigo(4)));
        turmas.add(new Turma(5, 35, DisciplinaFakeDB.buscarDisciplinaPorCodigo(5), ProfessorFakeDB.buscarProfessorPorCodigo(5)));
    }

    public List<Turma> listarTurmas() {
        return turmas;
    }

    public Turma buscarTurmaPorCodigo(int codigo) {
        for (Turma turma : turmas) {
            if (turma.getCodigo() == codigo) {
                return turma;
            }
        }
        return null;
    }

    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }

    public void atualizarTurma(Turma turma) {
        for (int i = 0; i < turmas.size(); i++) {
            if (turmas.get(i).getCodigo() == turma.getCodigo()) {
                turmas.set(i, turma);
                break;
            }
        }
    }

    public void removerTurma(int codigo) {
        Turma turmaParaRemover = null;
        for (Turma turma : turmas) {
            if (turma.getCodigo() == codigo) {
                turmaParaRemover = turma;
                break;
            }
        }
        if (turmaParaRemover != null) {
            turmas.remove(turmaParaRemover);
        }
    }

    public void adicionarAlunoATurma(int codigoTurma, Aluno aluno) {
        Turma turma = buscarTurmaPorCodigo(codigoTurma);
        if (turma != null) {
            turma.getAlunos().add(aluno);
        }
    }

    public void removerAlunoDaTurma(int codigoTurma, int codigoAluno) {
        Turma turma = buscarTurmaPorCodigo(codigoTurma);
        if (turma != null) {
            turma.getAlunos().removeIf(aluno -> aluno.getCodigo() == codigoAluno);
        }
    }
}
