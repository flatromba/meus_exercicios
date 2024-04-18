package Exercicio19extra;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[]numero=new int[1000];
		Exercicio19extra exercicio19extra=new Exercicio19extra();	
			for (int i=0;i<1000;i++) {
				System.out.println("Digite um número");
				numero[i]=input.nextInt();
			}
			exercicio19extra.retornaSoma(numero);
	}
}

