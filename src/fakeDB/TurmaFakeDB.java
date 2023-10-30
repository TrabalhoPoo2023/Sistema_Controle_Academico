package fakeDB;

import dominio.Disciplina;
import dominio.Professor;
import dominio.Turma;
import dominio.Aluno;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TurmaFakeDB extends BaseGenericaFakeDB<Turma> {
    private List<Turma> turmas;

    @Override
    public void CarregarDados() {
        turmas = new ArrayList<>();

        Turma turma1 = new Turma(1, 6,
                    new Disciplina(1, "Matemática", "Ementa de Matemática"),
                    new Disciplina(2, "História", "Ementa de História"), 
                    new Professor(1, "João", LocalDate.of(1975, 5, 10), "joao123", "senha123", "Professor de Matemática"),
                    new Professor(2, "Maria", LocalDate.of(1975, 7, 15), "maria456", "senha456", "Professor de História"),
                    new Aluno(1, "Mateus", LocalDate.of(1994, 6, 5), "123456", "987654", 20201001),
                    new Aluno(2, "Lucas", LocalDate.of(1993, 6, 5), "123455", "987653", 20201002),
                    new Aluno(3, "Pedro", LocalDate.of(1994, 7, 5), "123454", "987652", 20201003));

        Turma turma2 = new Turma(2, 6,
                    new Disciplina(3, "Física", "Ementa de Física"),
                    new Disciplina(4, "Química", "Ementa de Química"),
                    new Professor(3, "José", LocalDate.of(1985, 3, 20), "jose789", "senha789", "Professor de Física"),
                    new Professor(4, "Ana", LocalDate.of(1989, 2, 5), "ana189", "senha189", "Professor de Química"),
                    new Aluno(4, "Tiago", LocalDate.of(1994, 3, 5), "123453", "987651", 20201004),
                    new Aluno(5, "João", LocalDate.of(1995, 2, 25), "123452", "987655", 20201005),
                    new Aluno(6, "Gabriel", LocalDate.of(1996, 4, 15), "123451", "987656", 20201006));

        turmas.add(turma1);
        turmas.add(turma2);
    }

    public TurmaFakeDB() {
        super();
    }

    // Método para permitir o acesso à lista de turmas
    public List<Turma> getTurmas() {
        return turmas;
    }
}
