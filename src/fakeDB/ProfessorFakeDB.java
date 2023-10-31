package fakeDB;

import java.time.LocalDate;
import java.util.ArrayList;

import dominio.Professor;

public class ProfessorFakeDB extends BaseGenericaFakeDB<Professor> {

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<Professor>();
        Professor prof1 = new Professor(1, "João", LocalDate.of(1980, 5, 10), "joao123", "senha123", "Professor de Matemática");
        Professor prof2 = new Professor(2, "Maria", LocalDate.of(1975, 7, 15), "maria456", "senha456", "Professor de História");
        Professor prof3 = new Professor(3, "José", LocalDate.of(1985, 3, 20), "jose789", "senha789", "Professor de Física");
        Professor prof4 = new Professor(4, "Ana", LocalDate.of(1989, 2, 5), "ana189", "senha189", "Professor de Química");

        this.tabela.add(prof1);
        this.tabela.add(prof2);
        this.tabela.add(prof3);
        this.tabela.add(prof4);
    }

    public ProfessorFakeDB(){
        super();
    }

    public void ImprimirProfessores() {
        Professor prof1 = tabela.get(0);
        Professor prof2 = tabela.get(1);
        Professor prof3 = tabela.get(2);
        Professor prof4 = tabela.get(3);

        prof1.Imprimir();
        prof2.Imprimir();
        prof3.Imprimir();
        prof4.Imprimir();
}
}
