package fakeDB;

import dominio.NotaTrabalho;
import dominio.Aluno;
import dominio.Disciplina;
import dominio.Trabalho;
import java.util.ArrayList;
import java.util.List;

public class NotaTrabalhoFakeDB extends BaseGenericaFakeDB<NotaTrabalho> {
    private List<NotaTrabalho> notasa1;
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

        notasa1 = new ArrayList<>();
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

        notasa1.add(nota1);
        notasa1.add(nota2);
        notasa1.add(nota3);
        notasa1.add(nota4);
    }

    public void imprimirNotas() {
        for (NotaTrabalho nota : notasa1) {
            nota.Imprimir(); 
        }
    }

    public List<NotaTrabalho> getNotas() {
        return notasa1;
    }
}
