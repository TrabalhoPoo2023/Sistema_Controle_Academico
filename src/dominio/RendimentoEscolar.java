package dominio;

public class RendimentoEscolar extends BaseIdentificador {
    private Aluno aluno;
    private Turma turma;
    private Disciplina disciplina;
    private double nota1;
    private double nota2;
    private Trabalho trabalho1;
    private NotaTrabalho notaTrabalho1;
    private Trabalho trabalho2;
    private NotaTrabalho notaTrabalho2;
    private double mediaTrabalhos;
    private double mediaGeral;

public RendimentoEscolar(int codigo, Aluno aluno, Turma turma, Disciplina disciplina, double nota1, double nota2,
            Trabalho trabalho1, NotaTrabalho notaTrabalho1, Trabalho trabalho2, NotaTrabalho notaTrabalho2,
            double mediaTrabalhos, double mediaGeral) {
        super(codigo);
        this.aluno = aluno;
        this.turma = turma;
        this.disciplina = disciplina;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.trabalho1 = trabalho1;
        this.notaTrabalho1 = notaTrabalho1;
        this.trabalho2 = trabalho2;
        this.notaTrabalho2 = notaTrabalho2;
        this.mediaTrabalhos = mediaTrabalhos;
        this.mediaGeral = mediaGeral;
    }


public RendimentoEscolar(int codigo) {
    super(codigo);
}





@Override
    public void Imprimir(){
            System.out.println("*************************");
            System.out.println("Aluno: " + this.aluno.getNome());
            System.out.println("Turma: " + this.turma.getCodigo());
            System.out.println("Disciplina: " + this.disciplina.getNome());
            System.out.println("Nota 1ª Prova: " + this.nota1);
            System.out.println("Nota 2ª Prova: " + this.nota2);
            System.out.println("Trabalho: " + this.trabalho1.getDescricao());
            System.out.println("Nota Trabalho: " + this.notaTrabalho1.getNota());
            System.out.println("Trabalho: " + this.trabalho2.getDescricao());
            System.out.println("Nota Trabalho: " + this.notaTrabalho2.getNota());
            System.out.println("Média Trabalhos: " + this.mediaTrabalhos);
            System.out.println("Média Geral: " + this.mediaGeral);
        }
        



public Aluno getAluno() {
    return aluno;
}



public void setAluno(Aluno aluno) {
    this.aluno = aluno;
}



public Turma getTurma() {
    return turma;
}



public void setTurma(Turma turma) {
    this.turma = turma;
}



public Disciplina getDisciplina() {
    return disciplina;
}



public void setDisciplina(Disciplina disciplina) {
    this.disciplina = disciplina;
}



public double getNota1() {
    return nota1;
}



public void setNota1(double nota1) {
    this.nota1 = nota1;
}



public double getNota2() {
    return nota2;
}



public void setNota2(double nota2) {
    this.nota2 = nota2;
}



public Trabalho getTrabalho1() {
    return trabalho1;
}



public void setTrabalho1(Trabalho trabalho1) {
    this.trabalho1 = trabalho1;
}



public NotaTrabalho getNotaTrabalho1() {
    return notaTrabalho1;
}



public void setNotaTrabalho1(NotaTrabalho notaTrabalho1) {
    this.notaTrabalho1 = notaTrabalho1;
}



public Trabalho getTrabalho2() {
    return trabalho2;
}



public void setTrabalho2(Trabalho trabalho2) {
    this.trabalho2 = trabalho2;
}



public NotaTrabalho getNotaTrabalho2() {
    return notaTrabalho2;
}



public void setNotaTrabalho2(NotaTrabalho notaTrabalho2) {
    this.notaTrabalho2 = notaTrabalho2;
}



public double getMediaTrabalhos() {
    return mediaTrabalhos;
}



public void setMediaTrabalhos(double mediaTrabalhos) {
    this.mediaTrabalhos = mediaTrabalhos;
}



public double getMediaGeral() {
    return mediaGeral;
}



public void setMediaGeral(double mediaGeral) {
    this.mediaGeral = mediaGeral;
}

}
