package Exercicio11easy;
import java.util.Scanner;
public class Execucao{
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite um número");
		int numeroDigitado=input.nextInt();
		Exercicio11easy exercicio11easy=new Exercicio11easy();
		exercicio11easy.retornaSequencia(numeroDigitado);
	}
}