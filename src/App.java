
import dominio.Aluno;
import dominio.Disciplina;
import dominio.NotaTrabalho;
import dominio.Professor;
import dominio.Trabalho;
import dominio.Turma;

import repositorio.AlunoRepositorio;
import repositorio.DisciplinaRepositorio;
import repositorio.NotaTrabalhoRepositorio;
import repositorio.ProfessorRepositorio;
import repositorio.TrabalhoRepositorio;
import repositorio.TurmaRepositorio;


public class App {
    public static void main(String[] args) throws Exception {


        AlunoRepositorio repo = new AlunoRepositorio();
         for (Aluno aluno : repo.ReadAll()) {
             System.out.println("-----------------------------------");
             aluno.Imprimir();

         }

        DisciplinaRepositorio repo1 = new DisciplinaRepositorio();
         for (Disciplina disciplina : repo1.ReadAll()) {
             System.out.println("-----------------------------------");
             disciplina.Imprimir();

         }

         NotaTrabalhoRepositorio repo2 = new NotaTrabalhoRepositorio();
         for (NotaTrabalho notaTrabalho : repo2.ReadAll()) {
             System.out.println("-----------------------------------");
             notaTrabalho.Imprimir();

         }
        }
    }


       
       //Area de teste do metodo Imprimir()
       
        /*Aluno a = new Aluno(00001, "Bruno", LocalDate.of(1997,10,13), "bGon666", "hello123", 5);
        a.Imprimir();

       Professor p = new Professor(00002, "Anderson", LocalDate.of(1986,05,10), "andXmaster.009", "**********", "contratado");
        p.Imprimir();

        Disciplina d = new Disciplina(667, "Modelagem de Dados", null);
        d.Imprimir();

        Turma tm = new Turma(87, 20);
        tm.Imprimir();

        Trabalho t = new Trabalho(0023, "Responda o questionário enviado por email", d);
        t.Imprimir();

        NotaTrabalho nt = new NotaTrabalho(56985, 6.5, a, null);
        nt.Imprimir();*/


        /*Area Teste Impressão FakeDB
        
import java.util.ArrayList;
import dominio.Aluno;
import dominio.Disciplina;
import dominio.NotaTrabalho;
import dominio.Professor;
import dominio.RendimentoEscolar;
import dominio.Trabalho;
import dominio.Turma;
import fakeDB.AlunoFakeDB;
import fakeDB.DisciplinaFakeDB;
import fakeDB.NotaTrabalhoFakeDB;
import fakeDB.ProfessorFakeDB;
import fakeDB.RendimentoEscolarFakeDB;
import fakeDB.TrabalhoFakeDB;
import fakeDB.TurmaFakeDB;

public class App {
    public static void main(String[] args) throws Exception {
        // FakeDB de Professores
        ProfessorFakeDB professorFakeDB = new ProfessorFakeDB();
        ArrayList<Professor> professores = professorFakeDB.getTabela();
        System.out.println("Professores:");
        for (Professor professor : professores) {
            System.out.println("*************************");
            System.out.println("Código: " + professor.getCodigo());
            System.out.println("Nome: " + professor.getNome());
            System.out.println("Data de Nascimento: " + professor.getDataNascimento());
            System.out.println("Nome de Usuário: " + professor.getNomeUsuario());
            System.out.println("Senha: " + professor.getSenha());
            System.out.println("Cargo: " + professor.getCargo());
        }

        // FakeDB de Alunos
        AlunoFakeDB alunoFakeDB = new AlunoFakeDB();
        ArrayList<Aluno> alunos = alunoFakeDB.getTabela();
        System.out.println("\nAlunos:");
        for (Aluno aluno : alunos) {
            System.out.println("*************************");
            System.out.println("Código: " + aluno.getCodigo());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
            System.out.println("Nome de Usuário: " + aluno.getNomeUsuario());
            System.out.println("Senha: " + aluno.getSenha());
            System.out.println("Período: " + aluno.getPeriodo());
        }

        // FakeDB de Disciplina
        DisciplinaFakeDB disciplinaFakeDB = new DisciplinaFakeDB();
        ArrayList<Disciplina> disciplinas = disciplinaFakeDB.getTabela();
        System.out.println("\nDisciplinas:");
        for (Disciplina disciplina : disciplinas) {
            System.out.println("*************************");
            System.out.println("Código: " + disciplina.getCodigo());
            System.out.println("Nome: " + disciplina.getNome());
            System.out.println("Ementa: " + disciplina.getEmenta());
        }

        // FakeDB de Turma
        TurmaFakeDB turmaFakeDB = new TurmaFakeDB();
        ArrayList<Turma> turmas = turmaFakeDB.getTabela();
        System.out.println("\nTurmas:");
        for (Turma turma : turmas) {
            System.out.println("*************************");
            System.out.println("Código: " + turma.getCodigo());
            System.out.println("Capacidade Total de Alunos: " + turma.getCapacidadeTurma());
            System.out.println("Disciplina: " + turma.getDisciplina().getNome());
            System.out.println("Professor: " + turma.getProfessor().getNome());
        }

           // FakeDB de Trabalho
        TrabalhoFakeDB trabalhoFakeDB = new TrabalhoFakeDB();
        ArrayList<Trabalho> trabalhos = trabalhoFakeDB.getTabela();
        System.out.println("\nTrabalhos:");
        for (Trabalho trabalho : trabalhos) {
            System.out.println("*************************");
            System.out.println("Código: " + trabalho.getCodigo());
            System.out.println("Descrição: " + trabalho.getDescricao());
            System.out.println("Disciplina: " + trabalho.getDisciplina().getNome());
        }

        // FakeDB de NotaTrabalho
        NotaTrabalhoFakeDB notaTrabalhoFakeDB = new NotaTrabalhoFakeDB();
        ArrayList<NotaTrabalho> notasTrabalho = notaTrabalhoFakeDB.getTabela();
        System.out.println("\nNotas Trabalhos:");
        for (NotaTrabalho notaTrabalho : notasTrabalho) {
            System.out.println("*************************");
            System.out.println("Código: " + notaTrabalho.getCodigo());
            System.out.println("Nota: " + notaTrabalho.getNota());
            System.out.println("Aluno: " + notaTrabalho.getAluno().getNome());
            System.out.println("Trabalho: " + notaTrabalho.getTrabalho().getDescricao());
        }

        // FakeDB de RendimentoEscolar
        RendimentoEscolarFakeDB rendimentoEscolarFakeDB = new RendimentoEscolarFakeDB();
        ArrayList<RendimentoEscolar> rendimentos = rendimentoEscolarFakeDB.getTabela();
        System.out.println("\nRendimento Escolar:");
        for (RendimentoEscolar rendimento : rendimentos) {
            System.out.println("*************************");
            System.out.println("Aluno: " + rendimento.getAluno().getNome());
            System.out.println("Turma: " + rendimento.getTurma().getCodigo());
            System.out.println("Nota 1ª Prova: " + rendimento.getNota1());
            System.out.println("Nota 2ª Prova: " + rendimento.getNota2());
            System.out.println("Trabalhos: ");
            
            // Imprimindo as notas de trabalho
            for (NotaTrabalho notaTrabalho : rendimento.getTrabalhos()) {
                System.out.println("  Código Trabalho: " + notaTrabalho.getTrabalho().getCodigo());
                System.out.println("  Descrição Trabalho: " + notaTrabalho.getTrabalho().getDescricao());
                System.out.println("  Nota Trabalho: " + notaTrabalho.getNota());
            }
            
            System.out.println("Média Trabalhos: " + rendimento.getMediaTrabalhos());
            System.out.println("Média Geral: " + rendimento.getMediaGeral());
        }
    }
}*/

