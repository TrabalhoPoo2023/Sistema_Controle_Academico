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
        Trabalho trabalho1m = new Trabalho(1, "Trabalho 1", disciplina1);
        Trabalho trabalho2m = new Trabalho(2, "Trabalho 2", disciplina1);

        NotaTrabalho nota1 = new NotaTrabalho(1, 9.5, aluno1, trabalho1m, disciplina1);
        NotaTrabalho nota2 = new NotaTrabalho(2, 8.0, aluno1, trabalho2m, disciplina1);

        Disciplina disciplina2 = new Disciplina(2, "História", "Ementa de História");
        Trabalho trabalho1h = new Trabalho(3, "Trabalho 1", disciplina2);
        Trabalho trabalho2h = new Trabalho(4, "Trabalho 2", disciplina2);

        NotaTrabalho nota3 = new NotaTrabalho(3, 9.0, aluno1, trabalho1h, disciplina2);
        NotaTrabalho nota4 = new NotaTrabalho(4, 8.0, aluno1, trabalho2h, disciplina2);

        Aluno aluno2 = new Aluno(2, "Lucas", LocalDate.of(1993, 6, 5), "123455", "987653", 20201002);
        NotaTrabalho nota12 = new NotaTrabalho(12, 10.0, aluno2, trabalho1m, disciplina1);
        NotaTrabalho nota22 = new NotaTrabalho(22, 7.0, aluno2, trabalho2m, disciplina1);

        NotaTrabalho nota32 = new NotaTrabalho(32, 8.0, aluno2, trabalho1h, disciplina2);
        NotaTrabalho nota42 = new NotaTrabalho(42, 5.0, aluno2, trabalho2h, disciplina2);

        Aluno aluno3 = new Aluno(3, "Pedro", LocalDate.of(1994, 7, 5), "123454", "987652", 20201003);
        NotaTrabalho nota13 = new NotaTrabalho(13, 1.0, aluno3, trabalho1m, disciplina1);
        NotaTrabalho nota23 = new NotaTrabalho(23, 9.0, aluno3, trabalho2m, disciplina1);

        NotaTrabalho nota33 = new NotaTrabalho(33, 9.0, aluno3, trabalho1h, disciplina2);
        NotaTrabalho nota43 = new NotaTrabalho(43, 6.0, aluno3, trabalho2h, disciplina2);

        Aluno aluno4 = new Aluno(4, "Tiago", LocalDate.of(1994, 3, 5), "123453", "987651", 20201004);
        Disciplina disciplina3 = new Disciplina(3, "Física", "Ementa de Física");
        Trabalho trabalho1f = new Trabalho(5, "Trabalho 1", disciplina3);
        Trabalho trabalho2f = new Trabalho(6, "Trabalho 2", disciplina3);

        NotaTrabalho nota14 = new NotaTrabalho(14, 9.0, aluno4, trabalho1f, disciplina3);
        NotaTrabalho nota24 = new NotaTrabalho(24, 8.0, aluno4, trabalho2f, disciplina3);

        Disciplina disciplina4 = new Disciplina(4, "Química", "Ementa de Química");
        Trabalho trabalho1q = new Trabalho(7, "Trabalho 1", disciplina4);
        Trabalho trabalho2q = new Trabalho(8, "Trabalho 2", disciplina4);

        NotaTrabalho nota34 = new NotaTrabalho(34, 10.0, aluno4, trabalho1q, disciplina4);
        NotaTrabalho nota44 = new NotaTrabalho(44, 5.0, aluno4, trabalho2q, disciplina4);

        Aluno aluno5 = new Aluno(5, "João", LocalDate.of(1995, 2, 25), "123452", "987655", 20201005);
        NotaTrabalho nota15 = new NotaTrabalho(15, 2.0, aluno5, trabalho1f, disciplina3);
        NotaTrabalho nota25 = new NotaTrabalho(25, 6.0, aluno5, trabalho2f, disciplina3);

        NotaTrabalho nota35 = new NotaTrabalho(35, 7.0, aluno5, trabalho1q, disciplina4);
        NotaTrabalho nota45 = new NotaTrabalho(45, 7.0, aluno5, trabalho2q, disciplina4);

        Aluno aluno6 = new Aluno(6, "Gabriel", LocalDate.of(1996, 4, 15), "123451", "987656", 20201006);
        NotaTrabalho nota16 = new NotaTrabalho(16, 8.0, aluno6, trabalho1f, disciplina3);
        NotaTrabalho nota26 = new NotaTrabalho(26, 4.0, aluno6, trabalho2f, disciplina3);

        NotaTrabalho nota36 = new NotaTrabalho(36, 10.0, aluno6, trabalho1q, disciplina4);
        NotaTrabalho nota46 = new NotaTrabalho(46, 9.0, aluno6, trabalho2q, disciplina4);

        // Chame o método Imprimir para imprimir as notas
        nota1.Imprimir();
        nota2.Imprimir();
        nota3.Imprimir();
        nota4.Imprimir();
        nota12.Imprimir();
        nota22.Imprimir();
        nota32.Imprimir();
        nota42.Imprimir();
        nota13.Imprimir();
        nota23.Imprimir();
        nota33.Imprimir();
        nota43.Imprimir();
        nota14.Imprimir();
        nota24.Imprimir();
        nota34.Imprimir();
        nota44.Imprimir();
        nota15.Imprimir();
        nota25.Imprimir();
        nota35.Imprimir();
        nota45.Imprimir();
        nota16.Imprimir();
        nota26.Imprimir();
        nota36.Imprimir();
        nota46.Imprimir();
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


