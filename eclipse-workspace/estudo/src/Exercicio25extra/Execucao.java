package Exercicio25extra;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite um número da semana");
		int diaSemana=input.nextInt();
		Exercicio25extra exercicio25extra=new Exercicio25extra();
		exercicio25extra.retornaDiaDaSemana(diaSemana);
	}
}