package fakeDB;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dominio.Aluno;

public class AlunoFakeDB extends BaseGenericaFakeDB<Aluno> {
    private List<Aluno> alunos;

    @Override
    public void CarregarDados() {

        alunos = new ArrayList<>();

        Aluno aluno1 = new Aluno(1, "Mateus", LocalDate.of(1994, 6, 5), "123456", "987654", 20201001);
        Aluno aluno2 = new Aluno(2, "Lucas", LocalDate.of(1993, 6, 5), "123455", "987653", 20201002);
        Aluno aluno3 = new Aluno(3, "Pedro", LocalDate.of(1994, 7, 5), "123454", "987652", 20201003);
        Aluno aluno4 = new Aluno(4, "Tiago", LocalDate.of(1994, 3, 5), "123453", "987651", 20201004);
        Aluno aluno5 = new Aluno(5, "João", LocalDate.of(1995, 2, 25), "123452", "987655", 20201005);
        Aluno aluno6 = new Aluno(6, "Gabriel", LocalDate.of(1996, 4, 15), "123451", "987656", 20201006);
        
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno5);
        alunos.add(aluno6);
    }
    
    public AlunoFakeDB() {
        super();
    }

    // Método para permitir o acesso à lista de alunos
    public List<Aluno> getAlunos() {
        return alunos;
    }
}
