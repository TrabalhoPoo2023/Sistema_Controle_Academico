package dominio;

public class NotaTrabalho extends BaseIdentificador {
    private double nota;
    private Aluno aluno;
    private Trabalho trabalho;
    private Disciplina disciplina;

    public NotaTrabalho(int codigo, double nota, Aluno aluno, Trabalho trabalho, Disciplina disciplina) {
        super(codigo);
        this.nota = nota;
        this.aluno = aluno;
        this.trabalho = trabalho;
        this.disciplina = disciplina;
    }
    

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Trabalho getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(Trabalho trabalho) {
        this.trabalho = trabalho;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public void Imprimir() {
        System.out.println("*************************");
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Nota: " + this.nota);
        System.out.println("Aluno: " + this.aluno.getNome());
        System.out.println("Trabalho: " + this.trabalho.getDescricao());
        System.out.println("Disciplina: " + this.disciplina.getNome());
    }
}
