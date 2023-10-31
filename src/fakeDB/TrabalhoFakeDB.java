package fakeDB;

import java.util.ArrayList;
import dominio.Trabalho;
import dominio.Disciplina;

public class TrabalhoFakeDB extends BaseGenericaFakeDB<Trabalho> {

    @Override
    public void CarregarDados() {

        this.tabela = new ArrayList<Trabalho>();

        Disciplina disciplina1 = new Disciplina(1, "Matemática", "Ementa de Matemática");
        Disciplina disciplina2 = new Disciplina(2, "História", "Ementa de História");
        Disciplina disciplina3 = new Disciplina(3, "Física", "Ementa de Física");
        Disciplina disciplina4 = new Disciplina(4, "Química", "Ementa de Química");

        Trabalho trabalho1m = new Trabalho(1, "Trabalho 1", disciplina1);
        Trabalho trabalho2m = new Trabalho(2, "Trabalho 2", disciplina1);

        Trabalho trabalho1h = new Trabalho(3, "Trabalho 1", disciplina2);
        Trabalho trabalho2h = new Trabalho(4, "Trabalho 2", disciplina2);

        Trabalho trabalho1f = new Trabalho(5, "Trabalho 1", disciplina3);
        Trabalho trabalho2f = new Trabalho(6, "Trabalho 2", disciplina3);

        Trabalho trabalho1q = new Trabalho(7, "Trabalho 1", disciplina4);
        Trabalho trabalho2q = new Trabalho(8, "Trabalho 2", disciplina4);

        this.tabela.add(trabalho1m);
        this.tabela.add(trabalho2m);
        this.tabela.add(trabalho1h);
        this.tabela.add(trabalho2h);
        this.tabela.add(trabalho1f);
        this.tabela.add(trabalho2f);
        this.tabela.add(trabalho1q);
        this.tabela.add(trabalho2q);
    }

    public TrabalhoFakeDB() {
        super();
    }

    public void ImprimirTrabalhos() {
        Trabalho trabalho1m = tabela.get(0);
        Trabalho trabalho2m = tabela.get(1);
        Trabalho trabalho1h = tabela.get(2);
        Trabalho trabalho2h = tabela.get(3);
        Trabalho trabalho1f = tabela.get(4);
        Trabalho trabalho2f = tabela.get(5);
        Trabalho trabalho1q = tabela.get(6);
        Trabalho trabalho2q = tabela.get(7);
        trabalho1m.Imprimir();
        trabalho2m.Imprimir();
        trabalho1h.Imprimir();
        trabalho2h.Imprimir();
        trabalho1f.Imprimir();
        trabalho2f.Imprimir();
        trabalho1q.Imprimir();
        trabalho2q.Imprimir();
    }
    }
