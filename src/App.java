//----------------------FAKEDB

// DISCIPLINAS
    /*public static void main(String[] args) {
    DisciplinaFakeDB disciplinaDB = new DisciplinaFakeDB();
    disciplinaDB.CarregarDados();
    disciplinaDB.ImprimirDisciplinas();
}
}

    // PROFESSORES
   /*  public static void main(String[] args) {
        ProfessorFakeDB professorDB = new ProfessorFakeDB();
        professorDB.CarregarDados();
        professorDB.ImprimirProfessores();
    }
    
    }


    // ALUNOS
    /* public static void main(String[] args) {
        AlunoFakeDB alunoFakeDB = new AlunoFakeDB();
        alunoFakeDB.ImprimirAlunos();
    }
}

    
    // RENDIMENTO ESCOLAR
    /* public static void main(String[] args) {
    RendimentoEscolarFakeDB rendimentoEscolarFakeDB = new RendimentoEscolarFakeDB();
    rendimentoEscolarFakeDB.CarregarDados();
    rendimentoEscolarFakeDB.ImprimirRendimentos();
    }
}

   // NOTAS TRABALHOS
    /*public static void main(String[] args) {
    NotaTrabalhoFakeDB notaTrabalhoDB = new NotaTrabalhoFakeDB();
    notaTrabalhoDB.CarregarDados();
    notaTrabalhoDB.imprimirNotas();
}
}
    // TRABALHO
//     public static void main(String[] args) {
//         TrabalhoFakeDB trabalhoFakeDB = new TrabalhoFakeDB();
//         trabalhoFakeDB.ImprimirTrabalhos();
//     }
// }

    // TURMA
/*    public static void main(String[] args) {
        TurmaFakeDB turmaFakeDB = new TurmaFakeDB();
        turmaFakeDB.ImprimirTurmas();
    }


\\---------------------------------- REPOSITORIO

/*import java.util.ArrayList;

import dominio.Aluno;
import dominio.Disciplina;
import dominio.NotaTrabalho;
import dominio.Professor;
import dominio.Trabalho;
import dominio.Turma;
import fakeDB.DisciplinaFakeDB;
import fakeDB.ProfessorFakeDB;
import fakeDB.TurmaFakeDB;
import repositorio.AlunoRepositorio;
import repositorio.DisciplinaRepositorio;
import repositorio.NotaTrabalhoRepositorio;
import repositorio.ProfessorRepositorio;
import repositorio.TrabalhoRepositorio;
import repositorio.TurmaRepositorio;*/
import Menu.Menu;

public class App {
    public static void main(String[] args) throws Exception {

       Menu menu = new Menu();
        menu.Executar();

    }
}

        /*ProfessorFakeDB d1 = new ProfessorFakeDB();
        ArrayList<Professor> professores = d1.getTabela();
        TurmaFakeDB t1 = new TurmaFakeDB();
        ArrayList<Turma> turmas = t1.getTabela();
        int codigo = 1;

            for (Professor professor :professores) {
                if (professor.getCodigo() == codigo,  )
                professor.Imprimir();
            }*/





            //essa parte aqui é pra procura o professor pelo codigo informado, no caso ai eu já deixei um pre definido
            // mas da pra deixar para o usuario colocar o codigo
            /*ProfessorRepositorio repo = new ProfessorRepositorio();
            Professor profselecionado = repo.Read(1);
            String p = profselecionado.getNome();
            //System.out.println(p);
           

           TurmaRepositorio repo1 = new TurmaRepositorio();
            for (Turma turma : repo1.ReadAll()) {
                    turma.Imprimir();
                //System.out.println(p);
                    
                }

                }
                
            }
            

        

        /*AlunoRepositorio repo = new AlunoRepositorio();
         for (Aluno aluno : repo.Read() {
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


