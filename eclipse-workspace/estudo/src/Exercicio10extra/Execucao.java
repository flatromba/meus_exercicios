package Exercicio10extra;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String nome;
		int repeticao;
		Exercicio10extra exercicio10extra=new Exercicio10extra();
		System.out.println("Digite o nome e a quantidade de repetições");
		nome=input.nextLine();
		repeticao=input.nextInt();
		exercicio10extra.retornaNome(nome, repeticao);
	}
}