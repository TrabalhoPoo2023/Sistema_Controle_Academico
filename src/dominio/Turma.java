package dominio;

public class Turma extends BaseIdentificador {

    private int capacidadeTurma;
    private Disciplina[] disciplinas;
    private Professor[] professores;
    private Aluno[] alunos;

    public Turma(int codigo, int capacidadeTurma, Aluno[] alunos, Disciplina[] disciplinas, Professor[] professores) {
        super(codigo);
        this.capacidadeTurma = capacidadeTurma;
        this.alunos = alunos;
        this.disciplinas = disciplinas;
        this.professores = professores;
    }

    public Turma(int codigo) {
        super(codigo);
    }

    public int getCapacidadeTurma() {
        return capacidadeTurma;
    }

    public void setCapacidadeTurma(int capacidadeTurma) {
        this.capacidadeTurma = capacidadeTurma;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    @Override
    public void Imprimir() {
        System.out.println("*************************");
        System.out.println("Código: " + this.codigo);
        System.out.println("Capacidade total de alunos: " + this.capacidadeTurma);
        System.out.println("Disciplinas: ");
        for (Disciplina disciplina : disciplinas) {
            System.out.println("- " + disciplina.getNome());
        }
        System.out.println("Professores: ");
        for (Professor professor : professores) {
            System.out.println("- " + professor.getNome());
        }
        System.out.println("Alunos: ");
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome());
        }
    }
}
