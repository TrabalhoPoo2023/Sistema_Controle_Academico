package fakeDB;

import java.time.LocalDate;
import java.util.ArrayList;
import dominio.NotaTrabalho;
import dominio.Aluno;
import dominio.Disciplina;
import dominio.Trabalho;

public class NotaTrabalhoFakeDB extends BaseGenericaFakeDB<NotaTrabalho> {

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<NotaTrabalho>();
        this.tabela.add(new NotaTrabalho(1, 9.5, new Aluno(1, "Mateus", LocalDate.of(1994, 6, 5), "123456", "987654", 20201001), new Trabalho(1, "Trabalho 1", new Disciplina(1, "Matemática", "Ementa de Matemática"))));
        this.tabela.add(new NotaTrabalho(2, 8.0, new Aluno(2, "Lucas", LocalDate.of(1993, 6, 5), "123455", "987653", 20201002), new Trabalho(2, "Trabalho 2", new Disciplina(2, "História", "Ementa de História"))));
        this.tabela.add(new NotaTrabalho(3, 7.5, new Aluno(3, "Pedro", LocalDate.of(1994, 7, 5), "123454", "987652", 20201003), new Trabalho(3, "Trabalho 3", new Disciplina(3, "Física", "Ementa de Física"))));
    }

    public NotaTrabalhoFakeDB(){
        super();
    }
}
