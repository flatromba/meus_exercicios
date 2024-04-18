package Exercicio09extra;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String nome;
		Exercicio09extra exercicio09extra=new Exercicio09extra();
		System.out.println("Digite o nome");
		nome=input.nextLine();
		exercicio09extra.retornaNome(nome);
	}
}