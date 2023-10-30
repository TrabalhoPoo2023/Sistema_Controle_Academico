package dominio;

import java.util.List;

public class RendimentoEscolar implements IImpressao{
    private Aluno aluno;
    private Turma turma;
    private double nota1;
    private double nota2;
    private List<NotaTrabalho> trabalhos;
    private double mediaTrabalhos;
    private double mediaGeral;

    public RendimentoEscolar(Aluno aluno, Turma turma, double nota1, double nota2, List<NotaTrabalho> trabalhos,
            double mediaTrabalhos, double mediaGeral) {
        this.aluno = aluno;
        this.turma = turma;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.trabalhos = trabalhos;
        this.mediaTrabalhos = mediaTrabalhos;
        this.mediaGeral = mediaGeral;
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
    public List<NotaTrabalho> getTrabalhos() {
        return trabalhos;
    }
    public void setTrabalhos(List<NotaTrabalho> trabalhos) {
        this.trabalhos = trabalhos;
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
    public void CalculoMediaTrabalho(List <NotaTrabalho> trabalhos){
        double somaNotas = 0.0;
        for(NotaTrabalho nota : trabalhos){
            somaNotas += nota.getNota();
        }
        if (!trabalhos.isEmpty()){
            double mediaTrabalhos = somaNotas/trabalhos.size();
            this.mediaTrabalhos = mediaTrabalhos; 
        }
    }
    public void CalculoMediaGeral(double nota1, double nota2,double mediaTrabalhos ){
        double soma = (nota1 + nota2 + mediaTrabalhos);
        double mediaGeral = soma/3;
        this.mediaGeral = mediaGeral;
    }
    
    @Override
    public void Imprimir(){
        System.out.println("*************************");
        System.out.println("Aluno: "+this.aluno.nome);
        System.out.println("Turma: "+this.turma);
        System.out.println("Nota 1ª Prova: " + this.nota1);
        System.out.println("Nota 2ª Prova: " + this.nota2);
        System.out.println("Trabalhos: " + this.trabalhos);
        System.out.println("Media Trabalhos: " + this.mediaTrabalhos);
        System.out.println("Media Geral: " + this.mediaGeral);
    }

}

