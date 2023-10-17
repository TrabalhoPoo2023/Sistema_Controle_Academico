package fakeDB;

import dominio.Professor;
import java.time.LocalDate;
import java.util.ArrayList;

public class ProfessorFakeDB extends BaseGenericaFakeDB<Professor> {

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<Professor>();
        tabela.add(new Professor(1, "João Silva", LocalDate.of(1980, 5, 15), "joao123", "senha123", "Professor"));
        tabela.add(new Professor(2, "Maria Santos", LocalDate.of(1975, 9, 30), "maria456", "senha456", "Professora"));
        tabela.add(new Professor(3, "Pedro Mendes", LocalDate.of(1985, 3, 10), "pedro789", "senha789", "Professor"));
        tabela.add(new Professor(4, "Luana Lima", LocalDate.of(1978, 12, 5), "luana321", "senha321", "Professora"));
        tabela.add(new Professor(5, "Rafael Sousa", LocalDate.of(1982, 6, 20), "rafael654", "senha654", "Professor"));
    }

    public ProfessorFakeDB() {
        super();
    }

    public static Professor buscarProfessorPorCodigo(int i) {
        return null;
    }
}
