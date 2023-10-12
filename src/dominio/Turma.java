package dominio;
import java.util.List;
public class Turma extends BaseIdentificador{
    
    private int capacidadeTurma;
    private List<Aluno> alunos;
    private Disciplina disciplina;
    private Professor professor;


    public Turma(int codigo, int capacidadeTurma) {
        super(codigo);
        this.capacidadeTurma = capacidadeTurma;
    }
@Override
public void Imprimir(){
    System.out.println("*************************");
    System.out.println("Cod: "+this.codigo);
    System.out.println("Capacidade total de alunos: "+this.capacidadeTurma);
    System.out.println("Alunos: "+this.alunos);
    System.out.println("Disciplina: "+this.disciplina.nome);
    System.out.println("Professor: "+ this.professor.nome);
}

    public Turma(int codigo, int capacidadeTurma, Disciplina disciplina, Professor professor) {
        super(codigo);
        this.capacidadeTurma = capacidadeTurma;
        this.disciplina = disciplina;
        this.professor = professor;
    }


    public int getCapacidadeTurma() {
        return capacidadeTurma;
    }
    public List<Aluno> getAlunos() {
        return alunos;
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public Professor getProfessores() {
        return professor;
    }



    public void setCapacidadeTurma(int capacidadeTurma) {
        this.capacidadeTurma = capacidadeTurma;
    }
    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public void setProfessores(Professor professor) {
        this.professor = professor;
    }
}
