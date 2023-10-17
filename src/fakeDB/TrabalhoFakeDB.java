package fakeDB;

import dominio.Trabalho;

import java.util.ArrayList;

public class TrabalhoFakeDB extends BaseGenericaFakeDB<Trabalho> {

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<Trabalho>();
        this.tabela.add(new Trabalho(1, "Trabalho de Matemática", DisciplinaFakeDB.buscarDisciplinaPorCodigo(1)));
        this.tabela.add(new Trabalho(2, "Trabalho de História", DisciplinaFakeDB.buscarDisciplinaPorCodigo(2)));
        this.tabela.add(new Trabalho(3, "Trabalho de Biologia", DisciplinaFakeDB.buscarDisciplinaPorCodigo(3)));
        this.tabela.add(new Trabalho(4, "Trabalho de Química", DisciplinaFakeDB.buscarDisciplinaPorCodigo(4)));
        this.tabela.add(new Trabalho(5, "Trabalho de Física", DisciplinaFakeDB.buscarDisciplinaPorCodigo(5)));
    }

    public TrabalhoFakeDB() {
        super();
    }

    public static Trabalho buscarTrabalhoPorCodigo(int i) {
        return null;
    }
}
