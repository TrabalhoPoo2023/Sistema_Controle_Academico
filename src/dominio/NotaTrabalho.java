package dominio;
public class NotaTrabalho extends BaseIdentificador{
    public double nota;
    private Aluno aluno;
    private Trabalho trabalho;


    public NotaTrabalho(int codigo, double nota, Aluno aluno, Trabalho trabalho) {
        super(codigo);
        this.nota = nota;
        this.aluno = aluno;
        this.trabalho = trabalho;
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

     @Override
    public void Imprimir(){
        System.out.println("*************************");
        System.out.println("cod: "+this.codigo);
        System.out.println("nota: "+this.nota);
        System.out.println("Aluno: "+this.aluno.nome);
        System.out.println("Trabalho: "+this.trabalho);
    }
}
