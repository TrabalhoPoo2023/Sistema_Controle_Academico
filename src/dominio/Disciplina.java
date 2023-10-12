package dominio;

import java.util.List;

public class Disciplina extends BaseIdentificador {
    
    private String nome;
    private String ementa;
    private List<Turma> turmas;


    public Disciplina(int codigo, String nome, String ementa) {
        super(codigo);
        this.nome = nome;
        this.ementa = ementa;
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
}
