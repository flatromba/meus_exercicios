package Exercicio14extra;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] vetorIdade=new int[20];
		Exercicio14extra exercicio14extra=new Exercicio14extra();
		for (int i=0;i<20;i++) {
			System.out.println("Digite a idade");
			vetorIdade[i]=input.nextInt();
		}
		System.out.println("Maiores de idade: ");
		exercicio14extra.retornaMaiorIdade(vetorIdade);
	}
}