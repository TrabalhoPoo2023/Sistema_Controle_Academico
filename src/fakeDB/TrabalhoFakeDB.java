package fakeDB;

import java.util.ArrayList;
import java.util.List;

import dominio.Trabalho;
import dominio.Disciplina;

public class TrabalhoFakeDB extends BaseGenericaFakeDB<Trabalho> {
    private List<Trabalho> trabalhos;

    @Override
    protected void CarregarDados() {

    DisciplinaFakeDB disciplinaFakeDB = new DisciplinaFakeDB();
    List<Disciplina> disciplinas = disciplinaFakeDB.getDisciplinas();

        Disciplina disciplina1 = disciplinas.get(0);
        Trabalho trabalho1m = (new Trabalho(1, "Trabalho 1", disciplina1));
        Trabalho trabalho2m = (new Trabalho(2, "Trabalho 2", disciplina1));

        Disciplina disciplina2 = disciplinas.get(0);
        Trabalho trabalho1h = (new Trabalho(3, "Trabalho 1", disciplina2));
        Trabalho trabalho2h = (new Trabalho(4, "Trabalho 2", disciplina2));

        Disciplina disciplina3 = disciplinas.get(0);
        Trabalho trabalho1f = (new Trabalho(5, "Trabalho 1", disciplina3));
        Trabalho trabalho2f = (new Trabalho(6, "Trabalho 2", disciplina3));

        Disciplina disciplina4 = disciplinas.get(0);
        Trabalho trabalho1q = (new Trabalho(7, "Trabalho 1", disciplina4));
        Trabalho trabalho2q = (new Trabalho(8, "Trabalho 2", disciplina4));

        trabalhos = new ArrayList<>();
        trabalhos.add(trabalho1m);
        trabalhos.add(trabalho2m);
        trabalhos.add(trabalho1h);
        trabalhos.add(trabalho2h);
        trabalhos.add(trabalho1f);
        trabalhos.add(trabalho2f);
        trabalhos.add(trabalho1q);
        trabalhos.add(trabalho2q);
  
    }

    public TrabalhoFakeDB(){
        super();
    }

     public List<Trabalho> getTrabalhos() {
        return trabalhos;
    }
}
