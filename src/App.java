//----------------------FAKEDB

//TESTE IMPRESSÃO NOTAS DE TRABALHO
/*import java.time.LocalDate;

import dominio.Aluno;
import dominio.Disciplina;
import dominio.NotaTrabalho;
import dominio.Trabalho;

public class App {
    public static void main(String[] args) {
        // Crie algumas instâncias de Aluno, Trabalho, Disciplina e NotaTrabalho
        Aluno aluno1 = new Aluno(1, "Mateus", LocalDate.of(1994, 6, 5), "123456", "987654", 20201001); 
        Disciplina disciplina1 = new Disciplina(1, "Matemática", "Ementa de Matemática");
        Trabalho trabalho1 = new Trabalho(1, "Trabalho 1", disciplina1);
        Trabalho trabalho2m = new Trabalho(2, "Trabalho 2", disciplina1);

        NotaTrabalho nota1 = new NotaTrabalho(1, 9.5, aluno1, trabalho1, disciplina1);
        NotaTrabalho nota2 = new NotaTrabalho(2, 8.0, aluno1, trabalho2m, disciplina1);

        Disciplina disciplina2 = new Disciplina(2, "História", "Ementa de História");
        Trabalho trabalho1h = new Trabalho(3, "Trabalho 1", disciplina2);
        Trabalho trabalho2h = new Trabalho(4, "Trabalho 2", disciplina2);

        NotaTrabalho nota3 = new NotaTrabalho(3, 9.0, aluno1, trabalho1h, disciplina2);
        NotaTrabalho nota4 = new NotaTrabalho(4, 8.0, aluno1, trabalho2h, disciplina2);

        // Chame o método Imprimir para imprimir as notas
        nota1.Imprimir();
        nota2.Imprimir();
        nota3.Imprimir();
        nota4.Imprimir();
    }
}


/*import fakeDB.TrabalhoFakeDB;

public class App {
    public static void main(String[] args) {
        TrabalhoFakeDB trabalhoDB = new TrabalhoFakeDB();
        trabalhoDB.CarregarDados(); // Carrega os dados dos trabalhos

        trabalhoDB.ImprimirTrabalhos(); // Imprime as informações dos trabalhos
    }
}


/*public class App {
public static void main(String[] args) {
    TurmaFakeDB turmaDB = new TurmaFakeDB();
    turmaDB.CarregarDados(); // Carrega os dados das turmas

    // Imprime as informações das turmas
    turmaDB.ImprimirTurmas();
}
}

// Teste FakeDB

// ALUNOS
// import java.util.List;

// import dominio.Aluno;
// import fakeDB.AlunoFakeDB;

// public class App {
//     public static void main(String[] args) {
//         AlunoFakeDB alunoDB = new AlunoFakeDB();
//         alunoDB.CarregarDados(); // Carrega os dados dos alunos

//         // Obtém a lista de alunos
//         List<Aluno> alunos = alunoDB.getAlunos();

//         // Percorre a lista e imprime os dados de cada aluno
//         for (Aluno aluno : alunos) {
//             System.out.println("Código: " + aluno.getCodigo());
//             System.out.println("Nome: " + aluno.getNome());
//             System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
//             System.out.println("Usuario: "+ aluno.getNomeUsuario());
//             System.out.println("Senha: "+ aluno.getSenha());
//             System.out.println("Periodo: "+ aluno.getPeriodo());
//             System.out.println();
//         }
//     }
// }

// PROFESSORES
// import java.util.List;

// import dominio.Professor;
// import fakeDB.ProfessorFakeDB;

// public class App {
//     public static void main(String[] args) {
//         ProfessorFakeDB professorDB = new ProfessorFakeDB();
//         professorDB.CarregarDados(); // Carrega os dados dos professores

//         // Obtém a lista de professores
//         List<Professor> professores = professorDB.getProfessores();

//         // Percorre a lista e imprime os dados de cada professor
//         for (Professor professor : professores) {
//             System.out.println("Código: " + professor.getCodigo());
//             System.out.println("Nome: " + professor.getNome());
//             System.out.println("Data de Nascimento: " + professor.getDataNascimento());
//             System.out.println("Usuário: " + professor.getNomeUsuario());
//             System.out.println("Senha: " + professor.getSenha());
//             System.out.println("Cargo: " + professor.getCargo());
//             System.out.println();
//         }
//     }
// }

// DISCIPLINAS
// import java.util.List;

// import dominio.Disciplina;
// import fakeDB.DisciplinaFakeDB;

// public class App {
//     public static void main(String[] args) {
//         DisciplinaFakeDB disciplinaDB = new DisciplinaFakeDB();
//         disciplinaDB.CarregarDados(); // Carrega os dados das disciplinas

//         // Obtém a lista de disciplinas
//         List<Disciplina> disciplinas = disciplinaDB.getDisciplinas();

//         // Percorre a lista e imprime os dados de cada disciplina
//         for (Disciplina disciplina : disciplinas) {
//             System.out.println("Código: " + disciplina.getCodigo());
//             System.out.println("Nome: " + disciplina.getNome());
//             System.out.println("Ementa: " + disciplina.getEmenta());
//             System.out.println();
//         }
//     }
// }

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


