package fakeDB;

import dominio.NotaTrabalho;
import dominio.Aluno;
import dominio.Disciplina;
import dominio.Trabalho;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NotaTrabalhoFakeDB extends BaseGenericaFakeDB<NotaTrabalho> {

    @Override
    public void CarregarDados() {
        this.tabela = new ArrayList<NotaTrabalho>();

        Aluno aluno1 = new Aluno(1, "Mateus", LocalDate.of(1994, 6, 5), "123456", "987654", 20201001);
        Aluno aluno2 = new Aluno(2, "Lucas", LocalDate.of(1993, 6, 5), "123455", "987653", 20201002);
        Aluno aluno3 = new Aluno(3, "Pedro", LocalDate.of(1994, 7, 5), "123454", "987652", 20201003);
        Aluno aluno4 = new Aluno(4, "Tiago", LocalDate.of(1994, 3, 5), "123453", "987651", 20201004);
        Aluno aluno5 = new Aluno(5, "João", LocalDate.of(1995, 2, 25), "123452", "987655", 20201005);
        Aluno aluno6 = new Aluno(6, "Gabriel", LocalDate.of(1996, 4, 15), "123451", "987656", 20201006);

        Disciplina disciplina1 = new Disciplina(1, "Matemática", "Ementa de Matemática");
        Disciplina disciplina2 = new Disciplina(2, "História", "Ementa de História");
        Disciplina disciplina3 = new Disciplina(3, "Física", "Ementa de Física");
        Disciplina disciplina4 = new Disciplina(4, "Química", "Ementa de Química");

        Trabalho trabalho1m = new Trabalho(1, "Trabalho 1", disciplina1);
        Trabalho trabalho2m = new Trabalho(2, "Trabalho 2", disciplina1);

        Trabalho trabalho1h = new Trabalho(3, "Trabalho 1", disciplina2);
        Trabalho trabalho2h = new Trabalho(4, "Trabalho 2", disciplina2);

        Trabalho trabalho1f = new Trabalho(5, "Trabalho 1", disciplina3);
        Trabalho trabalho2f = new Trabalho(6, "Trabalho 2", disciplina3);

        Trabalho trabalho1q = new Trabalho(7, "Trabalho 1", disciplina4);
        Trabalho trabalho2q = new Trabalho(8, "Trabalho 2", disciplina4);


        NotaTrabalho nota1 = new NotaTrabalho(1, 9.0, aluno1, trabalho1m, disciplina1);
        NotaTrabalho nota2 = new NotaTrabalho(2, 8.0, aluno1, trabalho2m, disciplina1);
        NotaTrabalho nota3 = new NotaTrabalho(3, 9.0, aluno1, trabalho1h, disciplina2);
        NotaTrabalho nota4 = new NotaTrabalho(4, 8.0, aluno1, trabalho2h, disciplina2);

        NotaTrabalho nota12 = new NotaTrabalho(11, 9.0, aluno2, trabalho1m, disciplina1);
        NotaTrabalho nota22 = new NotaTrabalho(21, 7.0, aluno2, trabalho2m, disciplina1);
        NotaTrabalho nota32 = new NotaTrabalho(31, 7.0, aluno2, trabalho1h, disciplina2);
        NotaTrabalho nota42 = new NotaTrabalho(41, 5.0, aluno2, trabalho2h, disciplina2);

        NotaTrabalho nota13 = new NotaTrabalho(11, 1.0, aluno3, trabalho1m, disciplina1);
        NotaTrabalho nota23 = new NotaTrabalho(21, 9.0, aluno3, trabalho2m, disciplina1);
        NotaTrabalho nota33 = new NotaTrabalho(31, 9.0, aluno3, trabalho1h, disciplina2);
        NotaTrabalho nota43 = new NotaTrabalho(41, 6.0, aluno3, trabalho2h, disciplina2);

        NotaTrabalho nota14 = new NotaTrabalho(14, 9.0, aluno4, trabalho1f, disciplina3);
        NotaTrabalho nota24 = new NotaTrabalho(24, 8.0, aluno4, trabalho2f, disciplina3);
        NotaTrabalho nota34 = new NotaTrabalho(34, 10.0, aluno4, trabalho1q, disciplina4);
        NotaTrabalho nota44 = new NotaTrabalho(44, 5.0, aluno4, trabalho2q, disciplina4);

        NotaTrabalho nota15 = new NotaTrabalho(15, 2.0, aluno5, trabalho1f, disciplina3);
        NotaTrabalho nota25 = new NotaTrabalho(25, 6.0, aluno5, trabalho2f, disciplina3);
        NotaTrabalho nota35 = new NotaTrabalho(35, 7.0, aluno5, trabalho1q, disciplina4);
        NotaTrabalho nota45 = new NotaTrabalho(45, 7.0, aluno5, trabalho2q, disciplina4);

        NotaTrabalho nota16 = new NotaTrabalho(16, 8.0, aluno6, trabalho1f, disciplina3);
        NotaTrabalho nota26 = new NotaTrabalho(26, 4.0, aluno6, trabalho2f, disciplina3);
        NotaTrabalho nota36 = new NotaTrabalho(36, 10.0, aluno6, trabalho1q, disciplina4);
        NotaTrabalho nota46 = new NotaTrabalho(46, 9.0, aluno6, trabalho2q, disciplina4);

        this.tabela.add(nota1);
        this.tabela.add(nota2);
        this.tabela.add(nota3);
        this.tabela.add(nota4);
        this.tabela.add(nota12);
        this.tabela.add(nota22);
        this.tabela.add(nota32);
        this.tabela.add(nota42);
        this.tabela.add(nota13);
        this.tabela.add(nota23);
        this.tabela.add(nota33);
        this.tabela.add(nota43);
        this.tabela.add(nota14);
        this.tabela.add(nota24);
        this.tabela.add(nota34);
        this.tabela.add(nota44);
        this.tabela.add(nota15);
        this.tabela.add(nota25);
        this.tabela.add(nota35);
        this.tabela.add(nota45);
        this.tabela.add(nota16);
        this.tabela.add(nota26);
        this.tabela.add(nota36);
        this.tabela.add(nota46);
    }

    public NotaTrabalhoFakeDB(){
        super();
    }

    public void imprimirNotas() {
    List<NotaTrabalho> todasAsNotas = getTodasAsNotas();
    for (NotaTrabalho nota : todasAsNotas) {
        System.out.println("Aluno: " + nota.getAluno().getNome());
        System.out.println("Disciplina: " + nota.getDisciplina().getNome());
        System.out.println("Trabalho: " + nota.getTrabalho().getDescricao());
        System.out.println("Nota: " + nota.getNota());
        System.out.println();
    }
}

    private List<NotaTrabalho> getTodasAsNotas() {
        return this.tabela;
    }


}