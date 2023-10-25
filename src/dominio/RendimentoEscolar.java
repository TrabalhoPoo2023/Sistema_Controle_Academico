package dominio;

import java.util.ArrayList;

public class RendimentoEscolar extends BaseIdentificador{
    private Aluno aluno;
    private Turma turma;
    private double nota1;
    private double nota2;
    private ArrayList<NotaTrabalho> trabalhos;
    private double mediaTrabalhos;
    private double mediaGeral;

    public RendimentoEscolar(int codigo, double nota1, double nota2,
            double mediaTrabalhos, double mediaGeral) {
        super(codigo);
        this.aluno = new Aluno();
        this.turma = new Turma();
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.trabalhos = new ArrayList<NotaTrabalho>();
        this.mediaTrabalhos = mediaTrabalhos;
        this.mediaGeral = mediaGeral;
    }

    public RendimentoEscolar() {
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
    public ArrayList<NotaTrabalho> getTrabalhos() {
        return trabalhos;
    }
    public void setTrabalhos(ArrayList<NotaTrabalho> trabalhos) {
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
    public void CalculoMediaTrabalho(ArrayList <NotaTrabalho> trabalhos){
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

