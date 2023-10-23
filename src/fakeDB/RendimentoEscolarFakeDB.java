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
        notasAluno1.add(new NotaTrabalho(2, 8.0, aluno1, trabalho2));
        
        List<NotaTrabalho> notasAluno2 = new ArrayList<>();
        notasAluno2.add(new NotaTrabalho(3, 7.5, aluno2, trabalho1));
        this.tabela.add(new RendimentoEscolar(aluno1, new Turma(1, 30, new Disciplina(1, "Matemática", "Ementa de Matemática"), new Professor(1, "Prof. João", LocalDate.of(1975, 5, 10), "joao123", "senha123", "Professor de Matemática")), 9.5, 8.0, notasAluno1, 8.75, 8.83));
        this.tabela.add(new RendimentoEscolar(aluno2, new Turma(2, 25, new Disciplina(2, "História", "Ementa de História"), new Professor(2, "Prof. Maria", LocalDate.of(1970, 7, 15), "maria456", "senha456", "Professor de História")), 7.5, 0.0, notasAluno2, 7.5, 5.0));
    }

    public RendimentoEscolarFakeDB(){
        super();
    }
}
