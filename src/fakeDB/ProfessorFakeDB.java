package fakeDB;

import dominio.Professor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProfessorFakeDB {
    private static List<Professor> professores;

    public ProfessorFakeDB() {
        professores = new ArrayList<>();
        carregarDados();
    }

    private void carregarDados() {
        professores.add(new Professor(1, "João Silva", LocalDate.of(1980, 5, 15), "joao123", "senha123", "Professor"));
        professores.add(new Professor(2, "Maria Santos", LocalDate.of(1975, 9, 30), "maria456", "senha456", "Professora"));
        professores.add(new Professor(3, "Pedro Mendes", LocalDate.of(1985, 3, 10), "pedro789", "senha789", "Professor"));
        professores.add(new Professor(4, "Luana Lima", LocalDate.of(1978, 12, 5), "luana321", "senha321", "Professora"));
        professores.add(new Professor(5, "Rafael Sousa", LocalDate.of(1982, 6, 20), "rafael654", "senha654", "Professor"));
    }

    public List<Professor> listarProfessores() {
        return professores;
    }

    public static Professor buscarProfessorPorCodigo(int codigo) {
        for (Professor professor : professores) {
            if (professor.getCodigo() == codigo) {
                return professor;
            }
        }
        return null;
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void atualizarProfessor(Professor professor) {
        for (int i = 0; i < professores.size(); i++) {
            if (professores.get(i).getCodigo() == professor.getCodigo()) {
                professores.set(i, professor);
                break;
            }
        }
    }

    public void removerProfessor(int codigo) {
        Professor professorParaRemover = null;
        for (Professor professor : professores) {
            if (professor.getCodigo() == codigo) {
                professorParaRemover = professor;
                break;
            }
        }
        if (professorParaRemover != null) {
            professores.remove(professorParaRemover);
        }
    }
}
