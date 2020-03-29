package Application;
import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);

	public void itensDoMenu() {
		System.out.println("Press any button to see the menu");
		String button = sc.nextLine();
		
		System.out.println("	Menu	");
		System.out.println();
		System.out.println("(1) Iniciar jogo");
		System.out.println("(2) Multiplayr");
		System.out.println("(3) Tutorial");
		System.out.println("(4) Dificuldade");
	
		Integer numero = sc.nextInt();
		sc.nextLine();
		switch(numero) {
		
		 case 1: Jogador jogador1 = new Jogador();
		 		jogador1.Info();
		 		Perguntas pergunta = new Perguntas();
		 		pergunta.perguntas();
		 
		 		
		 	break;
		 
		 case 2:
			 
			 
			 break;
		 
		 case 3: 
		
			 break;
		 
		 case 4:
			 
			break; 
			 
		 default:
			 return;
			}
		
		
		}
}
