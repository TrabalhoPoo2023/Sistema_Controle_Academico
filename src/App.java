import java.time.LocalDate;

import dominio.Aluno;
public class App {
    public static void main(String[] args) throws Exception {
       Aluno a = new Aluno(1, "Bruno", LocalDate.of(1997,10,13), "bGon666", "hello123", 5, null);
       System.out.println(a);
    }
}
