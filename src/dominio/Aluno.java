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
    public void Imprimir(){
        System.out.println("*************************");
        System.out.println("cod: "+this.codigo);
        System.out.println("Aluno: "+this.nome);
        System.out.println("Data de Nascimento: "+this.dataNascimento);
        System.out.println("Usuario: "+this.nomeUsuario);
        System.out.println("Senha: "+this.senha);
        System.out.println("Periodo: "+this.periodo);
        System.out.println("Turma: "+this.turma);
    }
  
}
