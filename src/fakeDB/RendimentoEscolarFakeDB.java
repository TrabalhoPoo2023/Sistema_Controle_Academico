package fakeDB;

import dominio.Aluno;
import dominio.NotaTrabalho;
import dominio.RendimentoEscolar;
import dominio.Turma;

import java.util.ArrayList;
import java.util.List;

public class RendimentoEscolarFakeDB extends BaseGenericaFakeDB<RendimentoEscolar> {

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<RendimentoEscolar>();

        AlunoFakeDB alunoFakeDB = new AlunoFakeDB();
        TurmaFakeDB turmaFakeDB = new TurmaFakeDB();
        NotaTrabalhoFakeDB notaTrabalhoFakeDB = new NotaTrabalhoFakeDB();

        Aluno aluno1 = alunoFakeDB.Selecionar(1);
        Turma turma1 = turmaFakeDB.Selecionar(1);

        List<NotaTrabalho> trabalhosAluno1 = notaTrabalhoFakeDB.SelecionarPorAluno(aluno1);
        RendimentoEscolar rendimento1 = new RendimentoEscolar(aluno1, turma1, 7.5, 8.0, trabalhosAluno1, 0.0, 0.0);
        rendimento1.CalculoMediaTrabalho(trabalhosAluno1);
        rendimento1.CalculoMediaGeral(0, 0, 0);

        Aluno aluno2 = alunoFakeDB.Selecionar(2);
        Turma turma2 = turmaFakeDB.Selecionar(2);

        List<NotaTrabalho> trabalhosAluno2 = notaTrabalhoFakeDB.SelecionarPorAluno(aluno2);
        RendimentoEscolar rendimento2 = new RendimentoEscolar(aluno2, turma2, 8.0, 9.0, trabalhosAluno2, 0.0, 0.0);
        rendimento2.CalculoMediaTrabalho(trabalhosAluno2);
        rendimento2.CalculoMediaGeral(0, 0, 0);

        this.tabela.add(rendimento1);
        this.tabela.add(rendimento2);
    }

    public RendimentoEscolarFakeDB() {
        super();
    }
}