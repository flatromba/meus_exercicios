package Exercicio05medio;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int numero=0;
		Exercicio05medio exercicio05medio=new Exercicio05medio();
		for (int i=1;i<=5;i++) {
			System.out.println("Digite um número");
			numero=input.nextInt();
		}
		System.out.println("Menor número é: "+exercicio05medio.retornaMenorNumero(numero));
	}
}
//CORREÇÃO