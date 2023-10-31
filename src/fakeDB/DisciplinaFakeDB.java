package fakeDB;

import java.util.ArrayList;
import dominio.Disciplina;

public class DisciplinaFakeDB extends BaseGenericaFakeDB<Disciplina> {

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<Disciplina>();
        Disciplina disciplina1 = new Disciplina(1, "Matemática", "Ementa de Matemática");
        Disciplina disciplina2 = new Disciplina(2, "História", "Ementa de História");
        Disciplina disciplina3 = new Disciplina(3, "Física", "Ementa de Física");
        Disciplina disciplina4 = new Disciplina(4, "Química", "Ementa de Química");

        this.tabela.add(disciplina1);
        this.tabela.add(disciplina2);
        this.tabela.add(disciplina3);
        this.tabela.add(disciplina4);
    }

    public DisciplinaFakeDB(){
        super();
    }

    public void ImprimirDisciplinas() {
        Disciplina disciplina1 = tabela.get(0);
        Disciplina disciplina2 = tabela.get(1);
        Disciplina disciplina3 = tabela.get(2);
        Disciplina disciplina4 = tabela.get(3);

        disciplina1.Imprimir();
        disciplina2.Imprimir();
        disciplina3.Imprimir();
        disciplina4.Imprimir();
}
}