package fakeDB;

import java.time.LocalDate;
import java.util.ArrayList;

import dominio.Aluno;

public class AlunoFakeDB extends BaseGenericaFakeDB<Aluno> {

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<Aluno>();
        Aluno aluno1 = new Aluno(1, "Mateus", LocalDate.of(1994, 6, 5), "123456", "987654", 20201001);
        Aluno aluno2 = new Aluno(2, "Lucas", LocalDate.of(1993, 6, 5), "123455", "987653", 20201002);
        Aluno aluno3 = new Aluno(3, "Pedro", LocalDate.of(1994, 7, 5), "123454", "987652", 20201003);
        Aluno aluno4 = new Aluno(4, "Tiago", LocalDate.of(1994, 3, 5), "123453", "987651", 20201004);
        Aluno aluno5 = new Aluno(5, "João", LocalDate.of(1995, 2, 25), "123452", "987655", 20201005);
        Aluno aluno6 = new Aluno(6, "Gabriel", LocalDate.of(1996, 4, 15), "123451", "987656", 20201006);

        this.tabela.add(aluno1);
        this.tabela.add(aluno2);
        this.tabela.add(aluno3);
        this.tabela.add(aluno4);
        this.tabela.add(aluno5);
        this.tabela.add(aluno6);
    }

    public AlunoFakeDB(){
        super();
    }

    public void ImprimirAlunos() {
            Aluno aluno1 = tabela.get(0);
            Aluno aluno2 = tabela.get(1);
            Aluno aluno3 = tabela.get(2);
            Aluno aluno4 = tabela.get(3);
            Aluno aluno5 = tabela.get(4);
            Aluno aluno6 = tabela.get(5);
            aluno1.Imprimir();
            aluno2.Imprimir();
            aluno3.Imprimir();
            aluno4.Imprimir();
            aluno5.Imprimir();
            aluno6.Imprimir();
    }
}