package fakeDB;

import dominio.NotaTrabalho;
import dominio.Aluno;
import dominio.Disciplina;
import dominio.Trabalho;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NotaTrabalhoFakeDB extends BaseGenericaFakeDB<NotaTrabalho> {
    private List<NotaTrabalho> notasAluno1;
    private List<NotaTrabalho> notasAluno2;
    private List<NotaTrabalho> notasAluno3;
    private List<NotaTrabalho> notasAluno4;
    private List<NotaTrabalho> notasAluno5;
    private List<NotaTrabalho> notasAluno6;
    private AlunoFakeDB alunoDB;
    private DisciplinaFakeDB disciplinaDB;
    private TrabalhoFakeDB trabalhoDB;

    @Override
    public void CarregarDados() {
        alunoDB = new AlunoFakeDB();
        disciplinaDB = new DisciplinaFakeDB();
        trabalhoDB = new TrabalhoFakeDB();

        List<Aluno> alunos = alunoDB.getAlunos();
        List<Disciplina> disciplinas = disciplinaDB.getDisciplinas();
        List<Trabalho> trabalhos = trabalhoDB.getTrabalhos();

        notasAluno1 = new ArrayList<>();
        Aluno aluno1 = alunos.get(0);
        Trabalho trabalho1m = trabalhos.get(0);
        Trabalho trabalho2m = trabalhos.get(1);
        Disciplina disciplina1 = disciplinas.get(0);

        NotaTrabalho nota1 = new NotaTrabalho(1, 9.0, aluno1, trabalho1m, disciplina1);
        NotaTrabalho nota2 = new NotaTrabalho(2, 8.0, aluno1, trabalho2m, disciplina1);

        Trabalho trabalho1h = trabalhos.get(2);
        Trabalho trabalho2h = trabalhos.get(3);
        Disciplina disciplina2 = disciplinas.get(1);

        NotaTrabalho nota3 = new NotaTrabalho(3, 9.0, aluno1, trabalho1h, disciplina2);
        NotaTrabalho nota4 = new NotaTrabalho(4, 8.0, aluno1, trabalho2h, disciplina2);

        notasAluno1.add(nota1);
        notasAluno1.add(nota2);
        notasAluno1.add(nota3);
        notasAluno1.add(nota4);

        notasAluno2 = new ArrayList<>();
        Aluno aluno2 = alunos.get(1);
        NotaTrabalho nota12 = new NotaTrabalho(11, 9.0, aluno2, trabalho1m, disciplina1);
        NotaTrabalho nota22 = new NotaTrabalho(21, 7.0, aluno2, trabalho2m, disciplina1);

        NotaTrabalho nota32 = new NotaTrabalho(31, 7.0, aluno2, trabalho1h, disciplina2);
        NotaTrabalho nota42 = new NotaTrabalho(41, 5.0, aluno2, trabalho2h, disciplina2);

        notasAluno2.add(nota12);
        notasAluno2.add(nota22);
        notasAluno2.add(nota32);
        notasAluno2.add(nota42);

        notasAluno3 = new ArrayList<>();
        Aluno aluno3 = new Aluno(3, "Pedro", LocalDate.of(1994, 7, 5), "123454", "987652", 20201003);
        NotaTrabalho nota13 = new NotaTrabalho(11, 1.0, aluno3, trabalho1m, disciplina1);
        NotaTrabalho nota23 = new NotaTrabalho(21, 9.0, aluno3, trabalho2m, disciplina1);

        NotaTrabalho nota33 = new NotaTrabalho(31, 9.0, aluno3, trabalho1h, disciplina2);
        NotaTrabalho nota43 = new NotaTrabalho(41, 6.0, aluno3, trabalho2h, disciplina2);

        notasAluno3.add(nota13);
        notasAluno3.add(nota23);
        notasAluno3.add(nota33);
        notasAluno3.add(nota43);

        notasAluno4 = new ArrayList<>();
        Aluno aluno4 = new Aluno(4, "Tiago", LocalDate.of(1994, 3, 5), "123453", "987651", 20201004);
        Trabalho trabalho1f = trabalhos.get(0);
        Trabalho trabalho2f = trabalhos.get(1);
        Disciplina disciplina3 = disciplinas.get(0);

        NotaTrabalho nota14 = new NotaTrabalho(14, 9.0, aluno4, trabalho1f, disciplina3);
        NotaTrabalho nota24 = new NotaTrabalho(24, 8.0, aluno4, trabalho2f, disciplina3);

        Trabalho trabalho1q = trabalhos.get(2);
        Trabalho trabalho2q = trabalhos.get(3);
        Disciplina disciplina4 = disciplinas.get(1);

        NotaTrabalho nota34 = new NotaTrabalho(34, 10.0, aluno4, trabalho1q, disciplina4);
        NotaTrabalho nota44 = new NotaTrabalho(44, 5.0, aluno4, trabalho2q, disciplina4);

        notasAluno4.add(nota14);
        notasAluno4.add(nota24);
        notasAluno4.add(nota34);
        notasAluno4.add(nota44);

        notasAluno5 = new ArrayList<>();
        Aluno aluno5 = new Aluno(5, "João", LocalDate.of(1995, 2, 25), "123452", "987655", 20201005);
        NotaTrabalho nota15 = new NotaTrabalho(15, 2.0, aluno5, trabalho1f, disciplina3);
        NotaTrabalho nota25 = new NotaTrabalho(25, 6.0, aluno5, trabalho2f, disciplina3);

        NotaTrabalho nota35 = new NotaTrabalho(35, 7.0, aluno5, trabalho1q, disciplina4);
        NotaTrabalho nota45 = new NotaTrabalho(45, 7.0, aluno5, trabalho2q, disciplina4);

        notasAluno5.add(nota15);
        notasAluno5.add(nota25);
        notasAluno5.add(nota35);
        notasAluno5.add(nota45);

        notasAluno6 = new ArrayList<>();
        Aluno aluno6 = new Aluno(6, "Gabriel", LocalDate.of(1996, 4, 15), "123451", "987656", 20201006);
        NotaTrabalho nota16 = new NotaTrabalho(16, 8.0, aluno6, trabalho1f, disciplina3);
        NotaTrabalho nota26 = new NotaTrabalho(26, 4.0, aluno6, trabalho2f, disciplina3);

        NotaTrabalho nota36 = new NotaTrabalho(36, 10.0, aluno6, trabalho1q, disciplina4);
        NotaTrabalho nota46 = new NotaTrabalho(46, 9.0, aluno6, trabalho2q, disciplina4);

        notasAluno6.add(nota16);
        notasAluno6.add(nota26);
        notasAluno6.add(nota36);
        notasAluno6.add(nota46);

    }

    public void imprimirNotas() {
        for (NotaTrabalho nota : notasAluno1) {
            nota.Imprimir(); 
        }
        for (NotaTrabalho nota : notasAluno2) {
            nota.Imprimir(); 
        }
        for (NotaTrabalho nota : notasAluno3) {
            nota.Imprimir(); 
        }
        for (NotaTrabalho nota : notasAluno4) {
            nota.Imprimir(); 
        }
        for (NotaTrabalho nota : notasAluno5) {
            nota.Imprimir(); 
        }
        for (NotaTrabalho nota : notasAluno6) {
            nota.Imprimir(); 
        }
    }

    public List<NotaTrabalho> getNotas() {
        return notasAluno1;
    }
}
