// Precisa implementar o metodo impressão e os metodos para obter os atributos mediaTrabalhos e mediaGeral;

package dominio;

import java.util.List;

public class RendimentoEscolar {
    private Aluno aluno;
    private Turma turma;
    private double nota1;
    private double nota2;
    private List<NotaTrabalho> trabalhos;
    private double mediaTrabalhos;
    private double mediaGeral;
    public RendimentoEscolar(Aluno aluno, Turma turma, double nota1, double nota2) {
        this.aluno = aluno;
        this.turma = turma;
        this.nota1 = nota1;
        this.nota2 = nota2;
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


}

