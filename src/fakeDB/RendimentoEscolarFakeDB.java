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
    private List<RendimentoEscolar> rendimentoAluno1;
    private AlunoFakeDB alunoDB;
    private ProfessorFakeDB professorDB;
    private DisciplinaFakeDB disciplinaDB;

    @Override
    public void CarregarDados() {

        
        alunoDB = new AlunoFakeDB();
        professorDB = new ProfessorFakeDB();
        disciplinaDB = new DisciplinaFakeDB();

        List<Aluno> alunos = alunoDB.getAlunos();
        List<Professor> professores = professorDB.getProfessores();
        List<Disciplina> disciplinas = disciplinaDB.getDisciplinas();


        rendimentoAluno1 = new ArrayList<>();
        Aluno aluno1 = new Aluno(1, "Mateus", LocalDate.of(1994, 6, 5), "123456", "987654", 20201001);

        Disciplina disciplina1 = new Disciplina(1, "Matemática", "Ementa de Matemática");
        
        Trabalho trabalho1m = new Trabalho(1, "Trabalho 1", disciplinas.get(0));
        Trabalho trabalho2m = new Trabalho(2, "Trabalho 2", disciplinas.get(0));
        
        NotaTrabalho nota1 = new NotaTrabalho(1, 9.0, aluno1, trabalho1m, disciplina1);
        NotaTrabalho nota2 = new NotaTrabalho(2, 8.0, aluno1, trabalho2m, disciplina1);

        Disciplina disciplina2 = new Disciplina(2, "História", "Ementa de História");
        Trabalho trabalho1h = new Trabalho(3, "Trabalho 1", disciplinas.get(1));
        Trabalho trabalho2h = new Trabalho(4, "Trabalho 2", disciplinas.get(1));
        
        NotaTrabalho nota3 = new NotaTrabalho(3, 9.0, aluno1, trabalho1h, disciplina2);
        NotaTrabalho nota4 = new NotaTrabalho(4, 8.0, aluno1, trabalho2h, disciplina2);

        Turma turma1 = new Turma(1, 6, new Disciplina[] { disciplinas.get(0), disciplinas.get(1) },
        new Professor[] { professores.get(0), professores.get(1) },
        new Aluno[] { alunos.get(0), alunos.get(1), alunos.get(2) });

        RendimentoEscolar r1 = new RendimentoEscolar(1, aluno1, turma1, disciplina1, 10.0, 8.0, trabalho1m, nota1, trabalho2m, nota2, 9.0, 9.0);
        RendimentoEscolar r2 = new RendimentoEscolar(2, aluno1, turma1, disciplina2, 5.0, 7.0, trabalho1h, nota3, trabalho2h, nota4, 8.5, 6.8);
    
        rendimentoAluno1.add(r1);
        rendimentoAluno1.add(r2);

        Aluno aluno2 = new Aluno(2, "Lucas", LocalDate.of(1993, 6, 5), "123455", "987653", 20201002);
        NotaTrabalho nota12 = new NotaTrabalho(11, 9.0, aluno2, trabalho1m, disciplina1);
        NotaTrabalho nota22 = new NotaTrabalho(21, 7.0, aluno2, trabalho2m, disciplina1);
        NotaTrabalho nota32 = new NotaTrabalho(31, 7.0, aluno2, trabalho1h, disciplina2);
        NotaTrabalho nota42 = new NotaTrabalho(41, 5.0, aluno2, trabalho2h, disciplina2);

        RendimentoEscolar r3 = new RendimentoEscolar(3, aluno2, turma1, disciplina1, 3.0, 9.0, trabalho1m, nota12, trabalho2m, nota22, 8.0, 6.6);
        RendimentoEscolar r4 = new RendimentoEscolar(4, aluno2, turma1, disciplina2, 5.0, 7.0, trabalho1h, nota32, trabalho2h, nota42, 6.0, 6.0);

        rendimentoAluno1.add(r3);
        rendimentoAluno1.add(r4);

        Aluno aluno3 = new Aluno(3, "Pedro", LocalDate.of(1994, 7, 5), "123454", "987652", 20201003);
        NotaTrabalho nota13 = new NotaTrabalho(11, 1.0, aluno3, trabalho1m, disciplina1);
        NotaTrabalho nota23 = new NotaTrabalho(21, 9.0, aluno3, trabalho2m, disciplina1);
        NotaTrabalho nota33 = new NotaTrabalho(31, 9.0, aluno3, trabalho1h, disciplina2);
        NotaTrabalho nota43 = new NotaTrabalho(41, 6.0, aluno3, trabalho2h, disciplina2);

        RendimentoEscolar r5 = new RendimentoEscolar(5, aluno3, turma1, disciplina1, 10.0, 8.0, trabalho1m, nota13, trabalho2m, nota23, 5.0, 7.6);
        RendimentoEscolar r6 = new RendimentoEscolar(6, aluno3, turma1, disciplina2, 4.0, 7.0, trabalho1h, nota33, trabalho2h, nota43, 7.5, 6.1);

        rendimentoAluno1.add(r5);
        rendimentoAluno1.add(r6);

        Disciplina disciplina3 = new Disciplina(3, "Física", "Ementa de Física");
        Disciplina disciplina4 = new Disciplina(4, "Química", "Ementa de Química");
    
        Trabalho trabalho1f = new Trabalho(5, "Trabalho 1", disciplinas.get(2));
        Trabalho trabalho2f = new Trabalho(6, "Trabalho 2", disciplinas.get(2));

        Trabalho trabalho1q = new Trabalho(7, "Trabalho 1", disciplinas.get(3));
        Trabalho trabalho2q = new Trabalho(8, "Trabalho 2", disciplinas.get(3));

        Turma turma2 = new Turma(2, 6, new Disciplina[] { disciplinas.get(2), disciplinas.get(3) },
                new Professor[] { professores.get(2), professores.get(3) },
                new Aluno[] { alunos.get(3), alunos.get(4), alunos.get(5) });

        Aluno aluno4 = new Aluno(4, "Tiago", LocalDate.of(1994, 3, 5), "123453", "987651", 20201004);
        NotaTrabalho nota14 = new NotaTrabalho(14, 9.0, aluno4, trabalho1f, disciplina3);
        NotaTrabalho nota24 = new NotaTrabalho(24, 8.0, aluno4, trabalho2f, disciplina3);
        NotaTrabalho nota34 = new NotaTrabalho(34, 10.0, aluno4, trabalho1q, disciplina4);
        NotaTrabalho nota44 = new NotaTrabalho(44, 5.0, aluno4, trabalho2q, disciplina4);

        RendimentoEscolar r7 = new RendimentoEscolar(7, aluno4, turma2, disciplina3, 9.0, 8.0, trabalho1f, nota14, trabalho2f, nota24, 8.5, 8.5);
        RendimentoEscolar r8 = new RendimentoEscolar(8, aluno4, turma2, disciplina4, 3.0, 6.0, trabalho1q, nota34, trabalho2q, nota44, 7.5, 5.5);

        rendimentoAluno1.add(r7);
        rendimentoAluno1.add(r8);

        Aluno aluno5 = new Aluno(5, "João", LocalDate.of(1995, 2, 25), "123452", "987655", 20201005);
        NotaTrabalho nota15 = new NotaTrabalho(15, 2.0, aluno5, trabalho1f, disciplina3);
        NotaTrabalho nota25 = new NotaTrabalho(25, 6.0, aluno5, trabalho2f, disciplina3);
        NotaTrabalho nota35 = new NotaTrabalho(35, 7.0, aluno5, trabalho1q, disciplina4);
        NotaTrabalho nota45 = new NotaTrabalho(45, 7.0, aluno5, trabalho2q, disciplina4);

        RendimentoEscolar r9 = new RendimentoEscolar(9, aluno5, turma2, disciplina3, 8.0, 2.0, trabalho1f, nota15, trabalho2f, nota25, 4.0, 4.6);
        RendimentoEscolar r10 = new RendimentoEscolar(10, aluno5, turma2, disciplina4, 9.0, 7.0, trabalho1q, nota35, trabalho2q, nota45, 7.0, 7.6);

        rendimentoAluno1.add(r9);
        rendimentoAluno1.add(r10);

        Aluno aluno6 = new Aluno(6, "Gabriel", LocalDate.of(1996, 4, 15), "123451", "987656", 20201006);
        NotaTrabalho nota16 = new NotaTrabalho(16, 8.0, aluno6, trabalho1f, disciplina3);
        NotaTrabalho nota26 = new NotaTrabalho(26, 4.0, aluno6, trabalho2f, disciplina3);
        NotaTrabalho nota36 = new NotaTrabalho(36, 10.0, aluno6, trabalho1q, disciplina4);
        NotaTrabalho nota46 = new NotaTrabalho(46, 9.0, aluno6, trabalho2q, disciplina4);

        RendimentoEscolar r11 = new RendimentoEscolar(11, aluno6, turma2, disciplina3, 4.0, 9.0, trabalho1f, nota16, trabalho2f, nota26, 6.0, 6.3);
        RendimentoEscolar r12 = new RendimentoEscolar(12, aluno6, turma2, disciplina4, 10.0, 8.0, trabalho1q, nota36, trabalho2q, nota46, 9.5, 9.1);

        rendimentoAluno1.add(r11);
        rendimentoAluno1.add(r12);
    }

    public RendimentoEscolarFakeDB(){
        super();
        rendimentoAluno1 = new ArrayList<>();
    }

    public void imprimirRendimentoAluno1() {
        for (RendimentoEscolar rendimento : rendimentoAluno1) {
            rendimento.Imprimir();
        }
    }
    
}
