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
    private List<RendimentoEscolar> rendimentos;


    @Override
    protected void CarregarDados() {
        
        Aluno aluno1 = new Aluno(1, "Mateus", LocalDate.of(1994, 6, 5), "123456", "987654", 20201001);
        Aluno aluno2 = new Aluno(2, "Lucas", LocalDate.of(1993, 6, 5), "123455", "987653", 20201002);
        Aluno aluno3 = new Aluno(3, "Pedro", LocalDate.of(1994, 7, 5), "123454", "987652", 20201003);
        Aluno aluno4 = new Aluno(4, "Tiago", LocalDate.of(1994, 3, 5), "123453", "987651", 20201004);
        Aluno aluno5 = new Aluno(5, "João", LocalDate.of(1995, 2, 25), "123452", "987655", 20201005);
        Aluno aluno6 = new Aluno(6, "Gabriel", LocalDate.of(1996, 4, 15), "123451", "987656", 20201006);

        Professor prof1 = new Professor(1, "João", LocalDate.of(1980, 5, 10), "joao123", "senha123", "Professor de Matemática");
        Professor prof2 = new Professor(2, "Maria", LocalDate.of(1975, 7, 15), "maria456", "senha456", "Professor de História");
        Professor prof3 = new Professor(3, "José", LocalDate.of(1985, 3, 20), "jose789", "senha789", "Professor de Física");
        Professor prof4 = new Professor(4, "Ana", LocalDate.of(1989, 2, 5), "ana189", "senha189", "Professor de Química");
    
        Disciplina disciplina1 = new Disciplina(1, "Matemática", "Ementa de Matemática");
        Disciplina disciplina2 = new Disciplina(2, "História", "Ementa de História");
        Disciplina disciplina3 = new Disciplina(3, "Física", "Ementa de Física");
        Disciplina disciplina4 = new Disciplina(4, "Química", "Ementa de Química");

        Turma turma1 = new Turma(1, 6, disciplina1, disciplina2, prof1, prof2, aluno1, aluno2, aluno3);
        Turma turma2 = new Turma(2, 6, disciplina3, disciplina4, prof3, prof4, aluno4, aluno5, aluno6);

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

        rendimentos = new ArrayList<>();

        RendimentoEscolar al1 = new RendimentoEscolar(aluno1, turma1,
                disciplina1, prof1, trabalho1m, nt1, trabalho2m, nt2, mediaTrabalhos 8.50, nota1 8.0, nota 2 9.0, mediaGeral 8.5,
                disciplina2, prof2, trabalho1h, nt3, trabalho2h, nt4, 8.50, 7.0, 5.0, 6.8);
    
        rendimentos.add(al1);

    }


    public RendimentoEscolarFakeDB(){
        super();
    }
}
