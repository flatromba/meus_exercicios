package Exercicio04easy;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite o número");
		int numero=input.nextInt();
		Exercicio04easy exercicio04easy=new Exercicio04easy();
		System.out.println("O dobro de "+numero+" é: "+exercicio04easy.retornaDobro(numero));
	}
}