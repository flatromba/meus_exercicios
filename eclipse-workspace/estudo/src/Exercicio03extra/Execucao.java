package Exercicio03extra;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Exercicio03extra exercicio03extra=new Exercicio03extra();
		System.out.println("Digite o saldo");
		double saldo=input.nextDouble();
		System.out.println("Saldo com reajuste: "+exercicio03extra.retornaReajusteSaldo(saldo));
	}
}