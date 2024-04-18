package Exercicio15extra;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String[] nome=new String[10];
		int[] idade=new int[10];
		Exercicio15extra exercicio15extra=new Exercicio15extra();
		for (int i=0;i<10;i++) {
			System.out.println("Digite o nome");
			nome[i]=input.next();
			System.out.println("Digite a idade");
			idade[i]=input.nextInt();
		}
		exercicio15extra.retornaNomeEIdade(nome, idade);
	}
}