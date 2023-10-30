package dominio;

import java.util.ArrayList;
import java.util.List;

public class Trabalho extends BaseIdentificador {
    private String descricao;
    private Disciplina disciplina;
    
    // Adicione uma variável de classe para manter a lista de trabalhos
    private static List<Trabalho> trabalhos = new ArrayList<>();

    public Trabalho(int codigo, String descricao, Disciplina disciplina) {
        super(codigo);
        this.descricao = descricao;
        this.disciplina = disciplina;
        
        // Adicione o trabalho à lista
        trabalhos.add(this);
    }

    @Override
    public void Imprimir() {
        System.out.println("*************************");
        System.out.println("Código: " + this.codigo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Disciplina: " + this.disciplina.getNome());
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    // Método estático para obter a lista de trabalhos
    public static List<Trabalho> getTrabalhos() {
        return trabalhos;
    }
}
