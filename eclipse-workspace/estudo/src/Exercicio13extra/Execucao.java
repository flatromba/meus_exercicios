package Exercicio13extra;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] vetorIdade=new int[20];
		Exercicio13extra exercicio13extra=new Exercicio13extra();
		for (int i=0;i<20;i++) {
			System.out.println("Digite a idade");
			vetorIdade[i]=input.nextInt();
		}
		float media=exercicio13extra.retornaSomaIdade(vetorIdade)/20;		
		System.out.println("Média das idades: "+media);
	}	
}