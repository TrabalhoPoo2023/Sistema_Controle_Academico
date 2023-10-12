package dominio;

import java.time.LocalDate;

public class Aluno extends BasePessoa {

    private int periodo;
    private Turma turma;

    public Aluno(int codigo, String nome, LocalDate dataNascimento, String nomeUsuario, String senha, int periodo, Turma turma) {
        super(codigo, nome, dataNascimento, nomeUsuario, senha);
        this.periodo = periodo;
        this.turma = turma;
    }


    public int getPeriodo() {
        return periodo;
    }

    public Turma getTurma() {
        return turma;
    }

    
 
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

//metodo utilizado para testes, apenas para impressão

    @Override
    public String toString() {
        return super.toString() +"Aluno [periodo=" + periodo + ", turma=" + turma + "]";
    }
  
}
