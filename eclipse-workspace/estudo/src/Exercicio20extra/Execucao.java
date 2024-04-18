package Exercicio20extra;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite um número");
		int numero=input.nextInt();
		Exercicio20extra exercicio20extra=new Exercicio20extra();
		exercicio20extra.retornaDivisivel(numero);
	}
}