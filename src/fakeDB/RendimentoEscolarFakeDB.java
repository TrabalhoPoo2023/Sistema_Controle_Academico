package fakeDB;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dominio.RendimentoEscolar;
import dominio.Trabalho;
import dominio.Aluno;
import dominio.Disciplina;
import dominio.Turma;
import dominio.NotaTrabalho;
import dominio.Professor;

public class RendimentoEscolarFakeDB extends BaseGenericaFakeDB<RendimentoEscolar> {

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<RendimentoEscolar>();
        Aluno aluno1 = new Aluno(1, "Mateus", LocalDate.of(1994, 6, 5), "123456", "987654", 20201001);
        Aluno aluno2 = new Aluno(2, "Lucas", LocalDate.of(1993, 6, 5), "123455", "987653", 20201002);
        
        Trabalho trabalho1 = new Trabalho(1, "Trabalho 1", new Disciplina(1, "Matemática", "Ementa de Matemática"));
        Trabalho trabalho2 = new Trabalho(2, "Trabalho 2", new Disciplina(2, "História", "Ementa de História"));
        
        List<NotaTrabalho> notasAluno1 = new ArrayList<>();
        notasAluno1.add(new NotaTrabalho(1, 9.5, aluno1, trabalho1));
        notasAluno1.add(new NotaTrabalho(2, 6.0, aluno1, trabalho2));
        
        List<NotaTrabalho> notasAluno2 = new ArrayList<>();
        notasAluno2.add(new NotaTrabalho(3, 10, aluno2, trabalho1));
        notasAluno2.add(new NotaTrabalho(3, 8, aluno2, trabalho2));

        this.tabela.add(new RendimentoEscolar(aluno1, new Turma(1, 30, new Disciplina(1, "Matemática", "Ementa de Matemática"), new Professor(1, "Prof. João", LocalDate.of(1975, 5, 10), "joao123", "senha123", "Professor de Matemática")), 10, 8.5, notasAluno1, 7.75, 8.75));
        this.tabela.add(new RendimentoEscolar(aluno2, new Turma(2, 25, new Disciplina(2, "História", "Ementa de História"), new Professor(2, "Prof. Maria", LocalDate.of(1970, 7, 15), "maria456", "senha456", "Professor de História")), 8.75, 9.25, notasAluno2, 9, 9));
    }

    public RendimentoEscolarFakeDB(){
        super();
    }
}
