package Exercicio06medio;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Exercicio06medio exercicio06medio=new Exercicio06medio();
		System.out.println("Digite um número");
		int numero=input.nextInt();
		System.out.println("O fatorial de "+numero+" é: "+exercicio06medio.retornaFatorial(numero));
	}
}