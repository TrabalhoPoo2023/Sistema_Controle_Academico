package fakeDB;

import dominio.Turma;

import java.util.ArrayList;

public class TurmaFakeDB extends BaseGenericaFakeDB<Turma> {

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<Turma>();
        this.tabela.add(new Turma(1, 30, DisciplinaFakeDB.buscarDisciplinaPorCodigo(1), ProfessorFakeDB.buscarProfessorPorCodigo(1)));
        this.tabela.add(new Turma(2, 25, DisciplinaFakeDB.buscarDisciplinaPorCodigo(2), ProfessorFakeDB.buscarProfessorPorCodigo(2)));
        this.tabela.add(new Turma(3, 30, DisciplinaFakeDB.buscarDisciplinaPorCodigo(3), ProfessorFakeDB.buscarProfessorPorCodigo(3)));
        this.tabela.add(new Turma(4, 20, DisciplinaFakeDB.buscarDisciplinaPorCodigo(4), ProfessorFakeDB.buscarProfessorPorCodigo(4)));
        this.tabela.add(new Turma(5, 35, DisciplinaFakeDB.buscarDisciplinaPorCodigo(5), ProfessorFakeDB.buscarProfessorPorCodigo(5)));
    }

    public TurmaFakeDB() {
        super();
    }

    public static Turma Selecionar(int i) {
        return null;
    }
}