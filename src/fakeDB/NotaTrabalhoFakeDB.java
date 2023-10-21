package fakeDB;

import dominio.Aluno;
import dominio.NotaTrabalho;

import java.util.ArrayList;
import java.util.List;

public class NotaTrabalhoFakeDB extends BaseGenericaFakeDB<NotaTrabalho> {

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<NotaTrabalho>();
        tabela.add(new NotaTrabalho(1, 8.5, AlunoFakeDB.buscarAlunoPorCodigo(1), TrabalhoFakeDB.buscarTrabalhoPorCodigo(1)));
        tabela.add(new NotaTrabalho(2, 7.0, AlunoFakeDB.buscarAlunoPorCodigo(2), TrabalhoFakeDB.buscarTrabalhoPorCodigo(2)));
        tabela.add(new NotaTrabalho(3, 9.0, AlunoFakeDB.buscarAlunoPorCodigo(3), TrabalhoFakeDB.buscarTrabalhoPorCodigo(3)));
        tabela.add(new NotaTrabalho(4, 6.5, AlunoFakeDB.buscarAlunoPorCodigo(4), TrabalhoFakeDB.buscarTrabalhoPorCodigo(4)));
        tabela.add(new NotaTrabalho(5, 8.0, AlunoFakeDB.buscarAlunoPorCodigo(5), TrabalhoFakeDB.buscarTrabalhoPorCodigo(5)));
    }

    public NotaTrabalhoFakeDB() {
        super();
    }

    public List<NotaTrabalho> SelecionarPorAluno(Aluno aluno1) {
        return null;
    }
}