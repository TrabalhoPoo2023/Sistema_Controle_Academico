package fakeDB;

import dominio.Disciplina;
import dominio.Turma;

import java.util.ArrayList;
import java.util.List;

public class DisciplinaFakeDB extends BaseGenericaFakeDB<Disciplina> {

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<Disciplina>();
        
        Turma turma1 = new Turma(1, 30);
        Turma turma2 = new Turma(2, 25);

        tabela.add(new Disciplina(1, "Matemática", "Ementa de Matemática"));
        tabela.add(new Disciplina(2, "História", "Ementa de História"));
        tabela.add(new Disciplina(3, "Biologia", "Ementa de Biologia"));
        tabela.add(new Disciplina(4, "Química", "Ementa de Química"));
        tabela.add(new Disciplina(5, "Física", "Ementa de Física"));

        tabela.get(0).getTurmas().add(turma1);
        tabela.get(1).getTurmas().add(turma1);
        tabela.get(2).getTurmas().add(turma2);
        tabela.get(3).getTurmas().add(turma2);
        tabela.get(4).getTurmas().add(turma1);
    }

    public DisciplinaFakeDB() {
        super();
    }

    public static Disciplina buscarDisciplinaPorCodigo(int i) {
        return null;
    }
}