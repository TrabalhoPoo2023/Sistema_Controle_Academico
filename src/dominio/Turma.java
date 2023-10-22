package dominio;

public class Turma extends BaseIdentificador{
    
    private int capacidadeTurma;
    private Disciplina disciplina;
    private Professor professor;


    
public Turma(int codigo, int capacidadeTurma, Disciplina disciplina,Professor professor) {
        super(codigo);
        this.capacidadeTurma = capacidadeTurma;
        this.disciplina = disciplina;
        this.professor = professor;
    }
@Override
public void Imprimir(){
    System.out.println("*************************");
    System.out.println("Cod: "+this.codigo);
    System.out.println("Capacidade total de alunos: "+this.capacidadeTurma);
    System.out.println("Disciplina: "+this.disciplina.nome);
    System.out.println("Professor: "+ this.professor);
}

    public int getCapacidadeTurma() {
        return capacidadeTurma;
    }
 
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public Professor getProfessor() {
        return professor;
    }


    public void setCapacidadeTurma(int capacidadeTurma) {
        this.capacidadeTurma = capacidadeTurma;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public void setProfessor(Professor professor) {
        this.professor= professor;
    }
}