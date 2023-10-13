package fakeDB;

import dominio.Disciplina;
import dominio.Turma;

import java.util.ArrayList;
import java.util.List;

public class DisciplinaFakeDB {
    private static List<Disciplina> disciplinas;

    public DisciplinaFakeDB() {
        disciplinas = new ArrayList<>();
        carregarDados();
    }

    private void carregarDados() {
        Turma turma1 = new Turma(1, 30);
        Turma turma2 = new Turma(2, 25);

        disciplinas.add(new Disciplina(1, "Matemática", "Ementa de Matemática"));
        disciplinas.add(new Disciplina(2, "História", "Ementa de História"));
        disciplinas.add(new Disciplina(3, "Biologia", "Ementa de Biologia"));
        disciplinas.add(new Disciplina(4, "Química", "Ementa de Química"));
        disciplinas.add(new Disciplina(5, "Física", "Ementa de Física"));

        disciplinas.get(0).getTurmas().add(turma1);
        disciplinas.get(1).getTurmas().add(turma1);
        disciplinas.get(2).getTurmas().add(turma2);
        disciplinas.get(3).getTurmas().add(turma2);
        disciplinas.get(4).getTurmas().add(turma1);
    }

    public List<Disciplina> listarDisciplinas() {
        return disciplinas;
    }

    public static Disciplina buscarDisciplinaPorCodigo(int codigo) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getCodigo() == codigo) {
                return disciplina;
            }
        }
        return null;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void atualizarDisciplina(Disciplina disciplina) {
        for (int i = 0; i < disciplinas.size(); i++) {
            if (disciplinas.get(i).getCodigo() == disciplina.getCodigo()) {
                disciplinas.set(i, disciplina);
                break;
            }
        }
    }

    public void removerDisciplina(int codigo) {
        Disciplina disciplinaParaRemover = null;
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getCodigo() == codigo) {
                disciplinaParaRemover = disciplina;
                break;
            }
        }
        if (disciplinaParaRemover != null) {
            disciplinas.remove(disciplinaParaRemover);
        }
    }
}
