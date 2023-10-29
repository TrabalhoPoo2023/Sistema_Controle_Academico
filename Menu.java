import java.util.Scanner;

public class Menu {
 private Scanner scan;
 public Menu(){
 this.scan = new Scanner(System.in);
 }
 public void Executar(){
 this.ExibirMenu();
 }
 private void ExibirMenu(){
 int continuar = 99;
 do
 {
 System.out.println("\n\tControle Academicon\n");
 System.out.println("1. Professor\n");
 System.out.println("2. Aluno\n");
 System.out.println("0. Sair\n");
 continuar = this.scan.nextInt();
 
 switch(continuar)
 {
 case 1:
 this.Professor();
 break;
 case 2:
 this.Aluno();
 break;
 case 3:
 this.Sair();
 break;
 default:
 System.out.println("Digite uma opção válida\n");
 }
 } while(continuar != 0);
 }

 
 private void Professor(){
    ProfessorRepositorio pf1 = new ProfessorRepositorio();
    for (Professor professor : pf1.ReadAll()) {
    turma.Imprimir();
    }
 }



 private void Aluno(){

 }

 private void Sair()
 {
 System.out.println("Até a próxima...\n");
 }
}