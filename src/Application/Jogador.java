package Application;
import java.util.Scanner;

public class Jogador {
	Scanner sc = new Scanner(System.in);
	
	public void Info() {
		System.out.println("Qual seu nome?");
		String name = sc.nextLine();
		System.out.println("Qual seu sobrenome?");
		String secondName = sc.nextLine();
		System.out.println("Qual a sua idade");
		Integer age = sc.nextInt();
		sc.nextLine();
		DadosJogador dados = new DadosJogador(name,secondName,age);
		
	}

}
