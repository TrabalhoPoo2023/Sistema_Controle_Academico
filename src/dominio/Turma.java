package dominio;

public class Turma extends BaseIdentificador {

    private int capacidadeTurma;
    private Disciplina[] disciplinas;
    private Professor[] professores;
    private Aluno[] alunos;

    public Turma(int codigo, int capacidadeTurma, Disciplina[] disciplinas, Professor[] professores, Aluno[] alunos) {
        super(codigo);
        this.capacidadeTurma = capacidadeTurma;
        this.disciplinas = disciplinas;
        this.professores = professores;
        this.alunos = alunos;
    }

    public Turma(int codigo) {
        super(codigo);
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

    public int getCapacidadeTurma() {
        return capacidadeTurma;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setCapacidadeTurma(int capacidadeTurma) {
        this.capacidadeTurma = capacidadeTurma;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}