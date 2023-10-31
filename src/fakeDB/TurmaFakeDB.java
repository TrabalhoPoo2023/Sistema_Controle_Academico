package fakeDB;

import java.time.LocalDate;
import dominio.Turma;
import dominio.Aluno;
import dominio.Disciplina;
import dominio.Professor;

import java.util.ArrayList;

public class TurmaFakeDB extends BaseGenericaFakeDB<Turma> {

    @Override
    protected void CarregarDados() {
        
        this.tabela = new ArrayList<Turma>();

        Aluno aluno1 = new Aluno(1, "Mateus", LocalDate.of(1994, 6, 5), "123456", "987654", 20201001);
        Aluno aluno2 = new Aluno(2, "Lucas", LocalDate.of(1993, 6, 5), "123455", "987653", 20201002);
        Aluno aluno3 = new Aluno(3, "Pedro", LocalDate.of(1994, 7, 5), "123454", "987652", 20201003);
        Aluno aluno4 = new Aluno(4, "Tiago", LocalDate.of(1994, 3, 5), "123453", "987651", 20201004);
        Aluno aluno5 = new Aluno(5, "João", LocalDate.of(1995, 2, 25), "123452", "987655", 20201005);
        Aluno aluno6 = new Aluno(6, "Gabriel", LocalDate.of(1996, 4, 15), "123451", "987656", 20201006);

        Disciplina disciplina1 = new Disciplina(1, "Matemática", "Ementa de Matemática");
        Disciplina disciplina2 = new Disciplina(2, "História", "Ementa de História");
        Disciplina disciplina3 = new Disciplina(3, "Física", "Ementa de Física");
        Disciplina disciplina4 = new Disciplina(4, "Química", "Ementa de Química");

        Professor prof1 = new Professor(1, "João", LocalDate.of(1980, 5, 10), "joao123", "senha123", "Professor de Matemática");
        Professor prof2 = new Professor(2, "Maria", LocalDate.of(1975, 7, 15), "maria456", "senha456", "Professor de História");
        Professor prof3 = new Professor(3, "José", LocalDate.of(1985, 3, 20), "jose789", "senha789", "Professor de Física");
        Professor prof4 = new Professor(4, "Ana", LocalDate.of(1989, 2, 5), "ana189", "senha189", "Professor de Química");

        Turma turma1 = new Turma(1, 6, new Aluno[] {aluno1, aluno2, aluno3}, new Disciplina[] {disciplina1, disciplina2}, new Professor[] {prof1, prof2});
        Turma turma2 = new Turma(2, 6, new Aluno[] {aluno4, aluno5, aluno6}, new Disciplina[] {disciplina3, disciplina4}, new Professor[] {prof3, prof4});

        this.tabela.add(turma1);
        this.tabela.add(turma2);
    }

    public TurmaFakeDB(){
        super();
    }

    public void ImprimirTurmas() {
        Turma turma1 = tabela.get(0);
        Turma turma2 = tabela.get(1);
        turma1.Imprimir();
        turma2.Imprimir();
    }

    
}
