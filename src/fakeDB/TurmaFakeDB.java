package fakeDB;

import java.time.LocalDate;
import java.util.ArrayList;
import dominio.Turma;
import dominio.Disciplina;
import dominio.Professor;

public class TurmaFakeDB extends BaseGenericaFakeDB<Turma> {

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<Turma>();
        this.tabela.add(new Turma(1, 30, new Disciplina(1, "Matemática", "Ementa de Matemática"), new Professor(1, "Prof. João", LocalDate.of(1975, 5, 10), "joao123", "senha123", "Professor de Matemática")));
        this.tabela.add(new Turma(2, 25, new Disciplina(2, "História", "Ementa de História"), new Professor(2, "Prof. Maria", LocalDate.of(1970, 7, 15), "maria456", "senha456", "Professor de História")));
        this.tabela.add(new Turma(3, 20, new Disciplina(3, "Física", "Ementa de Física"), new Professor(3, "Prof. José", LocalDate.of(1980, 3, 20), "jose789", "senha789", "Professor de Física")));
    }

    public TurmaFakeDB(){
        super();
    }
}