import java.util.Scanner;
import servico.ProfessorServico;

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
 case 0:
 this.Sair();
 break;
 default:
 System.out.println("Digite uma opção válida\n");
 }
 } while(continuar != 0);
 }


 private void Professor(){
    int continuar = 99;
 do
 {
 System.out.println("\n\tProfessores\n");
 System.out.println("4. Exibir lista de professores\n");
 System.out.println("5. Exibir turmas de um professor\n");
 System.out.println("6. Sair\n");
 continuar = this.scan.nextInt();
 
 switch(continuar)
 {
 case 4:
 this.ExibirProfessor();
 break;
 case 5:
 this.ExbirTurmas();
 break;
 case 6:
 this.Sair();
 break;
 default:
 System.out.println("Digite uma opção válida\n");
 }
 } while(continuar != 0);
 }

 private void ExibirProfessor(){
   
    ProfessorServico serv = new ProfessorServico();
        for (Professor professor : serv.Listar()) {
            System.out.println("-----------------------------------");
            professor.Imprimir();
        }

        System.out.println("### Final de Execução. ###");        
    }








 private void Aluno(){

 }

 private void Sair(){
 System.out.println("Até a próxima...\n");
 }
}