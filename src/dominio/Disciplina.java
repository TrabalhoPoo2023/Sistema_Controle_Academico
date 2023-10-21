package dominio;

import java.util.List;

public class Disciplina extends BaseDadosComuns {
    
    private String ementa;
    private List<Turma> turmas;

    
    public Disciplina(int codigo, String nome, String ementa, List<Turma> turmas) {
        super(codigo, nome);
        this.ementa = ementa;
        this.turmas = turmas;
    }


    public String getNome() {
        return nome;
    }
    public String getEmenta() {
        return ementa;
    }
    public List<Turma> getTurmas() {
        return turmas;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }  
    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }  
    
    @Override
    public void Imprimir(){
        System.out.println("*************************");
        System.out.println("cod: "+this.codigo);
        System.out.println("Nome: "+this.nome);
        System.out.println("Ementa: "+this.ementa);
    } 
}
