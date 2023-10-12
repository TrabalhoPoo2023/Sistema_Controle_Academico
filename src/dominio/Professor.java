package dominio;

import java.time.LocalDate;
import java.util.List;

public class Professor extends BasePessoa{
    
    private String cargo;
    private List<Turma> turmas;

    

    public Professor(int codigo, String nome, LocalDate dataNascimento, String nomeUsuario, String senha,
            String cargo) {
        super(codigo, nome, dataNascimento, nomeUsuario, senha);
        this.cargo = cargo;
    }




    public String getCargo() {
        return cargo;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }



    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }


    @Override
    public void Imprimir(){
        System.out.println("*************************");
        System.out.println("cod: "+this.codigo);
        System.out.println("Professor: "+this.nome);
        System.out.println("Data de Nascimento: "+this.dataNascimento);
        System.out.println("Usuario: "+this.nomeUsuario);
        System.out.println("Senha: "+this.senha);
        System.out.println("Cargo: "+this.cargo);
    }
}
