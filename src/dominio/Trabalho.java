package dominio;
public class Trabalho extends BaseIdentificador {
    private String descricao;
    private Disciplina disciplina;
    

    public Trabalho(int codigo, String descricao, Disciplina disciplina) {
        super(codigo);
        this.descricao = descricao;
        this.disciplina = disciplina;
    }
    @Override
    public void Imprimir(){
        System.out.println("*************************");
        System.out.println("Cod: "+ this.codigo);
        System.out.println("Descrição: "+this.descricao);
        System.out.println("Disciplina: "+this.disciplina.nome);
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
}
