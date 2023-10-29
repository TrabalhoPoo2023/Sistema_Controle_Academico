package fakeDB;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dominio.Professor;

public class ProfessorFakeDB extends BaseGenericaFakeDB<Professor> {
    private List<Professor> professores;

    @Override
    protected void CarregarDados() {
        
        Professor prof1 = new Professor(1, "João", LocalDate.of(1980, 5, 10), "joao123", "senha123", "Professor de Matemática");
        Professor prof2 = new Professor(2, "Maria", LocalDate.of(1975, 7, 15), "maria456", "senha456", "Professor de História");
        Professor prof3 = new Professor(3, "José", LocalDate.of(1985, 3, 20), "jose789", "senha789", "Professor de Física");
        Professor prof4 = new Professor(4, "Ana", LocalDate.of(1989, 2, 5), "ana189", "senha189", "Professor de Química");
    
        professores = new ArrayList<>();
        professores.add(prof1);
        professores.add(prof2);
        professores.add(prof3);
        professores.add(prof4);
    }

    public ProfessorFakeDB() {
        super();
    }

    // Método para permitir o acesso à lista de professores
    public List<Professor> getProfessores() {
        return professores;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> d4184ecb340a8d23d4b0601269c43b99bb53f974
