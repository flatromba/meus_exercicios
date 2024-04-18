package Exercicio16extra;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] numero=new int[20];
		Exercicio16extra exercicio16extra=new Exercicio16extra();
		for (int i=0;i<20;i++) {
			System.out.println("Digite um número");
			numero[i]=input.nextInt();
		}
		exercicio16extra.retornaPares(numero);
	}
}