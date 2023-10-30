package fakeDB;

import java.util.ArrayList;
import java.util.List;

import dominio.Disciplina;

public class DisciplinaFakeDB extends BaseGenericaFakeDB<Disciplina> {
    private List<Disciplina> disciplinas;

    @Override
    public void CarregarDados() {

        disciplinas = new ArrayList<>();
        Disciplina disciplina1 = new Disciplina(1, "Matemática", "Ementa de Matemática");
        Disciplina disciplina2 = new Disciplina(2, "História", "Ementa de História");
        Disciplina disciplina3 = new Disciplina(3, "Física", "Ementa de Física");
        Disciplina disciplina4 = new Disciplina(4, "Química", "Ementa de Química");
    
        disciplinas.add(disciplina1);
        disciplinas.add(disciplina2);
        disciplinas.add(disciplina3);
        disciplinas.add(disciplina4);
    }

    public DisciplinaFakeDB() {
        super();
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    
}
