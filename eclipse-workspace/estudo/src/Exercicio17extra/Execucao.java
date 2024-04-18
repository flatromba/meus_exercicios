package Exercicio17extra;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] numero=new int[20];
		Exercicio17extra exercicio17extra=new Exercicio17extra();
		for (int i=0;i<20;i++) {
			System.out.println("Digite um número");
			numero[i]=input.nextInt();
		}
		exercicio17extra.retornaNumeros0a100(numero);
	}
}