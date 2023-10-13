// Precisa de modificações! Aguardando Dominio RendimentoEscolar
package fakeDB;

import dominio.*;

import java.util.ArrayList;

public class RendimentoEscolarFakeDB extends BaseGenericaFakeDB<RendimentoEscolar> {

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<RendimentoEscolar>();
        
        AlunoFakeDB alunoFakeDB = new AlunoFakeDB();
        TurmaFakeDB turmaFakeDB = new TurmaFakeDB();
        NotaTrabalhoFakeDB notaTrabalhoFakeDB = new NotaTrabalhoFakeDB();

        Aluno aluno1 = alunoFakeDB.Selecionar(1);
        Turma turma1 = turmaFakeDB.Selecionar(1);

        RendimentoEscolar rendimento1 = new RendimentoEscolar(aluno1, turma1, 7.5, 8.0);
        rendimento1.setTrabalhos(notaTrabalhoFakeDB.SelecionarPorAluno(aluno1));
        rendimento1.calcularMediaGeral();

        Aluno aluno2 = alunoFakeDB.Selecionar(2);
        Turma turma2 = turmaFakeDB.Selecionar(2);

        RendimentoEscolar rendimento2 = new RendimentoEscolar(aluno2, turma2, 8.0, 9.0);
        rendimento2.setTrabalhos(notaTrabalhoFakeDB.SelecionarPorAluno(aluno2));
        rendimento2.calcularMediaGeral();

        this.tabela.add(rendimento1);
        this.tabela.add(rendimento2);
    }

    public RendimentoEscolarFakeDB() {
        super();
    }
}
