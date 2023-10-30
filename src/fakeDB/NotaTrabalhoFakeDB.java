package fakeDB;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dominio.NotaTrabalho;
import dominio.Aluno;
import dominio.Disciplina;
import dominio.Trabalho;

public class NotaTrabalhoFakeDB extends BaseGenericaFakeDB<NotaTrabalho> {
    private List<NotaTrabalho> notas;

    @Override
    protected void CarregarDados() {
        notas = new ArrayList<>();

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

        Trabalho trabalho1m = (new Trabalho(1, "Trabalho 1", disciplina1));
        Trabalho trabalho2m = (new Trabalho(2, "Trabalho 2", disciplina1));
        Trabalho trabalho1h = (new Trabalho(3, "Trabalho 1", disciplina2));
        Trabalho trabalho2h = (new Trabalho(4, "Trabalho 2", disciplina2));
        Trabalho trabalho1f = (new Trabalho(5, "Trabalho 1", disciplina3));
        Trabalho trabalho2f = (new Trabalho(6, "Trabalho 2", disciplina3));
        Trabalho trabalho1q = (new Trabalho(7, "Trabalho 1", disciplina4));
        Trabalho trabalho2q = (new Trabalho(8, "Trabalho 2", disciplina4));

        
        NotaTrabalho nt1 = new NotaTrabalho(1, 9.0, aluno1, trabalho1m);
        NotaTrabalho nt2 = new NotaTrabalho(2, 8.0, aluno1, trabalho2m);
        NotaTrabalho nt3 = new NotaTrabalho(3, 10.0, aluno1, trabalho1h);
        NotaTrabalho nt4 = new NotaTrabalho(4, 7.0, aluno1, trabalho2h);

        NotaTrabalho nt5 = new NotaTrabalho(5, 7.0, aluno2, trabalho1m);
        NotaTrabalho nt6 = new NotaTrabalho(6, 6.0, aluno2, trabalho2m);
        NotaTrabalho nt7 = new NotaTrabalho(7, 9.0, aluno2, trabalho1h);
        NotaTrabalho nt8 = new NotaTrabalho(8, 10.0, aluno2, trabalho2h);

        NotaTrabalho nt9 = new NotaTrabalho(9, 5.0, aluno3, trabalho1m);
        NotaTrabalho nt10 = new NotaTrabalho(10, 7.0, aluno3, trabalho2m);
        NotaTrabalho nt11 = new NotaTrabalho(11, 8.0, aluno3, trabalho1h);
        NotaTrabalho nt12 = new NotaTrabalho(12, 9.0, aluno3, trabalho2h);

        NotaTrabalho nt13 = new NotaTrabalho(13, 9.0, aluno4, trabalho1f);
        NotaTrabalho nt14 = new NotaTrabalho(14, 6.0, aluno4, trabalho2f);
        NotaTrabalho nt15 = new NotaTrabalho(15, 10.0, aluno4, trabalho1q);
        NotaTrabalho nt16 = new NotaTrabalho(16, 8.0, aluno4, trabalho2q);

        NotaTrabalho nt17 = new NotaTrabalho(17, 4.0, aluno5, trabalho1f);
        NotaTrabalho nt18 = new NotaTrabalho(18, 6.0, aluno5, trabalho2f);
        NotaTrabalho nt19 = new NotaTrabalho(19, 8.0, aluno5, trabalho1q);
        NotaTrabalho nt20 = new NotaTrabalho(20, 10.0, aluno5, trabalho2q);

        NotaTrabalho nt21 = new NotaTrabalho(21, 5.0, aluno6, trabalho1f);
        NotaTrabalho nt22 = new NotaTrabalho(22, 9.0, aluno6, trabalho2f);
        NotaTrabalho nt23 = new NotaTrabalho(23, 10.0, aluno6, trabalho1q);
        NotaTrabalho nt24 = new NotaTrabalho(24, 9.0, aluno6, trabalho2q);

        notas.add(nt1);
        notas.add(nt2);
        notas.add(nt3);
        notas.add(nt4);
        notas.add(nt5);
        notas.add(nt6);
        notas.add(nt7);
        notas.add(nt8);
        notas.add(nt9);
        notas.add(nt10);
        notas.add(nt11);
        notas.add(nt12);
        notas.add(nt13);
        notas.add(nt14);
        notas.add(nt15);
        notas.add(nt16);
        notas.add(nt17);
        notas.add(nt18);
        notas.add(nt19);
        notas.add(nt20);
        notas.add(nt21);
        notas.add(nt22);
        notas.add(nt23);
        notas.add(nt24);
    }

    public NotaTrabalhoFakeDB() {
        super();
    }

    public List<NotaTrabalho> getNotas() {
        return notas;
    }

}