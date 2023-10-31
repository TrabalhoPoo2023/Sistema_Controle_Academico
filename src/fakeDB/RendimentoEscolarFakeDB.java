package fakeDB;

import java.time.LocalDate;
import java.util.ArrayList;
import dominio.RendimentoEscolar;
import dominio.Trabalho;
import dominio.Aluno;
import dominio.Disciplina;
import dominio.Turma;
import dominio.NotaTrabalho;
import dominio.Professor;

public class RendimentoEscolarFakeDB extends BaseGenericaFakeDB<RendimentoEscolar> {

    @Override
    public void CarregarDados() {

        this.tabela = new ArrayList<RendimentoEscolar>();
        
        Aluno aluno1 = new Aluno(1, "Mateus", LocalDate.of(1994, 6, 5), "123456", "987654", 20201001);
        Aluno aluno2 = new Aluno(2, "Lucas", LocalDate.of(1993, 6, 5), "123455", "987653", 20201002);
        Aluno aluno3 = new Aluno(3, "Pedro", LocalDate.of(1994, 7, 5), "123454", "987652", 20201003);
        Aluno aluno4 = new Aluno(4, "Tiago", LocalDate.of(1994, 3, 5), "123453", "987651", 20201004);
        Aluno aluno5 = new Aluno(5, "João", LocalDate.of(1995, 2, 25), "123452", "987655", 20201005);
        Aluno aluno6 = new Aluno(6, "Gabriel", LocalDate.of(1996, 4, 15), "123451", "987656", 20201006);

        Professor prof1 = new Professor(1, "João", LocalDate.of(1980, 5, 10), "joao123", "senha123", "Professor de Matemática");
        Professor prof2 = new Professor(2, "Maria", LocalDate.of(1975, 7, 15), "maria456", "senha456", "Professor de História");
        Professor prof3 = new Professor(3, "José", LocalDate.of(1985, 3, 20), "jose789", "senha789", "Professor de Física");
        Professor prof4 = new Professor(4, "Ana", LocalDate.of(1989, 2, 5), "ana189", "senha189", "Professor de Química");

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

        Turma turma1 = new Turma(1, 6, new Aluno[] {aluno1, aluno2, aluno3}, new Disciplina[] {disciplina1, disciplina2}, new Professor[] {prof1, prof2});
        Turma turma2 = new Turma(2, 6, new Aluno[] {aluno4, aluno5, aluno6}, new Disciplina[] {disciplina3, disciplina4}, new Professor[] {prof3, prof4});

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

        RendimentoEscolar r1 = new RendimentoEscolar(1, aluno1, turma1, disciplina1, 10.0, 8.0, trabalho1m, nota1, trabalho2m, nota2, 9.0, 9.0);
        RendimentoEscolar r2 = new RendimentoEscolar(2, aluno1, turma1, disciplina2, 5.0, 7.0, trabalho1h, nota3, trabalho2h, nota4, 8.5, 6.8);

        RendimentoEscolar r3 = new RendimentoEscolar(3, aluno2, turma1, disciplina1, 3.0, 9.0, trabalho1m, nota12, trabalho2m, nota22, 8.0, 6.6);
        RendimentoEscolar r4 = new RendimentoEscolar(4, aluno2, turma1, disciplina2, 5.0, 7.0, trabalho1h, nota32, trabalho2h, nota42, 6.0, 6.0);

        RendimentoEscolar r5 = new RendimentoEscolar(5, aluno3, turma1, disciplina1, 10.0, 8.0, trabalho1m, nota13, trabalho2m, nota23, 5.0, 7.6);
        RendimentoEscolar r6 = new RendimentoEscolar(6, aluno3, turma1, disciplina2, 4.0, 7.0, trabalho1h, nota33, trabalho2h, nota43, 7.5, 6.1);

        RendimentoEscolar r7 = new RendimentoEscolar(7, aluno4, turma2, disciplina3, 9.0, 8.0, trabalho1f, nota14, trabalho2f, nota24, 8.5, 8.5);
        RendimentoEscolar r8 = new RendimentoEscolar(8, aluno4, turma2, disciplina4, 3.0, 6.0, trabalho1q, nota34, trabalho2q, nota44, 7.5, 5.5);

        RendimentoEscolar r9 = new RendimentoEscolar(9, aluno5, turma2, disciplina3, 8.0, 2.0, trabalho1f, nota15, trabalho2f, nota25, 4.0, 4.6);
        RendimentoEscolar r10 = new RendimentoEscolar(10, aluno5, turma2, disciplina4, 9.0, 7.0, trabalho1q, nota35, trabalho2q, nota45, 7.0, 7.6);

        RendimentoEscolar r11 = new RendimentoEscolar(11, aluno6, turma2, disciplina3, 4.0, 9.0, trabalho1f, nota16, trabalho2f, nota26, 6.0, 6.3);
        RendimentoEscolar r12 = new RendimentoEscolar(12, aluno6, turma2, disciplina4, 10.0, 8.0, trabalho1q, nota36, trabalho2q, nota46, 9.5, 9.1);

        this.tabela.add(r1);
        this.tabela.add(r2);
        this.tabela.add(r3);
        this.tabela.add(r4);
        this.tabela.add(r5);
        this.tabela.add(r6);
        this.tabela.add(r7);
        this.tabela.add(r8);
        this.tabela.add(r9);
        this.tabela.add(r10);
        this.tabela.add(r11);
        this.tabela.add(r12);
    }

    public RendimentoEscolarFakeDB(){
        super();
    }

    public void ImprimirRendimentos() {
        RendimentoEscolar r1 = tabela.get(0);
        RendimentoEscolar r2 = tabela.get(1);
        RendimentoEscolar r3 = tabela.get(2);
        RendimentoEscolar r4 = tabela.get(3);
        RendimentoEscolar r5 = tabela.get(4);
        RendimentoEscolar r6 = tabela.get(5);
        RendimentoEscolar r7 = tabela.get(6);
        RendimentoEscolar r8 = tabela.get(7);
        RendimentoEscolar r9 = tabela.get(8);
        RendimentoEscolar r10 = tabela.get(9);
        RendimentoEscolar r11 = tabela.get(10);
        RendimentoEscolar r12 = tabela.get(11);

        r1.Imprimir();
        r2.Imprimir();
        r3.Imprimir();
        r4.Imprimir();
        r5.Imprimir();
        r6.Imprimir();
        r7.Imprimir();
        r8.Imprimir();
        r9.Imprimir();
        r10.Imprimir();
        r11.Imprimir();
        r12.Imprimir();
    }
}
