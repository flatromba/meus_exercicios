package Exercicio09easy;
import java.util.Scanner;
public class Execucao{
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite um número");
		int numero=input.nextInt();
		Exercicio09easy exercicio09easy=new Exercicio09easy();
		exercicio09easy.retornaTabuada(numero);		
	}
}