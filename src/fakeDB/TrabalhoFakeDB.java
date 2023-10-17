package fakeDB;

import dominio.Trabalho;

import java.util.ArrayList;
import java.util.List;

public class TrabalhoFakeDB {
    private static List<Trabalho> trabalhos;

    public TrabalhoFakeDB() {
        trabalhos = new ArrayList<>();
        carregarDados();
    }

    private void carregarDados() {
        trabalhos.add(new Trabalho(1, "Trabalho de Matemática", DisciplinaFakeDB.buscarDisciplinaPorCodigo(1)));
        trabalhos.add(new Trabalho(2, "Trabalho de História", DisciplinaFakeDB.buscarDisciplinaPorCodigo(2)));
        trabalhos.add(new Trabalho(3, "Trabalho de Biologia", DisciplinaFakeDB.buscarDisciplinaPorCodigo(3)));
        trabalhos.add(new Trabalho(4, "Trabalho de Química", DisciplinaFakeDB.buscarDisciplinaPorCodigo(4)));
        trabalhos.add(new Trabalho(5, "Trabalho de Física", DisciplinaFakeDB.buscarDisciplinaPorCodigo(5)));
    }

    public List<Trabalho> listarTrabalhos() {
        return trabalhos;
    }

    public static Trabalho buscarTrabalhoPorCodigo(int codigo) {
        for (Trabalho trabalho : trabalhos) {
            if (trabalho.getCodigo() == codigo) {
                return trabalho;
            }
        }
        return null;
    }

    public void adicionarTrabalho(Trabalho trabalho) {
        trabalhos.add(trabalho);
    }

    public void atualizarTrabalho(Trabalho trabalho) {
        for (int i = 0; i < trabalhos.size(); i++) {
            if (trabalhos.get(i).getCodigo() == trabalho.getCodigo()) {
                trabalhos.set(i, trabalho);
                break;
            }
        }
    }

    public void removerTrabalho(int codigo) {
        Trabalho trabalhoParaRemover = null;
        for (Trabalho trabalho : trabalhos) {
            if (trabalho.getCodigo() == codigo) {
                trabalhoParaRemover = trabalho;
                break;
            }
        }
        if (trabalhoParaRemover != null) {
            trabalhos.remove(trabalhoParaRemover);
        }
    }
}
