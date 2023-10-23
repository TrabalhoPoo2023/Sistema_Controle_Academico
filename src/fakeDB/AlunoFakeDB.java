package fakeDB;

import java.time.LocalDate;
import dominio.Aluno;

public class AlunoFakeDB extends BaseGenericaFakeDB<Aluno> {

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Aluno(1, "Mateus", LocalDate.of(1994, 6, 5), "123456", "987654", 20201001));
        this.tabela.add(new Aluno(2, "Lucas", LocalDate.of(1993, 6, 5), "123455", "987653", 20201002));
        this.tabela.add(new Aluno(3, "Pedro", LocalDate.of(1994, 7, 5), "123454", "987652", 20201003));
        this.tabela.add(new Aluno(4, "Tiago", LocalDate.of(1994, 3, 5), "123453", "987651", 20201004));
        this.tabela.add(new Aluno(5, "João", LocalDate.of(1995, 2, 25), "123452", "987658", 20201005));
    }

    public AlunoFakeDB(){
        super();
    }
}