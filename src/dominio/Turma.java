package dominio;

import java.util.ArrayList;

public class Turma extends BaseIdentificador{
    
    private int capacidadeTurma;
    private ArrayList<Disciplina> disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos;


    
public Turma(int codigo, int capacidadeTurma, Disciplina disciplina,Professor professor) {
        super(codigo);
        this.capacidadeTurma = capacidadeTurma;
        this.disciplina = new ArrayList<Disciplina>();
        this.professor = new Professor();
        this.alunos = new ArrayList<Aluno>();
    }

public Turma() {
}

public Turma(int codigo) {
    super(codigo);
}

@Override
public void Imprimir(){
    System.out.println("*************************");
    System.out.println("Cod: "+this.codigo);
    System.out.println("Capacidade total de alunos: "+this.capacidadeTurma);
    System.out.println("Disciplina: "+this.disciplina);
    System.out.println("Professor: "+ this.professor.nome);
}

    public int getCapacidadeTurma() {
        return capacidadeTurma;
    }
 
    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }
    public Professor getProfessor() {
        return professor;
    }
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setCapacidadeTurma(int capacidadeTurma) {
        this.capacidadeTurma = capacidadeTurma;
    }

    public void setDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }
    public void setProfessor(Professor professor) {
        this.professor= professor;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos= alunos;
    }
}
