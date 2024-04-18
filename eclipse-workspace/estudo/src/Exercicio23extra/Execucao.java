package Exercicio23extra;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite a idade");
		int idade=input.nextInt();
		Exercicio23extra exercicio23extra=new Exercicio23extra();
		exercicio23extra.retornaClasseEleitoral(idade);
	}
}