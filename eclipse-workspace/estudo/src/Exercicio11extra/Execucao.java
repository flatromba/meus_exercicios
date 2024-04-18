package Exercicio11extra;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] vetorNumero=new int[10];
		Exercicio11extra exercicio11extra=new Exercicio11extra();
		for (int i=0;i<10;i++) {
		System.out.println("Digite o número");
		vetorNumero[i]=input.nextInt();
		}
		System.out.println("A soma é: "+exercicio11extra.retornaSoma(vetorNumero));
	}
}	