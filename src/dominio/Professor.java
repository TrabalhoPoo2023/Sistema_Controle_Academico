package dominio;

import java.time.LocalDate;

public class Professor extends BasePessoa{
    
    private String cargo;



    public Professor(int codigo, String nome, LocalDate dataNascimento, String nomeUsuario, String senha, String cargo) {
        super(codigo, nome, dataNascimento, nomeUsuario, senha);
        this.cargo = cargo;
    }

    public Professor() {
    }

    public String getCargo() {
        return cargo;
    }


    public void setCargo(String cargo) {
        this.cargo = cargo;
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
