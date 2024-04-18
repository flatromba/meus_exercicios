package Exercicio21extra;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite sua altura e seu peso");
		float altura=input.nextFloat();
		float peso=input.nextFloat();
		Exercicio21extra exercicio21extra=new Exercicio21extra();
		exercicio21extra.retornaIMC(peso, altura);
	}
}