package fakeDB;

import java.util.ArrayList;
import dominio.Disciplina;

public class DisciplinaFakeDB extends BaseGenericaFakeDB<Disciplina> {

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<Disciplina>();
        this.tabela.add(new Disciplina(1, "Matemática", "Ementa de Matemática"));
        this.tabela.add(new Disciplina(2, "História", "Ementa de História"));
        this.tabela.add(new Disciplina(3, "Física", "Ementa de Física"));
        this.tabela.add(new Disciplina(4, "Filosofia", "Conceitos de etica e filosofia"));
    }

    public DisciplinaFakeDB(){
        super();
    }
}