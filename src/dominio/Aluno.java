package dominio;

import java.time.LocalDate;

public class Aluno extends BasePessoa {

    private int periodo;

    public Aluno(int codigo, String nome, LocalDate dataNascimento, String nomeUsuario, String senha, int periodo) {
        super(codigo, nome, dataNascimento, nomeUsuario, senha);
        this.periodo = periodo;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
//metodo utilizado para testes, apenas para impressão
    @Override
    public String toString() {
        return super.toString()+"Aluno [periodo=" + periodo + "]";
    }
}
