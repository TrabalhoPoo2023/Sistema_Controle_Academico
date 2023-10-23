package fakeDB;

import java.time.LocalDate;
import java.util.ArrayList;
import dominio.Professor;

public class ProfessorFakeDB extends BaseGenericaFakeDB<Professor> {

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<Professor>();
        this.tabela.add(new Professor(1, "João", LocalDate.of(1980, 5, 10), "joao123", "senha123", "Professor de Matemática"));
        this.tabela.add(new Professor(2, "Maria", LocalDate.of(1975, 7, 15), "maria456", "senha456", "Professor de História"));
        this.tabela.add(new Professor(3, "José", LocalDate.of(1985, 3, 20), "jose789", "senha789", "Professor de Física"));
    }

    public ProfessorFakeDB(){
        super();
    }
}
