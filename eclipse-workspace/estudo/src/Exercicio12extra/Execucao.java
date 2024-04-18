package Exercicio12extra;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] vetorIdade=new int[20];
		Exercicio12 exercicio12=new Exercicio12();
		for (int i=0;i<20;i++) {
			System.out.println("Digite a idade");
			vetorIdade[i]=input.nextInt();
		}
		System.out.println("Soma das idades: "+exercicio12.retornaSomaIdade(vetorIdade));
	}
}