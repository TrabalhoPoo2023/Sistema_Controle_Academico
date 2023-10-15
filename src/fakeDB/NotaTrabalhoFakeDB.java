package fakeDB;

import dominio.NotaTrabalho;

import java.util.ArrayList;
import java.util.List;

public class NotaTrabalhoFakeDB {
    private List<NotaTrabalho> notasTrabalho;

    public NotaTrabalhoFakeDB() {
        notasTrabalho = new ArrayList<>();
        carregarDados();
    }

    private void carregarDados() {
        notasTrabalho.add(new NotaTrabalho(1, 8.5, AlunoFakeDB.buscarAlunoPorCodigo(1), TrabalhoFakeDB.buscarTrabalhoPorCodigo(1)));
        notasTrabalho.add(new NotaTrabalho(2, 7.0, AlunoFakeDB.buscarAlunoPorCodigo(2), TrabalhoFakeDB.buscarTrabalhoPorCodigo(2)));
        notasTrabalho.add(new NotaTrabalho(3, 9.0, AlunoFakeDB.buscarAlunoPorCodigo(3), TrabalhoFakeDB.buscarTrabalhoPorCodigo(3)));
        notasTrabalho.add(new NotaTrabalho(4, 6.5, AlunoFakeDB.buscarAlunoPorCodigo(4), TrabalhoFakeDB.buscarTrabalhoPorCodigo(4)));
        notasTrabalho.add(new NotaTrabalho(5, 8.0, AlunoFakeDB.buscarAlunoPorCodigo(5), TrabalhoFakeDB.buscarTrabalhoPorCodigo(5)));
    }

    public List<NotaTrabalho> listarNotasTrabalho() {
        return notasTrabalho;
    }

    public NotaTrabalho buscarNotaTrabalhoPorCodigo(int codigo) {
        for (NotaTrabalho notaTrabalho : notasTrabalho) {
            if (notaTrabalho.getCodigo() == codigo) {
                return notaTrabalho;
            }
        }
        return null;
    }

    public void adicionarNotaTrabalho(NotaTrabalho notaTrabalho) {
        notasTrabalho.add(notaTrabalho);
    }

    public void atualizarNotaTrabalho(NotaTrabalho notaTrabalho) {
        for (int i = 0; i < notasTrabalho.size(); i++) {
            if (notasTrabalho.get(i).getCodigo() == notaTrabalho.getCodigo()) {
                notasTrabalho.set(i, notaTrabalho);
                break;
            }
        }
    }

    public void removerNotaTrabalho(int codigo) {
        NotaTrabalho notaTrabalhoParaRemover = null;
        for (NotaTrabalho notaTrabalho : notasTrabalho) {
            if (notaTrabalho.getCodigo() == codigo) {
                notaTrabalhoParaRemover = notaTrabalho;
                break;
            }
        }
        if (notaTrabalhoParaRemover != null) {
            notasTrabalho.remove(notaTrabalhoParaRemover);
        }
    }
}
